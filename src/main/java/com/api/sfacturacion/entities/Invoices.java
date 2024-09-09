package com.api.sfacturacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


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
    private long subtotal;
    private BigDecimal impuesto;
    private long total;
}
