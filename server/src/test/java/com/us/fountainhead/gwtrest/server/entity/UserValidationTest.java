package com.us.fountainhead.gwtrest.server.entity;

import com.us.fountainhead.gwtrest.server.validate.ValidationError;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Responsible for testing basic field level validation
 */
public class UserValidationTest {
    
    private static UserValidationTestHelper helper;
    
    public UserValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        helper = new UserValidationTestHelper();
    }

    @Test
    public void testHelperExists() {
        assertNotNull(helper);
    }

    @Test
    public void testNotNullUsername() throws Exception {
        User o = new User();
        o.setUsername(helper.validUsername());
        o.validateUsername();
        
        for(ValidationError e : o.getErrors()) {
            if(e.getText().equals("No username provided")) {
                fail();
                return;
            }
        }
        
        assertTrue(true);      
    }

    @Test
    public void testNullUsername() throws Exception {
        User o = new User();
        o.validateUsername();
        
        for(ValidationError e : o.getErrors()) {
            if(e.getText().equals("No username provided")) {
                assertTrue(true);
                return;
            }
        }
        
        fail();   
    }
}