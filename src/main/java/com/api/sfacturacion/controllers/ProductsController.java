package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.Products;
import com.api.sfacturacion.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ProductsController {
    private final ProductsService productsService;

    @GetMapping("/products")
    private List<Products> findAll() {
        return productsService.findAll();
    }

    @GetMapping("/products/{id}")
    public Products findById(@PathVariable Long id) {
        return productsService.findById(id);
    }

    @PostMapping("/products")
    public void saveProducts(@RequestBody Products products) {
        productsService.saveProducts(products);
    }

    @PutMapping("/products")
    private void editById(@RequestBody Products products) {
        productsService.saveProducts(products);
    }

    @DeleteMapping("/products/{id}")
    public void deleteById(@PathVariable Long id) {
        productsService.deleteById(id);
    }

}
