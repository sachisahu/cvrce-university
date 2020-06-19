package com.cvrce.controller;


import jdk.jfr.Registered;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/input")
public class InputController {
    @GetMapping("/start")
    public String start(){
        return "product/input";
    }
}
