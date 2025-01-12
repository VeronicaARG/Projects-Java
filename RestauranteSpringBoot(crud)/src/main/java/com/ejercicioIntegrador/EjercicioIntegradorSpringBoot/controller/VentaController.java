package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.controller;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Venta;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Producto;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service.IVentaService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VentaController {
    @Autowired
    private IVentaService ventaService;
    
    @PostMapping ("/ventas/crear")
    public String createSale(@RequestBody Venta venta){
        ventaService.createSale(venta);
        return "Venta creada";
    }
    
    @GetMapping ("/ventas")
    @ResponseBody
    public List<Venta> getSales() {
        return ventaService.getSales();
    }
    
    @DeleteMapping("/ventas/eliminar/{id}")
    public String deleteSale(@PathVariable Long id){
        ventaService.deleteSale(id);
        return "Venta eliminada";
    }
    
    @GetMapping ("/ventas/{id}")
            
    ResponseEntity<Venta> findSale(@PathVariable Long id) {
        Venta vent = ventaService.findSale(id);
        if (vent != null) {        
            return new ResponseEntity<> (vent, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<> (vent, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping ("/ventas/editar/{id}")
 
    ResponseEntity<Venta> editSale(@PathVariable Long id,
                               @RequestParam(required = false, name = "fecha") LocalDate newFecha,
                               @RequestParam(required = false, name = "total") Double newTotal,
                               @RequestParam(required = false,  name = "idP") List<Producto> listaP) {
        ventaService.editSale(id,newFecha,newTotal,listaP);
        if (ventaService.findSale(id) != null) {  
            return new ResponseEntity<> (ventaService.findSale(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<> (ventaService.findSale(id), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping ("/ventas/fecha_ventas")
    public String plussingSales(@RequestParam(required = true, name = "fecha") LocalDate fecha_ventas){
        List<Venta> listaVenta = ventaService.getSales();
        Double cant= 0.0;
        Double tot= 0.0;
        for (Venta list:listaVenta) {
            if(list.getFecha_venta().equals(fecha_ventas)) {
                tot = tot + list.getTotal();
                cant = cant + 1.0;
            }
        }
        
        return "El total es: " + (tot) + ", y la cantidad es: " + (cant);
    }
    
    @GetMapping ("/ventas/cantidad_totalP")
    public int totalProductsSales() {
        List<Venta> listaVenta = ventaService.getSales();
        return listaVenta.size();
    }

}