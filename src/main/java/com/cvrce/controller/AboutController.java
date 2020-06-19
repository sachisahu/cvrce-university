package com.cvrce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/about")
public class AboutController {

    @GetMapping("/start")
    public String start() {
        return "landing/about/about";
    }

    @GetMapping("/add")
    public String add() {
        return "landing/about/about-add";
    }

}
