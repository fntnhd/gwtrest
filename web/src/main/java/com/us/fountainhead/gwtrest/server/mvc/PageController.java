package com.us.fountainhead.gwtrest.server.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Andrews
 */
@Controller
public class PageController {
    
    @RequestMapping(value = "/secure/pupil", method = RequestMethod.GET)
    public String pupil() {
        return "secure/PupilView";
    }
    
}
