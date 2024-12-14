
package com.mycompany.concesionariadeautos.logica;

import com.mycompany.concesionariadeautos.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladorLogica {
    ControladoraPersistencia controlP = new ControladoraPersistencia();

    public void crearAuto(String modelo, String marca, String color, String motor, String patente, String puertas) {
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);    
        auto.setPatente(patente);
        auto.setCantidadPuertas(puertas);
        controlP.crearAuto(auto);
    }
    
    public List<Auto> agarrarAutosTodos(){
        return controlP.agarrarAutosTodos();
    }
    
    public Auto agarrarAuto(int id) {
        return controlP.agarrarAuto(id);
    }

    public void eliminarAuto(int iddde) {
        controlP.eliminarAuto(iddde);
    }


    public void modificarAuto(Auto autito, String modelo, String marca, String color, String motor, String patente, String puertas) {
        autito.setModelo(modelo);
        autito.setMarca(marca);
        autito.setMotor(motor);
        autito.setColor(color);    
        autito.setPatente(patente);
        autito.setCantidadPuertas(puertas);
        controlP.editarAuto(autito);
    }
}
