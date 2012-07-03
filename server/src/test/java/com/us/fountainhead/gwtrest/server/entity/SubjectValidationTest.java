package com.us.fountainhead.gwtrest.server.entity;

import com.us.fountainhead.gwtrest.server.validate.ValidationError;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Responsible for testing basic field level validation
 */
public class SubjectValidationTest {
    
    private static SubjectValidationTestHelper helper;
    
    public SubjectValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        helper = new SubjectValidationTestHelper();
    }

    @Test
    public void testHelperExists() {
        assertNotNull(helper);
    }
}