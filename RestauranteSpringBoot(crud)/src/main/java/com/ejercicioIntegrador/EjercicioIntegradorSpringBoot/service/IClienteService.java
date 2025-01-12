
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Cliente;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Venta;
import java.util.List;


public interface IClienteService {
    
    public void createClient(Cliente cli);
    
    public void deleteClient(Long id);
    
    public List<Cliente> getClients();
    
    public Cliente findClient(Long id);
    
    public void editClient(Long id, String newNombre, String newApellido, String newDni, Venta newVenta);
}
