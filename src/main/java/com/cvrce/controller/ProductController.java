package com.cvrce.controller;


import com.cvrce.domain.ProductEntity;
import com.cvrce.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping
    public String viewHomePage(Model model){
        List<ProductEntity> listProducts=service.listAll();

        model.addAttribute("listProducts",listProducts);

        return "index";
    }
}
