
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Producto;
import java.util.List;


public interface IProductoService {
    public void createProduct(Producto prod);
    
    public void deleteProduct(Long id);
    
    public List<Producto> getProducts();
    
    public Producto findProduct(Long id);
    
    public void editProduct(Long id, String newNombre, String newMarca, Double newCosto, Double newCantidad_disponible);
    
    public List<Producto> findProduct5();
}
