
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Basic
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private Double total;
    @OneToMany
    private List<Producto> listaProductos;

    public Venta() {
    }

    public Venta(Long codigo_venta, LocalDate fecha_venta, Double total, List<Producto> listaProductos) {
        this.codigo_venta = codigo_venta;
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.listaProductos = listaProductos;
    }
    
    
}
