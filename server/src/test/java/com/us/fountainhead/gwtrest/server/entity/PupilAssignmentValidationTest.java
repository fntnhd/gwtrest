package com.us.fountainhead.gwtrest.server.entity;

import com.us.fountainhead.gwtrest.server.validate.ValidationError;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Responsible for testing basic field level validation
 */
public class PupilAssignmentValidationTest {
    
    private static PupilAssignmentValidationTestHelper helper;
    
    public PupilAssignmentValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        helper = new PupilAssignmentValidationTestHelper();
    }

    @Test
    public void testHelperExists() {
        assertNotNull(helper);
    }
}