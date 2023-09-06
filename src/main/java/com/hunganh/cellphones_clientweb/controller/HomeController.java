package com.hunganh.cellphones_clientweb.controller;

import com.hunganh.cellphones_clientweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String getHome(Model model) {
        model.addAttribute("smartphones", productService
                .getAllProduct("smartphone", 10));

        model.addAttribute("tablets", productService
                .getAllProduct("tablet", 5));

        model.addAttribute("laptops", productService
                .getAllProduct("laptop", 10));

        model.addAttribute("headphones", productService
                .getAllProduct("headphone", 5));

        model.addAttribute("monitors", productService
                .getAllProduct("monitor", 5));

        model.addAttribute("smartwatches", productService
                .getAllProduct("smartwatch", 5));

        model.addAttribute("smarthomes", productService
                .getAllProduct("smarthome", 5));

        model.addAttribute("tivis", productService
                .getAllProduct("tivi", 5));
        return "index";
    }

}
