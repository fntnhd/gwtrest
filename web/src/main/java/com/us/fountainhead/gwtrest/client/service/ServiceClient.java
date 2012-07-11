package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.Window;


/**
 *
 * @author Andrews
 */
public abstract class ServiceClient {
    
    private static final String CONTENT = "Content-Type";
    private static final String JSON = "application/json";

    private String baseUrl() {
        String url = GWT.getHostPageBaseURL();
        if(url.endsWith("secure/")) {
            url = url.replace("secure/", "");
        }
        return url;
    }
         
    protected final RequestBuilder get(String relativeUrl) {
        String url = baseUrl() + relativeUrl;
        RequestBuilder request = new RequestBuilder(RequestBuilder.GET, url); 
        request.setHeader(CONTENT, JSON);
        
        return request;
    }
         
    protected final RequestBuilder post(String relativeUrl) {
        String url = baseUrl() + relativeUrl;
        RequestBuilder request = new RequestBuilder(RequestBuilder.POST, url);
        request.setHeader(CONTENT, JSON);
        
        return request;
    }
         
    protected final RequestBuilder put(String relativeUrl) {
        String url = baseUrl() + relativeUrl;
        RequestBuilder request = new RequestBuilder(RequestBuilder.PUT, url);
        request.setHeader(CONTENT, JSON);
        
        return request;
    }
         
    protected final RequestBuilder delete(String relativeUrl) {
        String url = baseUrl() + relativeUrl;
        RequestBuilder request = new RequestBuilder(RequestBuilder.DELETE, url);
        request.setHeader(CONTENT, JSON);
        
        return request;
    }
}
