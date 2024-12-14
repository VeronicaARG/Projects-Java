/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.concesionariadeautos.igu;

import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        CargarDBoton = new javax.swing.JButton();
        VerDBoton = new javax.swing.JButton();
        SalirBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Titulo.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(153, 102, 255));
        Titulo.setText("Consecionaria Automovíl");

        CargarDBoton.setBackground(new java.awt.Color(255, 255, 102));
        CargarDBoton.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        CargarDBoton.setForeground(new java.awt.Color(153, 102, 255));
        CargarDBoton.setText("Cargar Datos");
        CargarDBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarDBotonActionPerformed(evt);
            }
        });

        VerDBoton.setBackground(new java.awt.Color(255, 255, 102));
        VerDBoton.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        VerDBoton.setForeground(new java.awt.Color(153, 102, 255));
        VerDBoton.setText("Ver Datos");
        VerDBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDBotonActionPerformed(evt);
            }
        });

        SalirBoton.setBackground(new java.awt.Color(255, 255, 102));
        SalirBoton.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        SalirBoton.setForeground(new java.awt.Color(153, 102, 255));
        SalirBoton.setText("Salir");
        SalirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VerDBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargarDBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(Titulo)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Titulo)
                .addGap(77, 77, 77)
                .addComponent(CargarDBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(VerDBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(SalirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBotonActionPerformed
        JOptionPane panel = new JOptionPane("Bueno andáte");
        panel.setMessageType(JOptionPane.OK_CANCEL_OPTION);
        JDialog dialog = panel.createDialog("Salida");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_SalirBotonActionPerformed

    private void CargarDBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarDBotonActionPerformed
        CargarD carga = new CargarD();
        carga.setVisible(true);
        carga.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_CargarDBotonActionPerformed

    private void VerDBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDBotonActionPerformed
        VerD ver = new VerD();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VerDBotonActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarDBoton;
    private javax.swing.JButton SalirBoton;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton VerDBoton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
