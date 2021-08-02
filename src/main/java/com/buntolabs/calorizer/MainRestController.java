package com.buntolabs.calorizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/api")
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
