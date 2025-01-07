

package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.controller;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Producto;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service.IProductoService;
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
public class ProductoController {
    @Autowired
    private IProductoService produService;
    
    @PostMapping ("/productos/crear")
    public String createProduct(@RequestBody Producto produ){
        produService.createProduct(produ);
        return "Producto creado";
    }
    
    @GetMapping ("/productos")
    @ResponseBody
    public List<Producto> getProducts() {
        return produService.getProducts();
    }
    
    @DeleteMapping("/productos/eliminar/{id}")
    public String deleteProduct(@PathVariable Long id){
        produService.deleteProduct(id);
        return "Producto eliminado";
    }
    
    @GetMapping ("/productos/{id}")
            
    ResponseEntity<Producto> findProduct(@PathVariable Long id) {
        Producto produ = produService.findProduct(id);
        if (produ != null) {        
            return new ResponseEntity<> (produ, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<> (produ, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping ("/productos/editar/{id}")
    
    ResponseEntity<Producto> editProduct(@PathVariable Long id,
                               @RequestParam(required = false, name = "nombre") String newNombre,
                               @RequestParam(required = false, name = "marca") String newMarca,
                               @RequestParam(required = false, name = "costo") Double newCosto,
                               @RequestParam(required = false, name = "cantidad") Double newCantidad_disponible) {
        produService.editProduct(id, newNombre, newMarca, newCosto, newCantidad_disponible);
        if (produService.findProduct(id) != null) {  
            return new ResponseEntity<> (produService.findProduct(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<> (produService.findProduct(id), HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/productos/falta_stock")
    
    ResponseEntity<List<Producto>> findProductHigherThan5(){
        if (produService.findProduct5().isEmpty()) {
            return new ResponseEntity<> (HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<> (produService.findProduct5(),HttpStatus.FOUND);
        }
    }

}
