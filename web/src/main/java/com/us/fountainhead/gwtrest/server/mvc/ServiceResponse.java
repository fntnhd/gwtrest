package com.us.fountainhead.gwtrest.server.mvc;

import com.us.fountainhead.gwtrest.server.validate.ValidationError;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrews
 */
public abstract class ServiceResponse {
    
    private List<ValidationError> errorList;
    
    public ServiceResponse() {
        errorList = new ArrayList<ValidationError>();
    }
    
    public List<ValidationError> getErrorList() {
        return errorList;
    }
    
    public void setErrorList(List<ValidationError> errorList) {
        this.errorList = errorList;
    }
    
}
