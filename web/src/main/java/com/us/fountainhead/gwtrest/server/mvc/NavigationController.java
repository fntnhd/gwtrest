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
    
    @RequestMapping(value = "/listPupils", method = RequestMethod.GET)
    public String listPupils() {
        return "PupilView";
    }
    
}
