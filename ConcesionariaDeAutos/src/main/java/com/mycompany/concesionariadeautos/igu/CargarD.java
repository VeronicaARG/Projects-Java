
package com.mycompany.concesionariadeautos.igu;

import com.mycompany.concesionariadeautos.logica.ControladorLogica;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class CargarD extends javax.swing.JFrame {
ControladorLogica controlL = new ControladorLogica();

    public CargarD() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        TxtMotor = new javax.swing.JTextField();
        TxtModelo = new javax.swing.JTextField();
        TxtMarca = new javax.swing.JTextField();
        TxtEspecialColor = new javax.swing.JComboBox<>();
        ModeloTit = new javax.swing.JLabel();
        MarcaTit = new javax.swing.JLabel();
        ColorTit = new javax.swing.JLabel();
        MotorTit = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        PatenteTit = new javax.swing.JLabel();
        PuertasTit = new javax.swing.JLabel();
        TxtPatente = new javax.swing.JTextField();
        TxtEspecialPuertas = new javax.swing.JComboBox<>();
        Subtitulo = new javax.swing.JLabel();
        Obligatorio1 = new javax.swing.JLabel();
        Obligatorio2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        Titulo.setFont(new java.awt.Font("Ebrima", 2, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 51, 51));
        Titulo.setText("Carga los Datos");

        TxtMotor.setBackground(new java.awt.Color(153, 255, 153));
        TxtMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMotorActionPerformed(evt);
            }
        });

        TxtModelo.setBackground(new java.awt.Color(153, 255, 153));
        TxtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtModeloActionPerformed(evt);
            }
        });

        TxtMarca.setBackground(new java.awt.Color(153, 255, 153));
        TxtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMarcaActionPerformed(evt);
            }
        });

        TxtEspecialColor.setBackground(new java.awt.Color(153, 255, 153));
        TxtEspecialColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "BLANCO", "GRIS", "ROJO", "AZUL", "NEGRO" }));

        ModeloTit.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        ModeloTit.setForeground(new java.awt.Color(255, 51, 51));
        ModeloTit.setText("Modelo:");

        MarcaTit.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        MarcaTit.setForeground(new java.awt.Color(255, 51, 51));
        MarcaTit.setText("Marca:");

        ColorTit.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        ColorTit.setForeground(new java.awt.Color(255, 51, 51));
        ColorTit.setText("Color:");

        MotorTit.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        MotorTit.setForeground(new java.awt.Color(255, 51, 51));
        MotorTit.setText("Motor:");

        BotonEliminar.setBackground(new java.awt.Color(0, 255, 51));
        BotonEliminar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(0, 102, 102));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonGuardar.setBackground(new java.awt.Color(51, 255, 51));
        BotonGuardar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(0, 102, 102));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        PatenteTit.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        PatenteTit.setForeground(new java.awt.Color(255, 51, 51));
        PatenteTit.setText("Patente:");

        PuertasTit.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        PuertasTit.setForeground(new java.awt.Color(255, 51, 51));
        PuertasTit.setText("Cantidad de puertas:");

        TxtPatente.setBackground(new java.awt.Color(153, 255, 153));
        TxtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPatenteActionPerformed(evt);
            }
        });

        TxtEspecialPuertas.setBackground(new java.awt.Color(153, 255, 153));
        TxtEspecialPuertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2", "4", "ESPECIAL" }));
        TxtEspecialPuertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEspecialPuertasActionPerformed(evt);
            }
        });

        Subtitulo.setFont(new java.awt.Font("Ebrima", 2, 14)); // NOI18N
        Subtitulo.setForeground(new java.awt.Color(255, 0, 0));
        Subtitulo.setText("Los '*' son obligatorios");

        Obligatorio1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Obligatorio1.setForeground(new java.awt.Color(255, 0, 0));
        Obligatorio1.setText("*");

        Obligatorio2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Obligatorio2.setForeground(new java.awt.Color(255, 0, 0));
        Obligatorio2.setText("*");

        BotonAtras.setBackground(new java.awt.Color(0, 153, 153));
        BotonAtras.setForeground(new java.awt.Color(255, 51, 51));
        BotonAtras.setText("<<");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Obligatorio1)
                    .addComponent(Obligatorio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PuertasTit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEspecialPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ModeloTit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(MarcaTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PatenteTit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ColorTit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MotorTit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtEspecialColor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonAtras)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Subtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModeloTit)
                            .addComponent(Obligatorio1))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MarcaTit)
                            .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Obligatorio2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorTit)
                            .addComponent(TxtEspecialColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotorTit)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatenteTit)
                    .addComponent(TxtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PuertasTit)
                    .addComponent(TxtEspecialPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMotorActionPerformed

    private void TxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMarcaActionPerformed

    private void TxtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtModeloActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        TxtMarca.setText("");
        TxtModelo.setText("");
        TxtMotor.setText("");
        TxtEspecialColor.setSelectedIndex(0);
        TxtPatente.setText("");
        TxtEspecialPuertas.setSelectedIndex(0);
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        if (!TxtMarca.getText().equals("")) {
            if (!TxtModelo.getText().equals("")) {
                String marca = TxtMarca.getText();
                String modelo = TxtModelo.getText();
                String motor = TxtMotor.getText();
                String color = (String) TxtEspecialColor.getSelectedItem();
                String patente = TxtPatente.getText();
                String puertas = (String) TxtEspecialPuertas.getSelectedItem();     
                controlL.crearAuto(modelo,marca,color,motor,patente,puertas);
                mostrarMensaje("Realizado","Se guardaron los datos correctamente","Guardado");
                this.setVisible(false);
                Inicio ini = new Inicio();
                ini.setVisible(true);
                ini.setLocationRelativeTo(null);
            } else{
                mostrarMensaje("Error","No selecciono alguno de sus datos obligatorios","Error");
            }            
        } else {
            mostrarMensaje("Error","No selecciono alguno de sus datos obligatorios","Error");
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void TxtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPatenteActionPerformed

    private void TxtEspecialPuertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEspecialPuertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEspecialPuertasActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAtrasActionPerformed
    
    public void mostrarMensaje(String titulo, String mensaje, String tipo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Guardado")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel ColorTit;
    private javax.swing.JLabel MarcaTit;
    private javax.swing.JLabel ModeloTit;
    private javax.swing.JLabel MotorTit;
    private javax.swing.JLabel Obligatorio1;
    private javax.swing.JLabel Obligatorio2;
    private javax.swing.JLabel PatenteTit;
    private javax.swing.JLabel PuertasTit;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> TxtEspecialColor;
    private javax.swing.JComboBox<String> TxtEspecialPuertas;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtModelo;
    private javax.swing.JTextField TxtMotor;
    private javax.swing.JTextField TxtPatente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
