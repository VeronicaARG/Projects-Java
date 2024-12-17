
package com.mycompany.loginjavam.persistencia;

import com.mycompany.loginjavam.logica.Usuario;
import com.mycompany.loginjavam.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usuario) {
        usuJpa.create(usuario);
    }

    public List<Usuario> buscarCadaUsuario() {
        return usuJpa.findUsuarioEntities();
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void eliminarEmpleado(int id) {
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idN) {
        return usuJpa.findUsuario(idN);
    }

    public void modificarEmpleado(Usuario usuNew) {
        try {
            usuJpa.edit(usuNew);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
