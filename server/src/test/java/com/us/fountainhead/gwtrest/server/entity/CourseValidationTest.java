package com.us.fountainhead.gwtrest.server.entity;

import com.us.fountainhead.gwtrest.server.validate.ValidationError;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Responsible for testing basic field level validation
 */
public class CourseValidationTest {
    
    private static CourseValidationTestHelper helper;
    
    public CourseValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        helper = new CourseValidationTestHelper();
    }

    @Test
    public void testHelperExists() {
        assertNotNull(helper);
    }
}