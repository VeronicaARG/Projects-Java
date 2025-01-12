

package com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.controller;

import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Cliente;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.model.Venta;
import com.ejercicioIntegrador.EjercicioIntegradorSpringBoot.service.IClienteService;
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
public class ClienteController {
    @Autowired
    private IClienteService cliService;
    
    @PostMapping ("/clientes/crear")
    public String createClient(@RequestBody Cliente cli){
        cliService.createClient(cli);
        return "Cliente creado";
    }
    
    @GetMapping ("/clientes")
    @ResponseBody
    public List<Cliente> getClients() {
        return cliService.getClients();
    }
    
    @DeleteMapping("/clientes/eliminar/{id}")
    public String deleteClient(@PathVariable Long id){
        cliService.deleteClient(id);
        return "Cliente eliminado";
    }
    
    @GetMapping ("/clientes/{id}")
            
    ResponseEntity<Cliente> findClient(@PathVariable Long id) {
        Cliente cli = cliService.findClient(id);
        if (cli != null) {        
            return new ResponseEntity<> (cli, HttpStatus.FOUND);
        } else {
            return new ResponseEntity<> (cli, HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping ("/clientes/editar/{id}")
 
    ResponseEntity<Cliente> editClient(@PathVariable Long id,
                               @RequestParam(required = false, name = "nombre") String newNombre,
                               @RequestParam(required = false, name = "apellido") String newApellido,
                               @RequestParam(required = false,  name = "dni") String newDni,
                               @RequestParam(required = false,  name = "venta") Venta newVenta) {
        cliService.editClient(id,newNombre,newApellido,newDni,newVenta);
        if (cliService.findClient(id) != null) {  
            return new ResponseEntity<> (cliService.findClient(id), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<> (cliService.findClient(id), HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping ("clientes/mayor_venta")
    @ResponseBody
    public String getHigherClientSale(){
        List<Cliente> listaClientes = cliService.getClients();
        Double max = -1.0;
        for (Cliente list:listaClientes) {
            if (list.getUnaVenta().getTotal() >= max) {
                max = list.getUnaVenta().getTotal();
            }
        }
        for (Cliente list:listaClientes) {
            if (list.getUnaVenta().getTotal() == max) {
                return "El codigo es: " + list.getUnaVenta().getCodigo_venta() + 
                        ", el total es: " + list.getUnaVenta().getTotal() + 
                        ", el nombre del cliente es: " + list.getNombre() +
                        ", el apellido del cliente es: " + list.getApellido() +
                        ", puedes averiguar la cantidad de productos con el EndPoint (/ventas/cantidad_totalP)";
            } 
        }
        return null;
    }
    // 7. Obtener el codigo_venta, el total, la cantidad de productos, el nombre del cliente y el 
        // apellido del cliente de la venta con el monto más alto de todas.

}

