package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.RequestBuilder;

/**
 *
 * @author Andrews
 */
public abstract class EntityServiceClient {
    
    private static final String ACCEPT = "Accept";
    private static final String CONTENT = "Content-Type";
    private static final String JSON = "application/json";
    
    private static final String FIND_BY_ID = "/findById/";
    private static final String FIND_ALL = "/findAll";
    private static final String CREATE = "/create";
    private static final String UPDATE = "/update";
    private static final String DELETE = "/delete/";
   
    protected RequestBuilder findByIdRequest(String id) {
        String url = GWT.getHostPageBaseURL() + entity() + FIND_BY_ID + id;
        RequestBuilder request = new RequestBuilder(RequestBuilder.GET, url);
        request.setHeader(ACCEPT, JSON);
        return request;
    }
    
    protected RequestBuilder findAllRequest() {
        String url = GWT.getHostPageBaseURL() + entity() + FIND_ALL;
        RequestBuilder request = new RequestBuilder(RequestBuilder.GET, url);
        request.setHeader(ACCEPT, JSON);
        return request;
    }
    
    protected RequestBuilder addRequest() {
        String url = GWT.getHostPageBaseURL() + entity() + CREATE;
        RequestBuilder request = new RequestBuilder(RequestBuilder.POST, url);
        request.setHeader(CONTENT, JSON);
        return request;
    }
    
    protected RequestBuilder updateRequest(String id) {
        String url = GWT.getHostPageBaseURL() + entity() + UPDATE;
        RequestBuilder request = new RequestBuilder(RequestBuilder.PUT, url);
        request.setHeader(CONTENT, JSON);
        return request;
    }
    
    protected RequestBuilder deleteRequest(String id) {
        String url = GWT.getHostPageBaseURL() + entity() + DELETE + id;
        RequestBuilder request = new RequestBuilder(RequestBuilder.DELETE, url);
        request.setHeader(CONTENT, JSON);
        return request;
    }
    
    protected abstract String entity();
    
}
