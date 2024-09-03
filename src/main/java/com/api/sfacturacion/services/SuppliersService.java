package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.Suppliers;
import com.api.sfacturacion.repositories.SuppliersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SuppliersService {
    private final SuppliersRepository suppliersRepository;

    public List<Suppliers> findAll() {
        return suppliersRepository.findAll();
    }

    public Suppliers findById(Long id) {
        return suppliersRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro el proveedor con el id+" + id));
    }

    public void saveSuppliers(Suppliers suppliers) {
        suppliersRepository.save(suppliers);
    }

    public void deleteById(Long id) {
        suppliersRepository.deleteById(id);
    }


}
