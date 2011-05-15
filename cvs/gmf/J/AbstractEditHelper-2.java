/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2005.  All Rights Reserved.                    |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.emf.type.core.edithelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IContainerDescriptor;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.ISpecializationType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.GetEditContextCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.MoveElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

/**
 * Abstract edit helper implementation. Implements the default edit command
 * algorithm, which returns a composite command containing the following:
 * <OL>
 * <LI>'before' commands from matching element types and  specializations</LI>
 * <LI>'instead' command from this edit helper</LI>
 * <LI>'after' commands from matching element types and specializations</LI>
 * </OL>
 * <P>
 * The before and after commands are obtained by consulting the edit helper advice that
 * is bound to the edit helper context in the edit request. Edit helper advice can
 * be inherited from supertypes.
 * <P>
 * Clients should subclass this class when creating new edit helpers.
 * 
 * @author ldamus
 */
public abstract class AbstractEditHelper
	implements IEditHelper {
	
	/**
	 * Map of the default containment features keyed on EClass. Each value is an
	 * EReference.
	 */
	private Map defaultContainmentFeatures = new HashMap();

	/**
	 * Implements the default edit command algorithm, which returns a composite
	 * command containing the following:
	 * <OL>
	 * <LI>'before' commands from matching element type specializations</LI>
	 * <LI>'instead' command from this edit helper</LI>
	 * <LI>'after' commands from matching element type specializations</LI>
	 * </OL>
	 */
	public ICommand getEditCommand(IEditCommandRequest req) {

		CompositeCommand command = createCompositeCommand(req);
		
		// Get 'before' commands from matching element type
		// specializations
		IEditHelperAdvice[] advice = getEditHelperAdvice(req);

		if (advice != null) {
			for (int i = 0; i < advice.length; i++) {
				IEditHelperAdvice nextAdvice = advice[i];

				// Before commands
				ICommand beforeAdvice = nextAdvice.getBeforeEditCommand(req);

				if (beforeAdvice != null) {
					command.compose(beforeAdvice);
				}
			}
		}
		
		// Get 'instead' command from this edit helper
		ICommand insteadCommand = getInsteadCommand(req);
		
		if (insteadCommand == UnexecutableCommand.INSTANCE) {
			// The operation is not permitted
			return null;
			
		} else if (insteadCommand != null) {
			command.compose(insteadCommand);	
		}

		// Get 'after' commands from matching element type
		// specializations
		if (advice != null) {
			for (int i = 0; i < advice.length; i++) {
				IEditHelperAdvice nextAdvice = advice[i];

				// After commands
				ICommand afterAdvice = nextAdvice.getAfterEditCommand(req);

				if (afterAdvice != null) {
					command.compose(afterAdvice);
				}
			}
		}
		
		return command.isEmpty() ? null
			: command;
	}
	
	/**
	 * Gets the array of edit helper advice for this request.
	 * 
	 * @param req the edit request
	 * @return the edit helper advice, or <code>null</code> if there is none
	 */
	protected IEditHelperAdvice[] getEditHelperAdvice(IEditCommandRequest req) {

		Object editHelperContext = req.getEditHelperContext();
		return ElementTypeRegistry.getInstance().getEditHelperAdvice(
			editHelperContext);
	}

	/**
	 * Creates a new composite command.
	 * <P>
	 * Subclasses may override to provide their own kind of composite command.
	 * 
	 * @param label
	 *            the command label
	 * @return a new composite command
	 */
	protected CompositeCommand createCompositeCommand(IEditCommandRequest req) {
		
		return new CompositeCommand(req.getLabel()) {
			
			public CommandResult getCommandResult() {
				CommandResult result = super.getCommandResult();
				
				if (result.getStatus().getSeverity() == IStatus.OK) {
					Object returnObject = null;
					
					if (result.getReturnValue() instanceof List) {
						List returnValue = (List) result.getReturnValue();
						
						if (returnValue.size() > 0) {
							returnObject = returnValue.get(0);
						}
						
					} else {
						returnObject = result.getReturnValue();
					}
					result = new CommandResult(result.getStatus(), returnObject);
				}
				return result;
			};
		};
	}

	/**
	 * Gets my command to do the work described in <code>req</code>.
	 * <P>
	 * Delegates to the more specific methods in this class to actually get the
	 * command. Subclasses should override these more specific methods.
	 * 
	 * @param req
	 *            the edit request
	 * @return the command to do the requested work, or <code>null</code> if I
	 *         don't support the requested work.
	 */
	protected ICommand getInsteadCommand(IEditCommandRequest req) {

		if (req instanceof CreateRelationshipRequest) {
			initializeDefaultFeature((CreateElementRequest) req);
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);

		} else if (req instanceof CreateElementRequest) {
			initializeDefaultFeature((CreateElementRequest) req);
			return getCreateCommand((CreateElementRequest) req);

		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);

		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);

		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);

		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);

		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);

		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);

		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);

		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);

		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gmf.runtime.emf.core.type.IEditHelper#getContainedValues(org.eclipse.emf.ecore.EObject,
	 *      org.eclipse.emf.ecore.EReference)
	 */
	public List getContainedValues(EObject eContainer, EReference feature) {
		return Arrays.asList(ElementTypeRegistry.getInstance()
			.getContainedTypes(eContainer, feature));
	}

	/**
	 * Gets the command to configure a new element of my kind. By default,
	 * returns <code>null</code>. Subclasses may override to provide their
	 * command.
	 * 
	 * @param req
	 *            the configure request
	 * @return the configure command
	 */
	protected ICommand getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * Gets the command to create a new relationship in an element of my kind.
	 * By default, returns <code>null</code>. Subclasses may override to
	 * provide their command.
	 * 
	 * @param req
	 *            the create relationship request
	 * @return the create relationship command
	 */
	protected ICommand getCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		return new CreateRelationshipCommand(req);
	}

	/**
	 * Gets the command to create a new element in an element of my kind.
	 * Subclasses may override to provide their command.
	 * 
	 * @param req
	 *            the create request
	 * @return the create command
	 */
	protected ICommand getCreateCommand(CreateElementRequest req) {
		return new CreateElementCommand(req);
	}
	
	/**
	 * Sets the default feature in <code>req</code>, if there is no
	 * containment feature already in the request.
	 * 
	 * @param req
	 *            the create request
	 */
	public void initializeDefaultFeature(CreateElementRequest req) {

		if (req.getContainmentFeature() == null) {

			// First, try to find the feature from the element type
			ISpecializationType specializationType = (ISpecializationType) req.getElementType().getAdapter(ISpecializationType.class);
			
			if (specializationType != null) {
				IContainerDescriptor containerDescriptor = specializationType.getEContainerDescriptor();

				if (containerDescriptor != null) {
					EReference[] features = containerDescriptor
						.getContainmentFeatures();
					
					if (features != null) {

						for (int i = 0; i < features.length; i++) {

							Object editHelperContext = req
								.getEditHelperContext();
							EClass eClass = null;

							if (editHelperContext instanceof EClass) {
								eClass = (EClass) editHelperContext;
								
							} else if (editHelperContext instanceof EObject) {
								eClass = ((EObject) editHelperContext).eClass();
								
							} else if (editHelperContext instanceof IElementType) {
								eClass = ((IElementType) editHelperContext)
									.getEClass();
							}

							if (eClass != null
								&& eClass.getEAllReferences().contains(
									features[i])) {
								// Use the first feature
								req.setContainmentFeature((features[i]));
								return;
							}
						}
					}
				}
			}

			// Next, try to get a default feature
			EClass eClass = req.getElementType().getEClass();
			
			if (eClass != null) {
				req.setContainmentFeature(getDefaultContainmentFeature(eClass));
			}
		}
	}
	
	/**
	 * Gets the default feature to contain the <code>eClass</code>.
	 * <P>
	 * Returns <code>null</code> by default. Subclasses should override to
	 * provide the default feature, if there is one.
	 * 
	 * @param eClass
	 *            the EClass
	 * @return the default feature
	 */
	protected EReference getDefaultContainmentFeature(EClass eClass) {
		EReference result = (EReference) getDefaultContainmentFeatures().get(
				eClass);

		if (result == null) {
			List superTypes = new ArrayList(eClass.getEAllSuperTypes());
			Collections.reverse(superTypes);

			Iterator i = superTypes.iterator();
			
			while (i.hasNext() && result == null) {
				EClass nextSuperType = (EClass) i.next();
				result = (EReference) getDefaultContainmentFeatures().get(
						nextSuperType);
			}
		}
		return result;
	}
	
	protected Map getDefaultContainmentFeatures() {
		return defaultContainmentFeatures;
	}

	/**
	 * Gets the command to set a value of an element of my kind. By default,
	 * returns <code>null</code>. Subclasses may override to provide their
	 * command.
	 * 
	 * @param req
	 *            the set request
	 * @return the set command
	 */
	protected ICommand getSetCommand(SetRequest req) {
		return new SetValueCommand(req);
	}

	/**
	 * Gets the command to create or return the edit context element for the
	 * creation of a new element of my kind (e.g., when creating a relationship,
	 * the relationship may be owned by the source or target, or some ancestor
	 * of one or the other, or both). By default, returns a command
	 * that returns a <code>null</code> edit context.
	 * Subclasses may override to provide their command.
	 * 
	 * @param req
	 *            the get edit context request
	 * @return the get edit context command
	 */
	protected ICommand getEditContextCommand(GetEditContextRequest req) {
		return new GetEditContextCommand(req);
	}

	/**
	 * Gets the command to destroy a child of an element of my kind. By default,
	 * returns <code>null</code>. Subclasses may override to provide their
	 * command.
	 * 
	 * @param req
	 *            the destroy request
	 * @return the destroy command
	 */
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		return new DestroyElementCommand(req);
	}

	/**
	 * Gets the command to remove a reference from an element of my kind. By
	 * default, returns <code>null</code>. Subclasses may override to provide
	 * their command.
	 * 
	 * @param req
	 *            the destroy reference request
	 * @return the destroy reference command
	 */
	protected ICommand getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return new DestroyReferenceCommand(req);
	}

	/**
	 * Gets the command to duplicate a child in an element of my kind. By
	 * default, returns <code>null</code>. Subclasses may override to provide
	 * their command.
	 * 
	 * @param req
	 *            the duplicate request
	 * @return the duplicate command
	 */
	protected ICommand getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * Gets the command to move an element into an element of my kind. By
	 * default, returns <code>null</code>. Subclasses may override to provide
	 * their command.
	 * 
	 * @param req
	 *            the move request
	 * @return the move command
	 */
	protected ICommand getMoveCommand(MoveRequest req) {
		return new MoveElementCommand(req);
	}

	/**
	 * Gets the command to change the source or target of a reference in an
	 * element of my kind. By default, returns <code>null</code>. Subclasses
	 * may override to provide their command.
	 * 
	 * @param req
	 *            the reorient reference request
	 * @return the reorient reference command
	 */
	protected ICommand getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return null;
	}

	/**
	 * Gets the command to change the source or target of a relationship in an
	 * element of my kind. By default, returns <code>null</code>. Subclasses
	 * may override to provide their command.
	 * 
	 * @param req
	 *            the reorient relationship request
	 * @return the reorient relationship command
	 */
	protected ICommand getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return null;
	}
}