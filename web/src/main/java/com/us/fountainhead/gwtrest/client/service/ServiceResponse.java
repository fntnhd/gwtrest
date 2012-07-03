package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 *
 */
public abstract class ServiceResponse extends JavaScriptObject {
    
    protected ServiceResponse() {}
    
    public final native JsArray<ValidationError> getErrorList() /*-{
    return this.errorList;
    }-*/;
    
    
    
}
