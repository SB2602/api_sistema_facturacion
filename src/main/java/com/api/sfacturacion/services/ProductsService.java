package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.Products;
import com.api.sfacturacion.repositories.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductsRepository productsRepository;

    public List<Products> findAll() {

        return productsRepository.findAll();

    }

    public Products findById(Long id) {
        return productsRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro la categoria con el id+" + id));
    }

    public void saveProducts(Products products) {
        productsRepository.save(products);
    }


    public void deleteById(Long id) {
        productsRepository.deleteById(id);
    }
}
