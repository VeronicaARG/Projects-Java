
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Producto;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Venta;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    @Autowired
    private IVentaRepository ventaRepo;

    @Override
    public void createSale(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public void deleteSale(Long id) {
        ventaRepo.deleteById(id);
    }

    @Override
    public List<Venta> getSales() {
        List<Venta> listaVenta = ventaRepo.findAll();
        return listaVenta;
    }

    @Override
    public Venta findSale(Long id) {
        Venta ventaFind = ventaRepo.findById(id).orElse(null);
        return ventaFind;
    }

    @Override
    public void editSale(Long id, LocalDate newFecha_venta, Double newTotal, List<Producto> newProdu) {
        Venta vent = this.findSale(id);
        if(vent != null){
            vent.setFecha_venta(newFecha_venta);
            vent.setTotal(newTotal);
            vent.setListaProductos(newProdu);
            this.createSale(vent);
        }
    }
}
