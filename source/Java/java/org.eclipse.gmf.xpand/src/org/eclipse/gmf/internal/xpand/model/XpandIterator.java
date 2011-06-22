/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.gmf.internal.xpand.model;

/**
 * FIXME [artem] does this look like good citizen? perhaps, having 
 * java.util.Iterator available instead would be better. Or just directly an []
 */
public class XpandIterator {

    private long counter = 0l;

    private long elementCount = 0l;

    public XpandIterator(final long elementCount) {
        this.elementCount = elementCount;
    }

    public Long counter() {
        return new Long(counter);
    }

    public Long elements() {
        return new Long(elementCount);
    }

    public void increment() {
        counter++;
    }

    public Boolean isLastIteration() {
        return Boolean.valueOf(counter + 1 == elementCount);
    }

    public Object isFirstIteration() {
        return Boolean.valueOf(counter == 0);
    }

    public Long counter1() {
        return new Long(counter + 1);
    }

}
