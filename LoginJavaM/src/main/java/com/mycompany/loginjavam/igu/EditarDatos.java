
package com.mycompany.loginjavam.igu;

import com.mycompany.loginjavam.logica.ControladoraLogica;
import com.mycompany.loginjavam.logica.Usuario;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class EditarDatos extends javax.swing.JFrame {
int idN;
Usuario usuNew;
ControladoraLogica controlL = null;
String usuarioO;
String tipoO;
VerDatos ver;

    public EditarDatos(int id, String usuario, String tipo) {
        this.usuarioO = usuario;
        this.tipoO = tipo;
        this.idN = id;
        controlL = new ControladoraLogica();
        initComponents();
        TxtReconocimiento.setText("Usuario/a: " + usuario + " (" + tipo + ")");
        cargarEmpleDatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        TitUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TitContra = new javax.swing.JLabel();
        TitTipo = new javax.swing.JLabel();
        TxtEspecialTipo = new javax.swing.JComboBox<>();
        BotonBorrar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        TxtReconocimiento = new javax.swing.JTextField();
        BotonCancelar = new javax.swing.JButton();
        TxtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setFont(new java.awt.Font("Eras Bold ITC", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Editar Empleado");

        TitUsuario.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TitUsuario.setText("Usuario:");

        TxtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        TxtUsuario.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(0, 0, 0));

        TitContra.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitContra.setForeground(new java.awt.Color(0, 0, 0));
        TitContra.setText("Contraseña:");

        TitTipo.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitTipo.setForeground(new java.awt.Color(0, 0, 0));
        TitTipo.setText("Tipo de empleado:");

        TxtEspecialTipo.setBackground(new java.awt.Color(102, 102, 102));
        TxtEspecialTipo.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtEspecialTipo.setForeground(new java.awt.Color(0, 0, 0));
        TxtEspecialTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "User" }));

        BotonBorrar.setBackground(new java.awt.Color(102, 102, 102));
        BotonBorrar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        BotonBorrar.setText("Borrar");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonEditar.setBackground(new java.awt.Color(102, 102, 102));
        BotonEditar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonEditar.setForeground(new java.awt.Color(0, 0, 0));
        BotonEditar.setText("Editar");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        TxtReconocimiento.setEditable(false);
        TxtReconocimiento.setBackground(new java.awt.Color(153, 153, 153));
        TxtReconocimiento.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtReconocimiento.setForeground(new java.awt.Color(0, 0, 0));
        TxtReconocimiento.setBorder(null);

        BotonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        BotonCancelar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        TxtContra.setBackground(new java.awt.Color(102, 102, 102));
        TxtContra.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtContra.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TitUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtUsuario)
                    .addComponent(TitContra, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtEspecialTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitTipo)
                    .addComponent(TxtContra, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(TxtReconocimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(TxtReconocimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(TitUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(TxtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TitTipo))
                    .addComponent(BotonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEspecialTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(BotonCancelar)
                .addGap(37, 37, 37))
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

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        TxtUsuario.setText("");
        TxtContra.setText("");
        TxtEspecialTipo.setSelectedIndex(0);
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        String usuario = TxtUsuario.getText();
        String contra = TxtContra.getText();
        String tipo = String.valueOf(TxtEspecialTipo.getSelectedItem());
        controlL.modificarEmpleado(usuNew,usuario,contra,tipo);
        
        JOptionPane optionPane = new JOptionPane("Se editó correctamente el empleado");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Edición");
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
        
        this.ver = new VerDatos(usuarioO,tipoO);
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.setVisible(false);       
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.ver = new VerDatos(usuarioO,tipoO);
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        this.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void cargarEmpleDatos() {
        this.usuNew = controlL.traerUsuario(idN);
        TxtUsuario.setText(usuNew.getUsuario());
        TxtContra.setText(usuNew.getContraseña());
        TxtEspecialTipo.setSelectedItem(usuNew.getTipo());       
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel TitContra;
    private javax.swing.JLabel TitTipo;
    private javax.swing.JLabel TitUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPasswordField TxtContra;
    private javax.swing.JComboBox<String> TxtEspecialTipo;
    private javax.swing.JTextField TxtReconocimiento;
    private javax.swing.JTextField TxtUsuario;
    // End of variables declaration//GEN-END:variables
}
