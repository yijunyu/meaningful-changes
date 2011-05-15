/*
 *+------------------------------------------------------------------------+
 *| Licensed Materials - Property of IBM                                   |
 *| (C) Copyright IBM Corp. 2002, 2005.  All Rights Reserved.              |
 *|                                                                        |
 *| US Government Users Restricted Rights - Use, duplication or disclosure |
 *| restricted by GSA ADP Schedule Contract with IBM Corp.                 |
 *+------------------------------------------------------------------------+
 */
package org.eclipse.gmf.runtime.common.core.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.gmf.runtime.common.core.service.Service.ProviderDescriptor;
import org.eclipse.gmf.runtime.common.core.util.EnumeratedType;

/**
 * An enumeration of provider execution strategies.
 * <P>
 * Each service provider has a <code>ProviderPriority</code> that is declared
 * in its extension descriptor. It is the
 * {@link org.eclipse.gmf.runtime.common.core.service.ExecutionStrategy} that
 * determines how service provider priorities are used to select a provider to
 * service each client request. For example, if the
 * {@link org.eclipse.gmf.runtime.common.core.service.ExecutionStrategy#FIRST} 
 * is used, the provider with the highest priority will give an answer to the
 * request.
 * 
 * @see org.eclipse.gmf.runtime.common.core.service
 * 
 * @author khussey
 * @canBeSeenBy %partners
 */
public abstract class ExecutionStrategy extends EnumeratedType {

	/**
	 * The list of pre-defined provider priorities.
	 */
	public static final ProviderPriority[] PRIORITIES =
		{
			ProviderPriority.HIGHEST,
			ProviderPriority.HIGH,
			ProviderPriority.MEDIUM,
			ProviderPriority.LOW,
			ProviderPriority.LOWEST };

	/**
	 * An internal unique identifier for provider execution strategies.
	 */
	private static int nextOrdinal = 0;

	/**
	 * Executes an operation on the first provider of the highest priority
	 * that provides the operation.
	 */
	public static final ExecutionStrategy FIRST =
		new ExecutionStrategy("First") { //$NON-NLS-1$
		public List execute(Service service, IOperation operation) {
			List results = Collections.EMPTY_LIST;

			for (int i = 0; i < PRIORITIES.length; i++) {
				List targets = getProviders(service, this, PRIORITIES[i], operation);

				if (!targets.isEmpty()) {
					results = Collections.singletonList(operation.execute((IProvider) targets.get(0)));
					break;
				}
			}
			return results;
		}
		public List getUncachedProviders(
			Service service,
			ProviderPriority priority,
			IOperation operation) {

			List providers = getProviders(service, priority);

			for (ListIterator i = providers.listIterator(); i.hasNext();) {
				ProviderDescriptor descriptor = (ProviderDescriptor) i.next();
				if (descriptor.provides(operation)) {
					return Collections.singletonList(descriptor.getProvider());
				}
			}
			return Collections.EMPTY_LIST;
		}
	};

	/**
	 * Executes an operation on the last provider of the lowest priority
	 * that provides the operation.
	 */
	public static final ExecutionStrategy LAST =
		new ExecutionStrategy("Last") { //$NON-NLS-1$
		public List execute(Service service, IOperation operation) {
			List results = Collections.EMPTY_LIST;

			for (int i = PRIORITIES.length - 1; i >= 0; i--) {
				List targets = getProviders(service, this, PRIORITIES[i], operation);
				int size = targets.size();

				if (size != 0) {
					results = Collections.singletonList(
						operation.execute(
							(IProvider) targets.get(size - 1)));
					break;
				}
			}
			return results;
		}
		public List getUncachedProviders(
				Service service,
				ProviderPriority priority,
				IOperation operation) {

				List providers = getProviders(service, priority);

				for (ListIterator i = providers.listIterator(providers.size()); i.hasPrevious();) {
					ProviderDescriptor descriptor = (ProviderDescriptor) i.previous();
					if (descriptor.provides(operation)) {
						return Collections.singletonList(descriptor.getProvider());
					}
				}
				return Collections.EMPTY_LIST;
			}
	};

	/**
	 * Executes an operation on all providers that provide the operation, in
	 * order from highest to lowest priority.
	 */
	public static final ExecutionStrategy FORWARD =
		new ExecutionStrategy("Forward") { //$NON-NLS-1$
		public List execute(Service service, IOperation operation) {
			List results = new ArrayList();

			for (int i = 0; i < PRIORITIES.length; i++) {
				List targets = getProviders(service, this, PRIORITIES[i], operation);

				for (int j = 0; j < targets.size(); j++) {
					results.add(operation.execute((IProvider) targets.get(j)));
				}
			}
			return results;
		}
	};

	/**
	 * Executes an operation on all providers that provide the operation, in
	 * reverse order from lowest to highest priority.
	 */
	public static final ExecutionStrategy REVERSE =
		new ExecutionStrategy("Reverse") { //$NON-NLS-1$
		public List execute(Service service, IOperation operation) {
			List results = new ArrayList();

			for (int i = PRIORITIES.length - 1; i >= 0; i--) {
				List targets = getProviders(service, this, PRIORITIES[i], operation);

				for (int j = targets.size() - 1; j >= 0; j--) {
					results.add(operation.execute((IProvider) targets.get(j)));
				}
			}
			return results;
		}
	};

	/**
	 * The list of values for this enumerated type.
	 */
	private static final ExecutionStrategy[] VALUES =
		{ FIRST, LAST, FORWARD, REVERSE };

	/**
	 * Constructs a new execution strategy with the specified name.
	 *
	 * @param name The name of the new execution strategy.
	 */
	protected ExecutionStrategy(String name) {
		super(name, nextOrdinal++);
	}

	/**
	 * Constructs a new execution strategy with the specified name and ordinal.
	 *
	 * @param name The name of the new execution strategy.
	 * @param ordinal The ordinal for the new execution strategy.
	 */
	protected ExecutionStrategy(String name, int ordinal) {
		super(name, ordinal);
	}

	/**
	 * Retrieves the list of constants for this enumerated type.
	 *
	 * @return The list of constants for this enumerated type.
	 */
	protected List getValues() {
		return Collections.unmodifiableList(Arrays.asList(VALUES));
	}

	/**
	 * Executes the specified operation on providers obtained from the
	 * specified service, according to this execution strategy.
	 *
	 * @param service The service from which to obtain the providers.
	 * @param operation The operation to be executed.
	 * @return The list of results.
	 */
	public abstract List execute(Service service, IOperation operation);

	/**
	 * Retrieves a list of providers of the specified priority that provide the
	 * specified operation.
	 * 
	 * @param service The service used by the strategy
	 * @param priority The priority of providers to be retrieved.
	 * @param operation The operation that the provides must provide.
	 * @return A list of uncached providers.
	 */
	public List getUncachedProviders(
		Service service,
		ProviderPriority priority,
		IOperation operation) {

		List targets = new ArrayList();

		for (Iterator i = getProviders(service, priority).iterator(); i.hasNext();) {
			ProviderDescriptor descriptor = (ProviderDescriptor) i.next();
			if (descriptor.provides(operation)) {
				targets.add(descriptor.getProvider());
			}
		}
		return targets;
	}

	/**
	 * Retrieves a list of providers of the specified priority.
	 * 
	 * @param service The service used by the strategy
	 * @param priority The priority of providers to be retrieved.
	 * @return A list of providers of the specified priority.
	 */
	protected final List getProviders(Service service, ProviderPriority priority) {
		return service.getProviders(priority); 
	}

	/**
	 * Retrieves a list of providers of the specified priority that provide the
	 * specified operation. If this service is optimized, the result will be
	 * cached the first time it is retrieved. If caching is pessimistic, the 
	 * providers from the cache will be checked first. 
	 * 
	 * @param service The service used by the strategy
	 * @param strategy The strategy used by the service
	 * @param priority The priority of providers to be retrieved.
	 * @param operation The operation that the provides must provide.
	 * @return A list of providers (from the cache, if appropriate).
	 */
	protected final List getProviders(
		Service service,
		ExecutionStrategy strategy,
		ProviderPriority priority,
		IOperation operation) {
		return service.getProviders(strategy, priority, operation); 
	}
}