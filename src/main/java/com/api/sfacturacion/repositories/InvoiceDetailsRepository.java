package com.api.sfacturacion.repositories;

import com.api.sfacturacion.entities.InvoiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDetailsRepository extends JpaRepository<InvoiceDetails, Long> {
    List<InvoiceDetails> findByInvoice_Id(Long invoiceId);
}
