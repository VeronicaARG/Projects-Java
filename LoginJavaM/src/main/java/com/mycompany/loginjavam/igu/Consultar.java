/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginjavam.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Consultar extends javax.swing.JFrame {
String usuario;
String tipo;
    public Consultar(String usu, String tip) {
        this.usuario = usu;
        this.tipo = tip;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Tit = new javax.swing.JLabel();
        TitConsulta = new javax.swing.JLabel();
        TxtContra = new javax.swing.JPasswordField();
        BotonLogin = new javax.swing.JButton();
        TxtDevolucion = new javax.swing.JTextField();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(204, 204, 204));

        Tit.setFont(new java.awt.Font("Eras Bold ITC", 2, 18)); // NOI18N
        Tit.setForeground(new java.awt.Color(0, 0, 0));
        Tit.setText("Login Admin");

        TitConsulta.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitConsulta.setForeground(new java.awt.Color(0, 0, 0));
        TitConsulta.setText("Ingrese la contraseña predilecta de todos los Admin's:");

        TxtContra.setBackground(new java.awt.Color(102, 102, 102));
        TxtContra.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtContra.setForeground(new java.awt.Color(0, 0, 0));

        BotonLogin.setBackground(new java.awt.Color(102, 102, 102));
        BotonLogin.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonLogin.setForeground(new java.awt.Color(0, 0, 0));
        BotonLogin.setText("Login");
        BotonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLoginActionPerformed(evt);
            }
        });

        TxtDevolucion.setEditable(false);
        TxtDevolucion.setBackground(new java.awt.Color(204, 204, 204));
        TxtDevolucion.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtDevolucion.setBorder(null);
        TxtDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDevolucionActionPerformed(evt);
            }
        });

        BotonVolver.setBackground(new java.awt.Color(102, 102, 102));
        BotonVolver.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        BotonVolver.setForeground(new java.awt.Color(0, 0, 0));
        BotonVolver.setText("<<<");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(Tit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtContra)
                            .addComponent(TitConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(BotonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDevolucion)))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tit)
                .addGap(7, 7, 7)
                .addComponent(TxtDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitConsulta)
                .addGap(18, 18, 18)
                .addComponent(TxtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonLogin)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDevolucionActionPerformed
        
    }//GEN-LAST:event_TxtDevolucionActionPerformed

    private void BotonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLoginActionPerformed
        String contra = TxtContra.getText();
        if (contra.equals("123admin")) {
            mostrarMensaje("Login","Bienvenido usuario: '" + usuario + "'","Correcto");
            VerDatos ver = new VerDatos(usuario, tipo);
            ver.setVisible(true);
            ver.setLocationRelativeTo(null);
            this.setVisible(false);
        } else {
            TxtDevolucion.setText("Contrseña incorrecta");
        }
    
    }//GEN-LAST:event_BotonLoginActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed
     
    public void mostrarMensaje(String titulo, String mensaje, String tipo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Correcto")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonLogin;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel Tit;
    private javax.swing.JLabel TitConsulta;
    private javax.swing.JPasswordField TxtContra;
    private javax.swing.JTextField TxtDevolucion;
    // End of variables declaration//GEN-END:variables
}
