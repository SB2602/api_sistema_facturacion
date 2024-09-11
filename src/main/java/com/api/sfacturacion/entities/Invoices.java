package com.api.sfacturacion.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Entity
@Data
@Table(name = "invoices")
@AllArgsConstructor
@NoArgsConstructor
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String numero_factura;
    private Date fecha;
    private BigDecimal impuesto;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clients cliente;

    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<InvoiceDetails> detalles;

    private Double total;
}
