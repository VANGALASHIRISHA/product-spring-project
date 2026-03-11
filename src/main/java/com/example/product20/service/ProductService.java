package com.example.product20.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product20.model.Product20;
import com.example.product20.repository.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository pr;

    public ProductService(ProductRepository pr) {
        this.pr = pr;
    }

    public Product20 createProduct(Product20 product) {
        return pr.save(product);
    }

    public List<Product20> getAllProducts() {
        return pr.findAll();
    }

    public Product20 getPsById(Integer id) {
        return pr.findById(id).orElse(null);
    }

    public Product20 updatePv(Integer id, Product20 updateProduct) {
        Product20 old = pr.findById(id).orElse(null);
        if (old != null) {
            old.setName(updateProduct.getName());
            old.setPrice(updateProduct.getPrice());
            old.setQuantity(updateProduct.getQuantity());
            old.setCategory(updateProduct.getCategory());
            return pr.save(old);
        }
        return null;
    }

    public String deleteMv(Integer id) {
        pr.deleteById(id);
        return "Product Deleted: " + id;
    }
}
