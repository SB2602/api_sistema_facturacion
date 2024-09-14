package com.api.sfacturacion.services;

import com.api.sfacturacion.entities.InvoiceDetails;
import com.api.sfacturacion.repositories.InvoiceDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InvoiceDetailsService {
    private final InvoiceDetailsRepository invoiceDetailsRepository;

    public List<InvoiceDetails> findAll() {
        return invoiceDetailsRepository.findAll();
    }

    public InvoiceDetails findById(Long id) {
        return invoiceDetailsRepository.findById(id).orElseThrow(() -> new RuntimeException("No se encontró el detalle de factura con ID " + id));
    }

    public void saveInvoiceDetails(InvoiceDetails invoiceDetails) {
        invoiceDetailsRepository.save(invoiceDetails);
    }

    public void deleteById(Long id) {
        invoiceDetailsRepository.deleteById(id);
    }

    public List<InvoiceDetails> findByInvoiceId(Long invoiceId) {
        return invoiceDetailsRepository.findByInvoice_Id(invoiceId);
    }

}
