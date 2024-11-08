package com.api.sfacturacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Data
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_producto;
    private String descripcion;
    private Integer precio;
    private Integer stock;


    @ManyToOne
    @JoinColumn(name = "supplier_id")

    private Suppliers supplier;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories category;
}
