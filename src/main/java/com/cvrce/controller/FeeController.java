package com.cvrce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/fees")

public class FeeController {

    @GetMapping("/start")
    public String start(){
        return "landing/fees/fees";
    }
}
