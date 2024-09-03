package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.Suppliers;
import com.api.sfacturacion.services.SuppliersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class SuppliersController {
    private final SuppliersService suppliersService;

    @GetMapping("/suppliers")
    private List<Suppliers> findAll() {
        return suppliersService.findAll();
    }

    @GetMapping("/suppliers/{id}")
    public Suppliers findById(@PathVariable Long id) {
        return suppliersService.findById(id);
    }

    @PostMapping("/suppliers")
    public void saveSuppliers(@RequestBody Suppliers suppliers) {
        suppliersService.saveSuppliers(suppliers);
    }

    @PutMapping("/suppliers")
    private void editById(@RequestBody Suppliers suppliers) {
        suppliersService.saveSuppliers(suppliers);
    }

    @DeleteMapping("/suppliers/{id}")
    public void deleteById(@PathVariable Long id) {
        suppliersService.deleteById(id);
    }

}
