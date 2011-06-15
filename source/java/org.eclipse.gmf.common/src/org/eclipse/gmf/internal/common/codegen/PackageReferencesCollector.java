/*
 * Copyright (c) 2006, 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Anna Karjakina (Borland) - initial API and implementation
 */
package org.eclipse.gmf.internal.common.codegen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;

class PackageReferencesCollector extends ASTVisitor {

    public static void collect(ASTNode node, Collection<Name> resultingQualifiedTypeReferences, Collection<SimpleName> resultingSimpleTypeReferences, Collection<String> resultingImportDeclarations) {
        node.accept(new PackageReferencesCollector(resultingQualifiedTypeReferences, resultingSimpleTypeReferences, resultingImportDeclarations));
    }

    public static void collect(ASTNode node, Collection<Name> resultingQualifiedTypeReferences, Collection<SimpleName> resultingSimpleTypeReferences, Collection<String> resultingImportDeclarations, Collection<String> hardcodedTypeNames) {
        node.accept(new PackageReferencesCollector(resultingQualifiedTypeReferences, resultingSimpleTypeReferences, resultingImportDeclarations, hardcodedTypeNames));
    }

    private Collection<SimpleName> mySimpleTypeReferences;
    private Collection<Name> myQualifiedTypeReferences;
    private Collection<String> myImportDeclarations;
    private Collection<String> myKnownPackages = new HashSet<String>();
    private Collection<String> myHardcodedTypes;

    private PackageReferencesCollector(Collection<Name> resultingTypeReferences, Collection<SimpleName> resultingSimpleTypeReferences, Collection<String> resultingImportDeclarations) {
        this(resultingTypeReferences, resultingSimpleTypeReferences, resultingImportDeclarations, null);
    }

    private PackageReferencesCollector(Collection<Name> resultingTypeReferences, Collection<SimpleName> resultingSimpleTypeReferences, Collection<String> resultingImportDeclarations, Collection<String> hardcodedTypes) {
        super(true);
        myQualifiedTypeReferences = resultingTypeReferences;
        mySimpleTypeReferences = resultingSimpleTypeReferences;
        myImportDeclarations = resultingImportDeclarations;
        myHardcodedTypes = hardcodedTypes;
    }

    private void addQualifiedReference(QualifiedName node) {
        myKnownPackages.add(node.getQualifier().getFullyQualifiedName());
        myQualifiedTypeReferences.add(node);
    }
    
    private void addSimpleReference(SimpleName name) {
        mySimpleTypeReferences.add(name);
    }
    
    private void addImport(Name name) {
        if (name.isQualifiedName()) {
            QualifiedName qName = (QualifiedName) name;
            myImportDeclarations.add(qName.getName().getFullyQualifiedName());
            myKnownPackages.add(qName.getQualifier().getFullyQualifiedName());
        } else {
            addSimpleReference((SimpleName) name);
        }
    }

    protected void typeRefFound(Name node) {
        Name name = node;
        if (node.isQualifiedName()) {
            name = hackRecognizeTypesAndPackagesForTheirLettersCase((QualifiedName) node);
            if (name == null) {
                return;
            }
        }
        if (name.isQualifiedName()) {
            addQualifiedReference((QualifiedName) name);
        } else {
            addSimpleReference((SimpleName) name);
        }
    }
    
    protected Name hackRecognizeTypesAndPackagesForTheirLettersCase(QualifiedName node) {
        Name name = node;
        List<Name> qualifiers = new ArrayList<Name>();
        while (name.isQualifiedName()) {
            qualifiers.add(name);
            name = ((QualifiedName) name).getQualifier();
        }
        qualifiers.add(name);
        for (ListIterator<Name> it=qualifiers.listIterator(qualifiers.size()); it.hasPrevious();) {
            Name packagePart = it.previous();
            if (getHardcodedTypes().contains(packagePart.getFullyQualifiedName())) {
                return packagePart;
            }
            SimpleName lastPart = packagePart.isSimpleName() ? (SimpleName)packagePart : ((QualifiedName)packagePart).getName();
            char[] letters = lastPart.getFullyQualifiedName().toCharArray();
            if (letters.length > 0) {
                if (Character.isUpperCase(letters[0])) {
                    //XXX: Type reference is recognized for its first Upper letter and at least one Lower
                    for (int i=0; i<letters.length; i++) {
                        if (Character.isLowerCase(letters[i])) {
                            return packagePart;
                        }
                    }
                } else {
                    //XXX: Package reference is recognized for all its chars are Lower case or digits
                    for (int i=0; i<letters.length; i++) {
                        if (!(Character.isLowerCase(letters[i]) || Character.isDigit(letters[i]))) {
                            return null;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public Collection<String> getHardcodedTypes() {
        if (myHardcodedTypes == null) {
            myHardcodedTypes = new HashSet<String>();
            initializeDefaultHardcodedTypes(myHardcodedTypes);
        }
        return myHardcodedTypes;
    }

    protected void initializeDefaultHardcodedTypes(Collection<String> container) {
        container.add(SWT.class.getCanonicalName());
        container.add(NLS.class.getCanonicalName());
        container.add(URI.class.getCanonicalName());
    }

    public boolean visit(ImportDeclaration node) {
        if (node.isOnDemand()) {
            myKnownPackages.add(node.getName().getFullyQualifiedName());
        } else {
            addImport(node.getName());
        }
        // not to visit the qualified name in imports
        return false;
    }

    public boolean visit(PackageDeclaration node) {
        // not to visit the qualified name in imports
        return false;
    }

    public boolean visit(SimpleType node) {
        typeRefFound(node.getName());
        return false;
    }

    public boolean visit(TypeDeclaration node) {
        addSimpleReference(node.getName());
        return true;
    }

    public boolean visit(QualifiedName node) {
        typeRefFound(node);
        return false;
    }

}
