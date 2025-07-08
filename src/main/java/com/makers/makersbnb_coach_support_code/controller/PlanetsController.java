package com.makers.makersbnb_coach_support_code.controller;

import com.makers.makersbnb_coach_support_code.model.Planet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlanetsController {
    // tell Spring Boot this method handles the 'GET "/"' request
    @GetMapping("/")
    public ModelAndView planetsList() {
        return new ModelAndView("/PlanetsList");
    }

    @GetMapping("/mars")
    public ModelAndView marsInfo() {
        ModelAndView marsView = new ModelAndView("/MarsInfo");

        Planet mars = new Planet("The planet Mars is half the size of the Earth.", 21344);
        String marsDescription = mars.getDescription();

        marsView.addObject("marsDescription", marsDescription);
        return marsView;
    }
}
