package com.buntolabs.calorizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private ThingService service;

    @Autowired
    public void setService(ThingService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String notes(Model model) {
        model.addAttribute("things", service.getThings());
        return "main";
    }
}
