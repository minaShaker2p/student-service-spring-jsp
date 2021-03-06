package com.mina.studentservice.web.controller;

import com.mina.studentservice.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {
        boolean isValidUser = loginService.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invlid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);
        return "welcome";
    }
}
