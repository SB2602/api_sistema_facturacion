package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.Invoices;
import com.api.sfacturacion.repositories.InvoicesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoicesService {
    private final InvoicesRepository invoicesRepository;

    public List<Invoices> findAll() {

        return invoicesRepository.findAll();

    }

    public Invoices findById(Long id) {
        return invoicesRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontro la factura con el id+" + id));
    }

    public Invoices saveInvoices(Invoices invoices) {
        return invoicesRepository.save(invoices); // Devolver la factura guardada con el ID
    }


    public void deleteById(Long id) {
        invoicesRepository.deleteById(id);
    }
}
