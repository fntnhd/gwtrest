package com.us.fountainhead.gwtrest.server.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Put page flow logic in this class
 */
@Controller
public class PageController {

    @RequestMapping(value = "/secure/myhome", method = RequestMethod.GET)
    public String myHome() {
        return "secure/home";
    }

}
