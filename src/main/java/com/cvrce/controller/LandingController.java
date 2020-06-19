package com.cvrce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LandingController {

    @GetMapping("/landing")
    public String landing() {
        return "landing/landing";
    }

}
