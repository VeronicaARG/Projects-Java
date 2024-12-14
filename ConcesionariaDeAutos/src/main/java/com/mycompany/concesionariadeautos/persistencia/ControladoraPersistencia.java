
package com.mycompany.concesionariadeautos.persistencia;

import com.mycompany.concesionariadeautos.logica.Auto;
import com.mycompany.concesionariadeautos.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AutoJpaController autoJpa = new AutoJpaController();

    public void crearAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> agarrarAutosTodos() {
        return autoJpa.findAutoEntities();
    }

    public void eliminarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto agarrarAuto(int iddde) {
        return autoJpa.findAuto(iddde);
    }

    public void editarAuto(Auto autito) {
        try {
            autoJpa.edit(autito);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
