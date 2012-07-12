package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.us.fountainhead.gwtrest.client.entity.User;

/**
 * Access session attributes
 */
public interface SessionServiceAsync {

    public void getCurrentUser(AsyncCallback<String> callback);

    public void getEntity(String name, AsyncCallback<String> callback);

}
