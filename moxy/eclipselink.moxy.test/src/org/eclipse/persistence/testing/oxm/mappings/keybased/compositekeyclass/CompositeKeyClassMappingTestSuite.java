/*******************************************************************************
* Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
* This program and the accompanying materials are made available under the
* terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
* which accompanies this distribution.
* The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
* and the Eclipse Distribution License is available at
* http://www.eclipse.org/org/documents/edl-v10.php.
*
* Contributors:
*     bdoughan - Oct 29/2009 - 2.0 - Initial implementation
******************************************************************************/
package org.eclipse.persistence.testing.oxm.mappings.keybased.compositekeyclass;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CompositeKeyClassMappingTestSuite extends TestCase {

    public static Test suite() {
        TestSuite suite = new TestSuite("Key Class Test Cases");
        suite.addTestSuite(AttributeTestCases.class);
        suite.addTestSuite(ElementTestCases.class);
        suite.addTestSuite(SelfAttributeTestCases.class);
        suite.addTestSuite(SelfElementTestCases.class);
        suite.addTestSuite(SingleNodeTestCases.class);
        return suite;
    }

}
