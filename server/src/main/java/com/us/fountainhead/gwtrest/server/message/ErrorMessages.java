package com.us.fountainhead.gwtrest.server.message;

/**
 *
 * Application error messages
 */
public interface ErrorMessages {
    public static final String INVALID_EMAIL = "Invalid email format";
    public static final String INVALID_CREDENTIAL = "Invalid credential";
    public static final String INACTIVE_USER = "Inactive user";
    public static final String REQUIRED = "No {0} provided";
    public static final String MAX_LENGTH = "Max length for {0} is {1}";
    public static final String DUPLICATE = "Duplicate {0}";
    public static final String INVALID_DATE_RANGE = "{0} end date must come after the start date";
}
