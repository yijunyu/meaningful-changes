/*
 * <copyright>
 *
 * Copyright (c) 2005-2007 Sven Efftinge and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.gmf.internal.xpand.expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.internal.xpand.Activator;
import org.eclipse.gmf.internal.xpand.BuiltinMetaModel;
import org.eclipse.gmf.internal.xpand.ResourceManager;
import org.eclipse.gmf.internal.xpand.ResourceMarker;
import org.eclipse.gmf.internal.xpand.eval.EvaluationListener;
import org.eclipse.gmf.internal.xpand.util.ClassLoadContext;
import org.eclipse.gmf.internal.xpand.xtend.ast.Extension;
import org.eclipse.gmf.internal.xpand.xtend.ast.XtendResource;

/**
 * @author Sven Efftinge
 * @author Arno Haase
 */
public class ExecutionContextImpl implements ExecutionContext {

    private final Map<String, Variable> variables = new HashMap<String, Variable> ();

    private final Map<String, Variable> globalVars = new HashMap<String, Variable> ();

    private ClassLoadContext contextClassLoader;

    private EvaluationListener evaluationListener;

    /**
     * this field is conceptually final, i.e. it is set only at object construction time. To simplify implementation, it is however technically not
     *  final. This is done so that the cloneWith/WithoutResource methods can delegate to cloneContext and afterwards modify the instance. That 
     *  provides cloneContext as a single method for subclasses to override.
     */
    private ResourceMarker currentResource;

	private final ResourceManager resourceManager;

    public ExecutionContextImpl(ResourceManager resourceManager) {
        this (resourceManager, (Collection<Variable>) null);
    }
    
    public ExecutionContextImpl(ResourceManager resourceManager, Collection<Variable> globalVars) {
        this (resourceManager, null, null, globalVars);
    }

    public ExecutionContextImpl(ResourceManager resourceManager, ResourceMarker resource, Collection<Variable> variables, Collection<Variable> globalVars) {
        this.resourceManager = resourceManager;
		this.currentResource = resource;
		if (variables != null) {
			for (Variable v : variables) {
				this.variables.put(v.getName(), v);
			}
		}
        if (globalVars != null) {
        	for (Variable v : globalVars) {
        		this.globalVars.put(v.getName(), v);
        	}
		}
    }

    // copy constuctor
    protected ExecutionContextImpl(ExecutionContextImpl original) {
    	this.resourceManager = original.resourceManager;
    	this.currentResource = original.currentResource;
    	this.variables.putAll(original.variables);
    	this.globalVars.putAll(original.globalVars);
    	this.contextClassLoader = original.contextClassLoader;
    	this.evaluationListener = original.evaluationListener;
    }

    /*
     * Need this for code completion only? move to proposal computer than
     */
    @SuppressWarnings("unchecked")
	public EClassifier[] findTypesForPrefix(final String prefix) {
    	final EPackage[] importedNamespaces;
    	final String typeName = TypeNameUtil.getTypeName(prefix);
    	final String typesMetamodelName = TypeNameUtil.getMetaModelName(typeName);
        // TODO filter importedNamespaces with metamodel name (use ePackage.nsPrefix for metamodel name? 
    	final String collectionTypeName = TypeNameUtil.getCollectionTypeName(prefix);
    	final String simpleTypeName;
    	// XXX handle cases like "metamodelName!" and "List[" as prefixes
        if (TypeNameUtil.isQualifiedName(typeName)) {
        	EPackage exactNamespace = findImportedNamespace(TypeNameUtil.withoutLastSegment(typeName));
        	if (exactNamespace == null) {
        		return new EClassifier[0];
        	} else {
        		importedNamespaces = new EPackage[] { exactNamespace };
        	}
            simpleTypeName = TypeNameUtil.getLastSegment(typeName);
        } else {
        	importedNamespaces = getAllVisibleModels();
        	simpleTypeName = TypeNameUtil.toCanonicalNameFromAlias(typeName);
        }
        if (collectionTypeName != null) {
            if (!BuiltinMetaModel.isCollectionMetaType(collectionTypeName)) {
				return new EClassifier[0];
			}
        }
        final List<EClassifier> result = new ArrayList<EClassifier>();
        for (final EPackage namespace : importedNamespaces) {
        	if (simpleTypeName == null || simpleTypeName.trim().length() == 0) {
        		result.addAll(namespace.getEClassifiers());
        	} else {
        		result.addAll(filterByNamePrefix(simpleTypeName, namespace.getEClassifiers()));
        	}
        }
        if (collectionTypeName == null) {
            return result.toArray(new EClassifier[result.size()]);
        }
        EClassifier[] rv = new EClassifier[result.size()];
        final Iterator<EClassifier> iterator = result.iterator();
        for (int i = 0; i < rv.length; i++) {
        	rv[i] = BuiltinMetaModel.getCollectionType(collectionTypeName, iterator.next());
        }
        return rv;
    }

	private EPackage findImportedNamespace(String namespace) {
    	assert namespace != null;
    	LinkedList<EPackage> potentialMatches = new LinkedList<EPackage>();
    	potentialMatches.addAll(Arrays.asList(getAllVisibleModels()));
    	String[] namespaceChain = namespace.split(SyntaxConstants.NS_DELIM);
    	EPackage returnValue = null;
		for (String namespacePart : namespaceChain) {
			LinkedList<EPackage> subPackages = new LinkedList<EPackage>();
			returnValue = null;
			for (EPackage candidate : potentialMatches) {
				if (candidate.getName().equals(namespacePart)) {
					subPackages.addAll(candidate.getESubpackages());
					returnValue = candidate;
					break; // no more than one package with specified namespacePart 
				}
			}
			potentialMatches = subPackages;
		}
		return returnValue;
	}

    private static <T extends ENamedElement> Collection<T> filterByNamePrefix(final String namePrefix, final Collection<? extends T> knownNamedElements) {
        final Set<T> result = new HashSet<T>();
        for (T t : knownNamedElements) {
            if (t.getName().startsWith(namePrefix)) {
            	result.add(t);
            }
        }
        return result;
    }

    /**
     * {@link ClassLoadContext} to use in {@link #loadClass(String)}.
     * @param classLoader loader to use or null to use default system-wide
     */
    public void setContextClassLoader(ClassLoadContext classLoadContext) {
    	this.contextClassLoader = classLoadContext;
    }

    public Class<?> loadClass(String value) {
    	// FIXME delegate to resourcemanager or Environment
    	try {
    		if (contextClassLoader != null) {
    			Class<?> c = contextClassLoader.load(value);
    			if (c != null) {
    				return c;
    			}
    		}
    		return Class.forName(value);
    	} catch (ClassNotFoundException ex) {
    		ex.getMessage();
    		// IGNORE?
    	}
    	return null;
    }

	protected EPackage[] getAllVisibleModels() {
		String[] importedNamespaces = getImportedNamespaces();
		assert importedNamespaces != null;
		// TODO respect meta-models imported not only with nsURI
		LinkedList<EPackage> result = new LinkedList<EPackage>();
		for (String namespace : importedNamespaces) {
			EPackage pkg = Activator.findMetaModel(namespace);
			if (pkg != null) {
				result.add(pkg);
			}
		}
		if (result.isEmpty()) {
			// hack for tests
			result.add(EcorePackage.eINSTANCE);
		}
//		result.add(BuiltinMetaModel.VOID.getEPackage());
		return result.toArray(new EPackage[result.size()]);
	}

    public EClassifier getTypeForName(String name) {
    	final String simpleTypeName = TypeNameUtil.toCanonicalNameFromAlias(TypeNameUtil.getSimpleName(TypeNameUtil.getTypeName(name)));
    	final String collectionTypeName = TypeNameUtil.getCollectionTypeName(name);
    	for (EClassifier potentialMatch : findTypesForPrefix(name)) {
    		// we don't know the order types get returned from #findTypesForPrefix, thus, need to 
    		// look for exact match
    		if (collectionTypeName != null) {
    			assert  BuiltinMetaModel.isParameterizedType(potentialMatch);
    			if (BuiltinMetaModel.getInnerType(potentialMatch).getName().equals(simpleTypeName)) {
    				return potentialMatch;
    			}
    		} else {
    			if (potentialMatch.getName().equals(simpleTypeName)) {
    				return potentialMatch;
    			}
    		}
       	}
    	return null;
    }

    protected String[] getImportedNamespaces() {
    	if (currentResource() instanceof XtendResource) {
    		return ((XtendResource) currentResource()).getImportedNamespaces();
    	}
    	return new String[0];
    }

    protected String[] getImportedExtensions() {
    	if (currentResource() instanceof XtendResource) {
    		return ((XtendResource) currentResource()).getImportedExtensions();
    	}
    	return new String[0];
    }

    public ExecutionContext cloneContext() {
        return new ExecutionContextImpl(this);
    }

    protected final ResourceManager getResourceManager() {
    	return resourceManager;
    }

    public Variable getVariable(final String name) {
        return variables.get(name);
    }

    public Collection<Variable> getVisibleVariables() {
        return Collections.unmodifiableCollection(variables.values());
    }

    public Collection<Variable> getGlobalVariables() {
        return Collections.unmodifiableCollection(globalVars.values());
    }

    public Variable getGlobalVariable(String name) {
    	return globalVars.get(name);
    }

	@SuppressWarnings("unchecked")
	public ExecutionContext cloneWithVariable(final Variable... vars) {
        final ExecutionContextImpl result = (ExecutionContextImpl) cloneContext();
        for (Variable v : vars) {
        	result.variables.put(v.getName(), v);
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T extends ExecutionContext> T cloneWithVariable(Collection<Variable> v) {
    	return (T) cloneWithVariable(v.toArray(new Variable[v.size()]));
    }

    @SuppressWarnings("unchecked")
    public ExecutionContext cloneWithoutVariables() {
        final ExecutionContextImpl result = (ExecutionContextImpl) cloneContext();
        result.variables.clear();
        return result;
    }

    @SuppressWarnings("unchecked")
    public ExecutionContext cloneWithResource(final ResourceMarker ns) {
        final ExecutionContextImpl ctx = (ExecutionContextImpl) cloneContext();
        ctx.currentResource = ns;
        return ctx;
    }

    public ResourceMarker currentResource() {
        return currentResource;
    }

    private Set<Extension> allExtensions = null;

	public Set<Extension> getAllExtensions() {
        if (allExtensions == null) {
            allExtensions = new HashSet<Extension>();
            final ResourceMarker res = currentResource();
            if (res != null) {
                final String[] extensions = getImportedExtensions();
                for (String extension : extensions) {
                    final XtendResource extFile = resourceManager.loadXtendResource(extension);
                    if (extFile == null) {
						throw new RuntimeException("Unable to load extension file : " + extension);
					}
                    final ExecutionContext ctx = cloneWithResource(extFile);
                    final List<Extension> extensionList = extFile.getPublicExtensions(resourceManager);
                    for (Extension element : extensionList) {
                        element.init(ctx);
                        allExtensions.add(element);
                    }
                }
                if (res instanceof XtendResource) {
                    final List<Extension> extensionList = ((XtendResource) res).getExtensions();
                    for (Extension element : extensionList) {
                        element.init(this);
                        allExtensions.add(element);
                    }
                }
            }
        }
        return allExtensions;
    }

    public Extension getExtension(final String functionName, final EClassifier[] parameterTypes) {
        return PolymorphicResolver.getExtension(getAllExtensions(), functionName, Arrays.asList(parameterTypes));
    }

    public EvaluationListener getEvaluationListener() {
    	return evaluationListener;
    }

    public void setEvaluationListener(EvaluationListener listener) {
    	this.evaluationListener = listener;
    }
}
