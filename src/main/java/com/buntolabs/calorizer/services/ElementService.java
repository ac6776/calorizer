package com.buntolabs.calorizer.services;

import com.buntolabs.calorizer.entities.Element;
import com.buntolabs.calorizer.repos.ElementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementService {
    private ElementRepo repo;

    @Autowired
    public void setRepo(ElementRepo repo) {
        this.repo = repo;
    }

    public List<Element> findAll() {
        return repo.findAll();
    }
}
