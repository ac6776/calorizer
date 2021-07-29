package com.buntolabs.calorizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThingService {
    private Repo repo;

    @Autowired
    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public List<Thing> getThings() {
        return repo.findAll();
    }
}
