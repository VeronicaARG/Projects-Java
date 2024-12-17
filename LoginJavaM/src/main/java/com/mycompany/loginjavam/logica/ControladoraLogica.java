package com.mycompany.loginjavam.logica;

import com.mycompany.loginjavam.persistencia.ControladoraPersistencia;
import java.util.List;


public class ControladoraLogica {
    ControladoraPersistencia controlP = null;

    public ControladoraLogica() {
        controlP = new ControladoraPersistencia();
    }
    
    

    public void crearUsuario(String usuarioCrear, String contrasenia, String tipoEmple) {
        Usuario usuario = new Usuario();
        usuario.setUsuario(usuarioCrear);
        usuario.setContraseña(contrasenia);
        usuario.setTipo(tipoEmple);
        controlP.crearUsuario(usuario);
    }

    public String buscarUsuario(String usuario, String contra, String tipo) {
        // Lo que textualicé fue una implementacion con un booleano que se me ocurrio al principio,
        // después lo cambie por los returns porque es más efectivo, ya que corta la búsqueda de 
        // forma inmediata.
        String mensajito = "";
        List<Usuario> usu = controlP.buscarCadaUsuario();
        // boolean condicion = false;
        for (Usuario usuarito:usu) {
            //if (condicion != true) {
                if (usuarito.getUsuario().equals(usuario)) {
                    if (usuarito.getContraseña().equals(contra)) {
                        if (usuarito.getTipo().equals(tipo)) {
                            mensajito = "Bienvenido/a " + usuario;
                            //condicion = true;
                            return mensajito;
                        } else {
                            mensajito = "No es correcto el tipo de usuario";
                            //condicion = true;
                            return mensajito;
                        }
                    } else {
                        mensajito = "No es correcta la contraseña: " + contra;
                        //condicion = true;
                        return mensajito;
                    } 
                }  else {
                    mensajito = "No es correcto el usuario: " + usuario;            
                }        
            //} 
        }
        return mensajito;
    }

    public List<Usuario> buscarTodosUsuarios() {
        return controlP.buscarTodosUsuarios();
    }

    public void eliminarEmpleado(int id) {
        controlP.eliminarEmpleado(id);
    }

    public Usuario traerUsuario(int idN) {
        return controlP.traerUsuario(idN);
    }

    public void modificarEmpleado(Usuario usuNew, String usuario, String contra, String tipo) {
        usuNew.setUsuario(usuario);
        usuNew.setContraseña(contra);
        usuNew.setTipo(tipo);
        controlP.modificarEmpleado(usuNew);
    }



}
