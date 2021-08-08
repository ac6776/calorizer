package com.buntolabs.calorizer.services;

import com.buntolabs.calorizer.entities.Product;
import com.buntolabs.calorizer.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepo productRepo;

    @Autowired
    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> findAll() {
        return productRepo.findAll();
    }
}
