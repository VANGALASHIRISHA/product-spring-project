package com.example.product20.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.product20.model.Product20;
import com.example.product20.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService ps;

    public ProductController(ProductService ps) {
        this.ps = ps;
    }

    @PostMapping("/addProduct")
    public Product20 createProduct(@RequestBody Product20 product) {
        return ps.createProduct(product);
    }

    @GetMapping("/Products")
    public List<Product20> getAllProducts() {
        return ps.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product20 getProductById(@PathVariable Integer id) {
        return ps.getPsById(id);
    }
    @PutMapping("/{id}")
    public Product20 updateProduct(@PathVariable Integer id, @RequestBody Product20 pr) {
        return ps.updatePv(id, pr);
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        return ps.deleteMv(id);
    }
}
