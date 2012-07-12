package com.us.fountainhead.gwtrest.server.service;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.us.fountainhead.gwtrest.client.service.SessionService;
import com.us.fountainhead.gwtrest.server.security.SecuredUser;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

/**
 * Provides access to session attributes
 */
public class SessionServiceServlet extends RemoteServiceServlet implements SessionService {

    /**
     * Get the current secured user
     */
    @Override
    public String getCurrentUser() {
        SecuredUser securedUser = (SecuredUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (securedUser != null) {
            com.us.fountainhead.gwtrest.server.entity.User u = securedUser.getUser();
            ObjectMapper mapper = new ObjectMapper();
            String json = null;
            try {
                json = mapper.writeValueAsString(u);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return json;
        }

        return null;
    }

    /**
     * Get the requested entity
     */
    public String getEntity(String name) {
        return (String) getThreadLocalRequest().getSession().getAttribute(name);
    }
}

