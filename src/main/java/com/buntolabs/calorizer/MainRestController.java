package com.buntolabs.calorizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/v1")
public class MainRestController {
    private ThingService service;

    @Autowired
    public void setService(ThingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Thing> getThings() {
        return service.getThings();
    }
}
