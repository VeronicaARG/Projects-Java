

package com.mycompany.concesionariadeautos;

import com.mycompany.concesionariadeautos.igu.Inicio;

public class ConcesionariaDeAutos {
    
    public static void main(String[] args) {
        // Una tienda venta de automóviles necesita de un sistema que le permita
        // realizar un CRUD de todos los vehículos que tiene actualmente a la venta
        // para luego publicarlos en un catálogo.
        // Realizar el modelado correspondiente de la clase Automovil teniendo en 
        // cuenta los siguientes datos: id, modelo, marca, motor, color, patente(placa), 
        // cantidadPuertas
        // Realizar los métodos necesarios para permitir operaciones CRUD de cada automóvil.
        // IMPORTANTE= Respetar el modelo de capas, separando la responsabilidad de cada una 
        // de ellas: lógica, IGU(en caso de realizarla) y persistencia
        Inicio iniciar = new Inicio();
        iniciar.setVisible(true);
        iniciar.setLocationRelativeTo(null);
    }
}
