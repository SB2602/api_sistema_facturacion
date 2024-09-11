package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.Categories;
import com.api.sfacturacion.services.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")// Permite peticiones desde Angular
public class CategoriesController {
    private final CategoriesService categoriesService;

    @GetMapping("/categories")
    private List<Categories> findAll() {
        return categoriesService.findAll();
    }

    @GetMapping("/categories/{id}")
    public Categories findById(@PathVariable Long id) {
        return categoriesService.findById(id);
    }

    @PostMapping("/categories")
    public void saveCategories(@RequestBody Categories categories) {
        categoriesService.saveCategories(categories);
    }

    @PutMapping("/categories/{id}")
    private void editById(@PathVariable Long id, @RequestBody Categories categories) {
        categories.setId(id);
        categoriesService.saveCategories(categories);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteById(@PathVariable Long id) {
        categoriesService.deleteById(id);
    }

}
