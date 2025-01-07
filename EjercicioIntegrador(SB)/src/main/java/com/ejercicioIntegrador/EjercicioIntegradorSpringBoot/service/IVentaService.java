
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Producto;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Venta;
import java.time.LocalDate;
import java.util.List;


public interface IVentaService {
    public void createSale(Venta venta);
    
    public void deleteSale(Long id);
    
    public List<Venta> getSales();
    
    public Venta findSale(Long id);
    
    public void editSale(Long id, LocalDate newFecha_venta, Double newTotal, List<Producto> newProdu);
    
}

