package com.us.fountainhead.gwtrest.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.us.fountainhead.gwtrest.client.entity.User;

/**
 * Provides access to session attributes
 */
@RemoteServiceRelativePath("sessionService")
public interface SessionService extends RemoteService {

    /**
     *
     * @return The JSON representation of the current user
     */
    public String getCurrentUser();

    /**
     *
     * @param name Name of the entity in the session
     * @return The JSON representation of the entity
     */
    public String getEntity(String name);

}
