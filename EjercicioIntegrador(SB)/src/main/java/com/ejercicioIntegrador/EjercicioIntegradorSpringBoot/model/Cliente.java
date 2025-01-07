package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Basic
    private Long id_cliente;
    private String nombre;
    private String apellido;
    private String dni;
    @OneToOne
    @JoinColumn(name="una_venta_codigo_venta", referencedColumnName= "codigo_venta")
    private Venta unaVenta;


    public Cliente() {
    }

    public Cliente(Long id_cliente, String nombre, String apellido, String dni, Venta unaVenta) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.unaVenta = unaVenta;
    }



 


    
}
