package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.Categories;
import com.api.sfacturacion.repositories.CategoriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriesService {
    private final CategoriesRepository categoriesRepository;

    public List<Categories> findAll() {

        return categoriesRepository.findAll();

    }

    public Categories findById(Long id) {
        return categoriesRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro la categoria con el id+" + id));
    }

    public void saveCategories(Categories categories) {
        categoriesRepository.save(categories);
    }


    public void deleteById(Long id) {
        categoriesRepository.deleteById(id);
    }
}
