package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.Invoices;
import com.api.sfacturacion.services.InvoicesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class InvoicesController {
    private final InvoicesService invoicesService;

    @GetMapping("/invoices")
    private List<Invoices> findAll() {
        return invoicesService.findAll();
    }

    @GetMapping("/invoices/{id}")
    public Invoices findById(@PathVariable Long id) {
        return invoicesService.findById(id);
    }

    @PostMapping("/invoices")
    public void saveInvoices(@RequestBody Invoices invoices) {
        invoicesService.saveInvoices(invoices);
    }

    @PutMapping("/invoices")
    private void editById(@RequestBody Invoices invoices) {
        invoicesService.saveInvoices(invoices);
    }

    @DeleteMapping("/invoices/{id}")
    public void deleteById(@PathVariable Long id) {
        invoicesService.deleteById(id);
    }


}
