package com.ecommerce.ProductService.Controller;

import com.ecommerce.ProductService.DTOs.ProductDto;
import com.ecommerce.ProductService.Models.Product;
import com.ecommerce.ProductService.Service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public @ResponseBody ProductDto getProductById(@PathVariable("id") Long id){
        return productService.getProductDto();
    }
    @PostMapping("")
    public String createProduct(@RequestBody Product product){
        return "Product created. "+ product.getName() + product.getPrice();
    }


}
