package com.road.dev.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RoadImprovementController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(final Model model) {
        model.addAttribute("title", "Home");

        return "index";
    }

    @RequestMapping(path = "/welcome", method = RequestMethod.GET)
    public String welcome(final Model model) {
        model.addAttribute("title", "Welcome");

        return "welcome";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(final Model model) {
        model.addAttribute("title", "Login");

        return "login";
    }

    @RequestMapping(path = "/logout", method = RequestMethod.GET)
    public String logout(final Model model) {
        model.addAttribute("title", "Logout");

        return "logout";
    }

}
