package com.makers.makersbnb_coach_support_code.controller;

import com.makers.makersbnb_coach_support_code.model.Planet;
import com.makers.makersbnb_coach_support_code.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlanetsController {
    @Autowired
    PlanetRepository planetRepository;

    // tell Spring Boot this method handles the 'GET "/"' request
    @GetMapping("/")
    public ModelAndView planetsList() {
        return new ModelAndView("/PlanetsList");
    }

    @GetMapping("/mars")
    public ModelAndView marsInfo() {
        ModelAndView marsView = new ModelAndView("/MarsInfo");

        Planet mars = new Planet("The planet Mars is half the size of the Earth.", 21344, "Mars");
        String marsDescription = mars.getDescription();

        marsView.addObject("marsDescription", marsDescription);
        return marsView;
    }

    @GetMapping("/venus")
        public ModelAndView venusInfo() {
        ModelAndView venusView = new ModelAndView("/VenusInfo");
//        Planet venus = new Planet("Venus is the hottest planet in our solar system",38025, "Venus");
//
//        planetRepository.save(venus);
//
        Planet venus = planetRepository.findByName("Venus");

        System.out.println(venus.getName());

        venusView.addObject("venusDescription", venus.getDescription());
        venusView.addObject("venusCircumference", venus.getCircumference());
        return venusView;
        }
    };

