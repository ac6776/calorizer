package com.buntolabs.calorizer.controllers;

import com.buntolabs.calorizer.services.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NutritionController {
    private ElementService service;

    @Autowired
    public void setService(ElementService service) {
        this.service = service;
    }

    @GetMapping("/n")
    public String showNutritious(Model model) {
        model.addAttribute("nutritious", service.findAll());
        return "nutritions";
    }
}
