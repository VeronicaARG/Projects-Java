/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginjavam.igu;

import com.mycompany.loginjavam.logica.ControladoraLogica;
import com.mycompany.loginjavam.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    ControladoraLogica controlL = null;

    public Login() {
        controlL = new ControladoraLogica();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        TitUsuario = new javax.swing.JLabel();
        TitContra = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Sep1 = new javax.swing.JSeparator();
        TxtUsuario = new javax.swing.JTextField();
        Sep2 = new javax.swing.JSeparator();
        BotonLogin = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        TxtDevolucion = new javax.swing.JTextField();
        Sep3 = new javax.swing.JSeparator();
        TxtContrasenia = new javax.swing.JPasswordField();
        TxtEspecialTipo = new javax.swing.JComboBox<>();
        TitTipo = new javax.swing.JLabel();
        TitCrear = new javax.swing.JLabel();
        BotonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(204, 204, 204));

        TitUsuario.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TitUsuario.setText("Usuario:");

        TitContra.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitContra.setForeground(new java.awt.Color(0, 0, 0));
        TitContra.setText("Contraseña:");

        Titulo.setFont(new java.awt.Font("Eras Bold ITC", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Login");

        TxtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        TxtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        BotonLogin.setBackground(new java.awt.Color(102, 102, 102));
        BotonLogin.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        BotonLogin.setForeground(new java.awt.Color(0, 0, 0));
        BotonLogin.setText("Login");
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        BotonBorrar.setBackground(new java.awt.Color(102, 102, 102));
        BotonBorrar.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        TxtDevolucion.setEditable(false);
        TxtDevolucion.setBackground(new java.awt.Color(102, 102, 102));
        TxtDevolucion.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtDevolucion.setForeground(new java.awt.Color(0, 0, 0));
        TxtDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDevolucionActionPerformed(evt);
            }
        });

        TxtContrasenia.setBackground(new java.awt.Color(102, 102, 102));
        TxtContrasenia.setForeground(new java.awt.Color(0, 0, 0));

        TxtEspecialTipo.setBackground(new java.awt.Color(102, 102, 102));
        TxtEspecialTipo.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtEspecialTipo.setForeground(new java.awt.Color(0, 0, 0));
        TxtEspecialTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "User" }));

        TitTipo.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitTipo.setForeground(new java.awt.Color(0, 0, 0));
        TitTipo.setText("Tipo de usuario:");

        TitCrear.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitCrear.setForeground(new java.awt.Color(0, 0, 0));
        TitCrear.setText("Crear usuario (SOLO ALTO MANDO)");

        BotonCrear.setBackground(new java.awt.Color(102, 102, 102));
        BotonCrear.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonCrear.setForeground(new java.awt.Color(0, 0, 0));
        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitContra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel1Layout.createSequentialGroup()
                                        .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TxtContrasenia)))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(TitTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEspecialTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Sep1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Sep3)))
                .addContainerGap())
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(Sep2)
                .addContainerGap())
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TxtDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(BotonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(TitCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sep1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitUsuario)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitContra)
                    .addComponent(TxtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEspecialTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitTipo))
                .addGap(46, 46, 46)
                .addComponent(Sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(TitCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Sep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(TxtDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        TxtUsuario.setText("");
        TxtContrasenia.setText("");
        TxtEspecialTipo.setSelectedItem(0);
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed

        String usuario = TxtUsuario.getText();
        String contra = TxtContrasenia.getText();
        String tipo = String.valueOf(TxtEspecialTipo.getSelectedItem());
        boolean condicion;
        if (!TxtUsuario.getText().equals("")) {
            if (!TxtContrasenia.getText().equals("")) {
                if (!tipo.equals("-")) {
                    String mensaje = controlL.buscarUsuario(usuario,contra,tipo);
                    TxtDevolucion.setText(mensaje);
                    condicion = TxtDevolucion.getText().equals("Bienvenido/a " + usuario) ? true:false;
                    if (tipo.equals("Admin") && (condicion == true)){
                       System.out.println(mensaje + ", " + condicion);
                       Consultar consul = new Consultar(usuario, tipo);
                       consul.setVisible(true);
                       consul.setLocationRelativeTo(null);
                       this.setVisible(false);
                    } else {
                        if (condicion == true) {
                            mostrarMensaje("Login",mensaje,"Logeado");
                            VerDatos ver = new VerDatos(usuario, tipo);
                            ver.setVisible(true);
                            ver.setLocationRelativeTo(null);
                            this.setVisible(false);
                        }
                    }
                } else {
                    mostrarMensaje("Login","No ingresó un tipo de empleado","Error");
                }
            } else {
                mostrarMensaje("Login","No ingresó una contraseña","Error");
            }
        } else {
            mostrarMensaje("Login","No ingresó un usuario","Error");
        }
      
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void TxtDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDevolucionActionPerformed

    }//GEN-LAST:event_TxtDevolucionActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        String usuario = TxtUsuario.getText();
        String contra = TxtContrasenia.getText();
        String tipo = String.valueOf(TxtEspecialTipo.getSelectedItem());
        if (!usuario.equals("")) {
            if (!contra.equals("")) {
                if (!tipo.equals("-")) {
                    controlL.crearUsuario(usuario,contra,tipo);
                    mostrarMensaje("Confidencialidad","Confiamos en que sos el jefe de RRHH","Security");
                    TxtDevolucion.setText("Usario creado");
                } else {
                    mostrarMensaje("Crear","No ingresó el tipo de empleado","Error");
                } 
            } else {
                mostrarMensaje("Crear","No ingresó la contrasenia","Error");
            } 
        } else {
            mostrarMensaje("Crear","No ingresó el usuario","Error");
        } 
    }//GEN-LAST:event_BotonCrearActionPerformed

    public void mostrarMensaje(String titulo, String mensaje, String tipo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Logeado")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            if ((tipo.equals("Security"))) {
                optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
            } else {
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonLogin;
    private javax.swing.JPanel Panel1;
    private javax.swing.JSeparator Sep1;
    private javax.swing.JSeparator Sep2;
    private javax.swing.JSeparator Sep3;
    private javax.swing.JLabel TitContra;
    private javax.swing.JLabel TitCrear;
    private javax.swing.JLabel TitTipo;
    private javax.swing.JLabel TitUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPasswordField TxtContrasenia;
    private javax.swing.JTextField TxtDevolucion;
    private javax.swing.JComboBox<String> TxtEspecialTipo;
    private javax.swing.JTextField TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
