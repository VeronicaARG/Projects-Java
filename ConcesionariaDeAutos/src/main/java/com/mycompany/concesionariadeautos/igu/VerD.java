
package com.mycompany.concesionariadeautos.igu;

import com.mycompany.concesionariadeautos.logica.Auto;
import com.mycompany.concesionariadeautos.logica.ControladorLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VerD extends javax.swing.JFrame {
ControladorLogica controlL = null;

    public VerD() {
        controlL = new ControladorLogica();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        BotonEditar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Panel1.setBackground(new java.awt.Color(255, 153, 153));

        BotonEditar.setBackground(new java.awt.Color(102, 0, 153));
        BotonEditar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonEditar.setForeground(new java.awt.Color(255, 102, 102));
        BotonEditar.setText("Editar");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        BotonEliminar.setBackground(new java.awt.Color(153, 0, 153));
        BotonEliminar.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 102, 102));
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Ebrima", 2, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(102, 0, 102));
        Titulo.setText("Tabla de Datos");

        Panel2.setForeground(new java.awt.Color(255, 102, 204));

        TablaDatos.setBackground(new java.awt.Color(204, 153, 255));
        TablaDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaDatos.setFont(new java.awt.Font("Ebrima", 2, 12)); // NOI18N
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        BotonAtras.setBackground(new java.awt.Color(0, 153, 153));
        BotonAtras.setForeground(new java.awt.Color(255, 51, 51));
        BotonAtras.setText("<<");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(Titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Titulo))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonAtras)))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(BotonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        if (TablaDatos.getRowCount() > 0) {
            if (TablaDatos.getSelectedRow() != -1){
                int id = Integer.parseInt(String.valueOf(TablaDatos.getValueAt(TablaDatos.getSelectedRow(), 0)));
                controlL.eliminarAuto(id);
                mostrarMensaje("Eliminado","Se elimino correctamente","Realizado");
                cargarTabla();
            } else{
                mostrarMensaje("Eror","No seleccionó una fila","Error");
            }          
        } else {
            mostrarMensaje("Error","No hay datos","Error");
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        if (TablaDatos.getRowCount()> 0){
            if (TablaDatos.getSelectedRow() != -1) {
                int id = Integer.parseInt(String.valueOf(TablaDatos.getValueAt(TablaDatos.getSelectedRow(),0)));
                EditarD edit = new EditarD(id);
                edit.setVisible(true);
                edit.setLocationRelativeTo(null);
                this.setVisible(false);
                cargarTabla();
            } else {
                mostrarMensaje("Error","No seleccionó una fila","Error");
            } 
        }    else {
            mostrarMensaje("Error","No hay datos","Erorr");
        }    
        
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Inicio ini = new Inicio();
        ini.setVisible(true);
        ini.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAtrasActionPerformed
    public void mostrarMensaje(String titulo, String mensaje, String tipo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Realizado")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setLocationRelativeTo(null);
    }
    
    public void cargarTabla(){
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //Hago que filas y columnas no sean editables
            @Override // Como es un metodo heredado de Java que ya viene con la tabala,
                      // lo tenemos que sobreescribir (@override)
            public boolean isCellEditable(int row, int column) {
                return false;
         }
        
        };
        String vector[] = {"id","modelo","marca","motor","color","patente(placa)","cantidad de puertas"};
        // Creo titulos de las filas
        modeloTabla.setColumnIdentifiers(vector);
        
        List<Auto> listaAuto = controlL.agarrarAutosTodos(); 
        if (listaAuto != null) {
            for (Auto list:listaAuto) {
                Object[] vectorsito = {list.getId(), list.getModelo(),list.getMarca(),list.getMotor(),list.getColor(),
                list.getPatente(),list.getCantidadPuertas()};
                
                modeloTabla.addRow(vectorsito);
            }
        }
        TablaDatos.setModel(modeloTabla);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
