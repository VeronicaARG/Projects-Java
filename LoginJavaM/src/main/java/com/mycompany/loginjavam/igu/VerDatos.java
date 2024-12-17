
package com.mycompany.loginjavam.igu;

import com.mycompany.loginjavam.logica.ControladoraLogica;
import com.mycompany.loginjavam.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {
String tipo;
String usuario;
ControladoraLogica controlL = null;

    public VerDatos(String usu, String tip) {
        this.usuario = usu;
        this.tipo = tip;
        controlL = new ControladoraLogica();
        initComponents();
        TxtReconocimiento.setText("Usuario/a: " + usuario + " (" + tipo + ")");
        traerTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton3 = new javax.swing.JToggleButton();
        Panel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        TitDatos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TxtReconocimiento = new javax.swing.JTextField();
        BotonVolver = new javax.swing.JButton();

        jToggleButton3.setText("jToggleButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setFont(new java.awt.Font("Eras Bold ITC", 2, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Datos de Usuarios");

        Panel2.setBackground(new java.awt.Color(153, 153, 153));

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaEmpleados);

        TitDatos.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TitDatos.setForeground(new java.awt.Color(0, 0, 0));
        TitDatos.setText("Ver Datos:");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(TitDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        TxtReconocimiento.setEditable(false);
        TxtReconocimiento.setBackground(new java.awt.Color(153, 153, 153));
        TxtReconocimiento.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TxtReconocimiento.setForeground(new java.awt.Color(0, 0, 0));
        TxtReconocimiento.setBorder(null);

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
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtReconocimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Titulo))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonVolver)
                            .addComponent(TxtReconocimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        traerTabla();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (tipo.equals("Admin")) {
            if (TablaEmpleados.getRowCount() > 0) {
                if (TablaEmpleados.getSelectedRow() > -1) {
                    int id = Integer.parseInt(String.valueOf(TablaEmpleados.getValueAt(TablaEmpleados.getSelectedRow(), 0))); 
                    controlL.eliminarEmpleado(id);
                    traerTabla();
                    mostrarMensaje("Eliminado","Se elimino un empleado","Realizado");
                } else {
                    mostrarMensaje("Tabla","No seleccionó un empleado","Error");
                }
            } else {
                mostrarMensaje("Tabla","No hay empleados","Error");
            }
        } else {
            mostrarMensaje("Eliminar","No tienes los permisos para eliminar un empleado","Error");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tipo.equals("Admin")) {
            if (TablaEmpleados.getRowCount() > 0) {
                if (TablaEmpleados.getSelectedRow() > -1) {
                    int id = Integer.parseInt(String.valueOf(TablaEmpleados.getValueAt(TablaEmpleados.getSelectedRow(), 0)));
                    EditarDatos edit = new EditarDatos(id, usuario, tipo);
                    edit.setVisible(true);
                    edit.setLocationRelativeTo(null);
                    this.setVisible(false);
                } else {
                    mostrarMensaje("Tabla","No seleccionó un empleado","Error");
                }
            } else {
                mostrarMensaje("Tabla","No hay empleados","Error");
            }
        } else {
            mostrarMensaje("Eliminar","No tienes los permisos para editar los datos de un empleado","Error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JLabel TitDatos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TxtReconocimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
    
    public void mostrarMensaje(String titulo, String mensaje, String tipo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Realizado")){
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
    
    private void traerTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
        @Override 
        public boolean isCellEditable(int row, int column) {
            return false;
         }
        };
        String vectorColumnas[] = {"id","Usuario","Contrasenia"};
        modeloTabla.setColumnIdentifiers(vectorColumnas);
        List<Usuario> listaUsuarios = controlL.buscarTodosUsuarios();
        
        for (Usuario usuarito:listaUsuarios) {
            if (tipo.equals("User")) {
                if (usuarito.getTipo().equals("User")) {
                    Object[] objetos = {usuarito.getId(),usuarito.getUsuario(),usuarito.getContraseña()};
                    modeloTabla.addRow(objetos);
                }
            } else {
                Object[] objetos = {usuarito.getId(),usuarito.getUsuario(),usuarito.getContraseña()};
                modeloTabla.addRow(objetos);
            }
            
        }
        TablaEmpleados.setModel(modeloTabla);        
    }
}
