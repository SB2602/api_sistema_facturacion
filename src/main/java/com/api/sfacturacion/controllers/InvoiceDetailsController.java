package com.api.sfacturacion.controllers;

import com.api.sfacturacion.entities.InvoiceDetails;
import com.api.sfacturacion.services.InvoiceDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class InvoiceDetailsController {
    private final InvoiceDetailsService invoiceDetailsService;

    @GetMapping("/invoice-details")
    public List<InvoiceDetails> findAll() {
        return invoiceDetailsService.findAll();
    }

    @GetMapping("/invoice-details/{id}")
    public InvoiceDetails findById(@PathVariable Long id) {
        return invoiceDetailsService.findById(id);
    }

    @PostMapping("/invoice-details")
    public void saveInvoiceDetails(@RequestBody InvoiceDetails invoiceDetails) {
        invoiceDetailsService.saveInvoiceDetails(invoiceDetails);
    }

    @PutMapping("/invoice-details/{id}")
    private void editById(@PathVariable Long id, @RequestBody InvoiceDetails invoiceDetails) {
        invoiceDetails.setId(id);
        invoiceDetailsService.saveInvoiceDetails(invoiceDetails);
    }

    @DeleteMapping("/invoice-details/{id}")
    public void deleteById(@PathVariable Long id) {
        invoiceDetailsService.deleteById(id);
    }
}
