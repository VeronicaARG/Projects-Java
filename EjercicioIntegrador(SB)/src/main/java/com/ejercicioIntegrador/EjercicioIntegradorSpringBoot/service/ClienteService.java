
package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Cliente;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Venta;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteRepository cliRepo;

    @Override
    public void createClient(Cliente cli) {
        cliRepo.save(cli);
    }

    @Override
    public void deleteClient(Long id) {
        cliRepo.deleteById(id);
    }

    @Override
    public List<Cliente> getClients() {
        List<Cliente> listaCli = cliRepo.findAll();
        return listaCli;
    }

    @Override
    public Cliente findClient(Long id) {
        Cliente cliFind = cliRepo.findById(id).orElse(null);
        return cliFind;
    }

    @Override
    public void editClient(Long id, String newNombre, String newApellido, String newDni, Venta newVenta) {
        Cliente cli = this.findClient(id);
        if (cli != null){
          cli.setNombre(newNombre);
          cli.setApellido(newApellido);
          cli.setDni(newDni);
          cli.setUnaVenta(newVenta);
          this.createClient(cli);
        }        
    }
    
}
