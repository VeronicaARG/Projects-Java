
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Producto;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.repository.IProductoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoRepository produRepo;

    @Override
    public void createProduct(Producto prod) {
        produRepo.save(prod);
    }

    @Override
    public void deleteProduct(Long id) {
        produRepo.deleteById(id);
    }

    @Override
    public List<Producto> getProducts() {
        List<Producto> listaProdu = produRepo.findAll();
        return listaProdu;
    }

    @Override
    public Producto findProduct(Long id) {
        Producto produFind = produRepo.findById(id).orElse(null);
        return produFind;
    }

    @Override
    public void editProduct(Long id, String newNombre, String newMarca, Double newCosto, Double newCantidad_disponible) {
        Producto produ = this.findProduct(id);
        if (produ != null){
            produ.setNombre(newNombre);
            produ.setMarca(newMarca);
            produ.setCosto(newCosto);
            produ.setCantidad_disponible(newCantidad_disponible);
            this.createProduct(produ);
        }
    }

    @Override
    public List<Producto> findProduct5() {
        List<Producto> listaProdu = this.getProducts();
        List<Producto> listaProduMayor5 = new ArrayList();
        for (Producto list:listaProdu) {
            if (list.getCantidad_disponible()<= 5){
                listaProduMayor5.add(list);
            }
        }
        return listaProduMayor5;
    }
}
