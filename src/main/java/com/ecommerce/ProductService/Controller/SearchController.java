package com.ecommerce.ProductService.Controller;

import com.ecommerce.ProductService.Models.GenericProduct;
import com.ecommerce.ProductService.Models.Product;
import com.ecommerce.ProductService.Service.GenericProductService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private final GenericProductService genericProductService;

    public SearchController(GenericProductService genericProductService){
        this.genericProductService=genericProductService;
    }

    @GetMapping("/generate")
    public ResponseEntity generateProducts(){
        return ResponseEntity.ok(genericProductService.generateAllProducts());
    }

    @GetMapping("")
    public ResponseEntity<List<GenericProduct>> searchAllProducts(@RequestParam(required = false) String q){
        return ResponseEntity.ok(genericProductService.searchAllProducts());
    }

    @GetMapping("/page")
    public ResponseEntity<Page<GenericProduct>> findByPage(@RequestParam int pageNo, @RequestParam int pageSize, @RequestParam String sortBy){
        return ResponseEntity.ok(genericProductService.findAllProductsBypage(pageNo,pageSize,sortBy));
    }
}
