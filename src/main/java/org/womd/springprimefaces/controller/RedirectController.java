package org.womd.springprimefaces.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RedirectController {

    private static final Logger LOG = LoggerFactory
            .getLogger(RedirectController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request,
                                  HttpServletResponse httpServletResponse) {
        return "redirect:" + request.getRequestURL().append("index.xhtml").toString();
    }
}
