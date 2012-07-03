package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Andrews
 */
public class ValidationError extends JavaScriptObject {
    
    protected ValidationError() {}
    
    public final native String getText() /*-{
    return this.text;    
    }-*/;
    
    public final native String getProperty() /*-{
    return this.property;    
    }-*/;
    
}
