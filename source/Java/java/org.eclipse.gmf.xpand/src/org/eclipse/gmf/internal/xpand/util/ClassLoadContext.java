package org.eclipse.gmf.internal.xpand.util;

public abstract class ClassLoadContext {

	public abstract Class<?> load(String qualifiedName);

	public static class Naive extends ClassLoadContext {
		private final ClassLoader[] myClassLoaders;

		public Naive(ClassLoader... classLoaders) {
			this.myClassLoaders = classLoaders;
		}

		@Override
		public Class<?> load(String qualifiedName) {
			for (ClassLoader cl : myClassLoaders) {
				try {
					return cl.loadClass(qualifiedName);
				} catch (Exception ex) {
					// IGNORE
				}
			}
			return null;
		}
	}
}
