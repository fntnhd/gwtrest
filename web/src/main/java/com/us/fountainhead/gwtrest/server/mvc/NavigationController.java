package com.us.fountainhead.gwtrest.server.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Andrews
 */
@Controller
public class NavigationController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    @RequestMapping(value = "/pupil", method = RequestMethod.GET)
    public String pupil() {
        return "PupilView";
    }
    
}
