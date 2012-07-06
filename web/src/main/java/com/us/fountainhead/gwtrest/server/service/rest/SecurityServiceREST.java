package com.us.fountainhead.gwtrest.server.service.rest;

import com.us.fountainhead.gwtrest.server.entity.User;
import com.us.fountainhead.gwtrest.server.service.SecurityService;
import com.us.fountainhead.gwtrest.server.validate.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Andrews
 */
@Controller
public class SecurityServiceREST {

    private static final String JSON = "Accept=application/json";
    @Autowired
    private SecurityService service;

    @RequestMapping(method = RequestMethod.POST, value = "/securityService/findUserByUsername", headers = JSON)
    public @ResponseBody
    FindUserByUsernameResponse findUserByUsername(@RequestBody FindUserByUsernameRequest request) {
        FindUserByUsernameResponse response = new FindUserByUsernameResponse();

        try {
            String username = request.getUsername();
            response.setUser(service.findUserByUsername(username));
        } catch (ValidationException ex) {
            response.setErrorList(ex.getErrors());
        }

        return response;
    }

    public static class FindUserByUsernameResponse extends ServiceResponse {

        private User user;

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }
    
    public static class FindUserByUsernameRequest {
        
        private String username;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/securityService/test", headers = JSON)
    public @ResponseBody
    FindUserByUsernameRequest test(@RequestParam("username") String username) {
        FindUserByUsernameRequest response = new FindUserByUsernameRequest();

        response.setUsername(username);

        return response;
    }
}
