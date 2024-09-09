package com.api.sfacturacion.repositories;

import com.api.sfacturacion.entities.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoices, Long> {
}
