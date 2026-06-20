package com.ecommerce.ProductService.Service;

import com.ecommerce.ProductService.Models.GenericProduct;
import com.ecommerce.ProductService.Repository.GenericProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GenericProductService {

    private final GenericProductRepository genericProductRepository;

    public GenericProductService(GenericProductRepository genericProductRepository){
        this.genericProductRepository=genericProductRepository;
    }


    private static final String[] ProductNames = {
            "TV", "Headphones", "Smartphone", "Laptop", "Tablet",
            "Camera", "Speaker", "Drone", "Gaming Console", "Smartwatch",
            "Fitness Tracker", "External Hard Drive", "Monitor", "Router",
            "Printer", "Keyboard", "Mouse", "Earbuds", "Projector", "Desk"
    };
    public boolean generateAllProducts() {
        List<GenericProduct> productList = new ArrayList<>();
        for(int i=0;i<20;i++){
            Random random = new Random();
            GenericProduct genericProduct = new GenericProduct(ProductNames[i], random.nextInt(1000));
            productList.add(genericProduct);
        }
        genericProductRepository.saveAll(productList);
        return true;
    }

    public List<GenericProduct> searchAllProducts() {
        return genericProductRepository.findAll();
    }

    public Page<GenericProduct> findAllProductsBypage(int pageNo, int pageSize, String sortBy) {

        switch (sortBy){
            case "id-asc":
                return genericProductRepository.findAll(PageRequest.of(pageNo, pageSize,Sort.Direction.ASC, "id"));
            case "name-desc":
                return genericProductRepository.findAll(PageRequest.of(pageNo, pageSize,Sort.Direction.DESC, "name"));
            default:
                return genericProductRepository.findAll(PageRequest.of(pageNo, pageSize));

        }
    }
}
