package com.cvrce.controller;


import com.cvrce.dto.LoginDto;
import com.cvrce.service.IUserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app/login")
public class LoginController {

    @Autowired
    private IUserProfileService userProfileService;

    @GetMapping("/start")
    public String start(ModelMap modelMap) {
        modelMap.addAttribute("dto", new LoginDto());
        return "landing/login/login";
    }

    @PostMapping
    public String login(ModelMap modelMap, @ModelAttribute("dto") LoginDto loginDto) {
        boolean isValidUser = userProfileService.validateLogin(loginDto);
        if (isValidUser) {
            return "/home/dashboard";
        } else {
            modelMap.addAttribute("message", "Username or password is incorrect");
            return "landing/login/login";
        }
    }
    @GetMapping("/signup")
    public String signup(ModelMap modelMap) {
        modelMap.addAttribute("dto", new LoginDto());
        return "landing/login/signup";
    }

    @PostMapping("/signup")
    public String signupSubmit(ModelMap modelMap, @ModelAttribute("dto") LoginDto loginDto) {
        boolean isSaved = userProfileService.saveUser(loginDto);
        return "landing/login/login";
    }

}
