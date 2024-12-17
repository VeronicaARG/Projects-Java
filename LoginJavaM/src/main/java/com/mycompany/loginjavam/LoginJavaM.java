package com.mycompany.loginjavam;

import com.mycompany.loginjavam.igu.Login;
import com.mycompany.loginjavam.logica.ControladoraLogica;
import com.mycompany.loginjavam.logica.Usuario;

public class LoginJavaM {

    public static void main(String[] args) {
        // Desafío 1:
        // Se necesita una Interfaz Grafica de Uusario (IGU) para el login de una aplicación.
        // * La IGU debe tener un campo de texto para el nombre de usuario y otro para la contraseña 
        // (con sus respectivas labels/etiquetas) 
        // * Al mismo tiempo se necesita un boton de login y otro para limpiar los datos. Al hacer 
        // click en el botón login, se debe verificar si el usuario y contraseña son correctos; 
        // de ser así, debe manifestar un saludo de "Bienvenido usuario" en un area de texto (donde
        // usuario debe ser reemplazado por el nombre del usuario). 
        // * Si usuario es incorrecto, debe dar a conocer dicha situacion
        // * Los datos de usuario correctos son: - Usuario: Admin
        //                                       - Contraseña: 123prueba
        // Desafío 2:
        // A partir de la creación del Login que llevaste a cabo en el Desafío número 1, se 
        // necesita la creación de un sistema de administración de usuarios que permita las 
        // altas, bajas, modificaciones y lectura (C.R.U.D.) de todos los existentes en una 
        // empresa. 
        // Para éste, tendremos en cuenta 2 tipos de usuario: uno administrador "admin" y otro 
        // llamado "user" para usuario común.
        // * El usuario admin tendrá acceso a: 
        // - Visualización de todos los usuarios sin importar su tipo. 
        // - Posibilidad de alta, baja, modificación y lectura de cualquier usuario y sus permisos.
        // * El usuario común (user) tendrá acceso a: 
        // - Solo la lectura de todos los usuarios que sean de su mismo tipo (usuario común)
        // Realizar la modificación correspondiente en la aplicación del Login que, en caso 
        // de ser correcto el usuario y contraseña, en lugar de emitir un mensaje, permita o 
        // no el acceso a cada usuario a las funcionalidades disponibles según su rol asignado.
        // Como extra se solicita que en la pantalla de control de cada usuario se muestre arriba
        // a la derecha el nombre de usuario del que se encuentra actualmente iniciada la sesión.

        ControladoraLogica controlL = new ControladoraLogica();
        //Usuario usu = new Usuario();
        //usu.setUsuario("Girnalda");
        //usu.setContraseña("128934892480");
        
        //controlL.crearUsuario(usu);
        
        
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);    
        
    }
}
