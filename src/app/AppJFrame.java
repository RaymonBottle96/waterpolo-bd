/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.*;
import javax.swing.*;
import model.*;

/**
 *
 * @author Ramon Botella Ciria
 */
public class AppJFrame extends javax.swing.JFrame {

    List<Integer> listaIdEquipos;
    List<Integer> listaIdJugadores;

    /**
     * Creates new form App
     */
    public AppJFrame() {
        initComponents();
        listaIdEquipos = new ArrayList<>();
        listaIdJugadores = new ArrayList<>();
    }

    public void actualizarListaEquipos() {
        // Obtener cadena de búsqueda
        String busqueda = jTextFieldBuscarEquipos.getText();
        // Crear modelo para la lista
        DefaultListModel<String> listModelEquipos = new DefaultListModel<>();
        // Obtener el orden seleccionado
        int orden = (jRadioButtonOrdenNombre.isSelected()) ? Equipo.ORDEN_NOMBRE : Equipo.ORDEN_PAIS;
        //Obtener equipos
        List<Equipo> listaEquipo = Equipo.obtenerEquipos(busqueda, orden);

        // vaciar la lista de ids de equiopos
        listaIdEquipos.clear();

        // añadir cadenas al modelo e ir guardando los id de los equipos
        for (Equipo e : listaEquipo) {
            listModelEquipos.addElement(String.format("%s - %s (%s)",
                    e.getNombre(), e.getCiudad(), e.getPais()));
            listaIdEquipos.add(e.getId());

        }

        // Establecer el modelo en la lista para que se visualice.
        jListEquipos.setModel(listModelEquipos);
    }

    public void actualizarListaJugadores() {
        // Obtener cadena de búsqueda
        String busqueda = jTextFieldBuscarEquipos.getText();
        // Crear modelo para la lista
        DefaultListModel<String> listModelJugadores = new DefaultListModel<>();
        // Obtener el orden seleccionado
        int orden = (jRadioButtonOrdenNombre.isSelected()) ? Equipo.ORDEN_NOMBRE : Equipo.ORDEN_PAIS;
        //Obtener equipos
        List<Jugador> listaJugadores = Jugador.obtenerJugadores(busqueda, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);

        // vaciar la lista de ids de jugadores
        listaIdJugadores.clear();

        // añadir cadenas al modelo e ir guardando los id de los equipos
        for (Jugador s : listaJugadores) {
            listModelJugadores.addElement(String.format("%s - %s (%s)",
                    s.getNombre(), s.getApellidos(), s.getEdad()));
            listaIdEquipos.add(s.getId());

        }

        // Establecer el modelo en la lista para que se visualice.
        jListJugadores.setModel(listModelJugadores);
        for (int i : listaIdJugadores) {
            System.out.println(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOrden = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListEquipos = new javax.swing.JList<>();
        jButtonAnnandirEquipo = new javax.swing.JButton();
        jButtonEditarEquipo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListJugadoresEquipo = new javax.swing.JList<>();
        jLabelLBuscar = new javax.swing.JLabel();
        jTextFieldBuscarEquipos = new javax.swing.JTextField();
        jRadioButtonOrdenNombre = new javax.swing.JRadioButton();
        jRadioButtonOrdenPais = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonEliminarEquipo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonAnnandirJugadorEquipo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListJugadores = new javax.swing.JList<>();
        jButtonEditarJugador = new javax.swing.JButton();
        jButtonAnnandirJugador = new javax.swing.JButton();
        jLabelLBuscarJugador = new javax.swing.JLabel();
        jTextFieldBuscarJugadores = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jListEquipos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListEquipos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListEquipos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListEquiposValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListEquipos);

        jButtonAnnandirEquipo.setText("Añadir");
        jButtonAnnandirEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnandirEquipoActionPerformed(evt);
            }
        });

        jButtonEditarEquipo.setText("Editar");
        jButtonEditarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarEquipoActionPerformed(evt);
            }
        });

        jListJugadoresEquipo.setBackground(new java.awt.Color(224, 224, 224));
        jScrollPane2.setViewportView(jListJugadoresEquipo);

        jLabelLBuscar.setText("Buscar");

        buttonGroupOrden.add(jRadioButtonOrdenNombre);
        jRadioButtonOrdenNombre.setSelected(true);
        jRadioButtonOrdenNombre.setText("Nombre");
        jRadioButtonOrdenNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOrdenNombreActionPerformed(evt);
            }
        });

        buttonGroupOrden.add(jRadioButtonOrdenPais);
        jRadioButtonOrdenPais.setText("Pais");

        jLabel1.setText("Orden:");

        jButtonEliminarEquipo.setText("Eliminar");
        jButtonEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarEquipoActionPerformed(evt);
            }
        });

        jLabel2.setText("Jugadores del equipo:");

        jButtonAnnandirJugadorEquipo.setText("Añadir Jugador a Equipo");
        jButtonAnnandirJugadorEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnandirJugadorEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonOrdenNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOrdenPais))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAnnandirEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEliminarEquipo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonAnnandirJugadorEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLBuscar)
                    .addComponent(jTextFieldBuscarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonOrdenNombre)
                    .addComponent(jRadioButtonOrdenPais)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAnnandirJugadorEquipo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnandirEquipo)
                    .addComponent(jButtonEditarEquipo)
                    .addComponent(jButtonEliminarEquipo))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Equipos", jPanel1);

        jListJugadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListJugadores);

        jButtonEditarJugador.setText("Editar");
        jButtonEditarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarJugadorActionPerformed(evt);
            }
        });

        jButtonAnnandirJugador.setText("Añadir");
        jButtonAnnandirJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnandirJugadorActionPerformed(evt);
            }
        });

        jLabelLBuscarJugador.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonAnnandirJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEditarJugador))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelLBuscarJugador)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBuscarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 318, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLBuscarJugador)
                    .addComponent(jTextFieldBuscarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnandirJugador)
                    .addComponent(jButtonEditarJugador))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Jugadores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        actualizarListaEquipos();
        actualizarListaJugadores();
    }//GEN-LAST:event_formWindowOpened

    private void jListEquiposValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListEquiposValueChanged
        if (evt.getValueIsAdjusting()) { // Un evento transitorio en seleccion múltiple
            return; // no nos interesa
        }
        int index = jListEquipos.getSelectedIndex();
        Equipo e = new Equipo(index);
        int id = listaIdEquipos.get(index);
        e.retrieve();
        if (index >= 0) {
            DefaultListModel<String> listModelJugadores = new DefaultListModel<>();
            List<Jugador> listaJugadores = e.getJugadores();
            for (Jugador j : listaJugadores) {
                listModelJugadores.addElement(String.format("%s, %s (%d)",
                        j.getApellidos(), j.getNombre(), j.getEdad()));
            }
            jListJugadoresEquipo.setModel(listModelJugadores);
        }
    }//GEN-LAST:event_jListEquiposValueChanged

    private void jRadioButtonOrdenNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOrdenNombreActionPerformed

    }//GEN-LAST:event_jRadioButtonOrdenNombreActionPerformed

    private void jButtonAnnandirEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnandirEquipoActionPerformed
        Equipo e = new Equipo();
        EquipoJDialog dialogoEquipo = new EquipoJDialog(this, e);
        dialogoEquipo.setVisible(true);
        actualizarListaEquipos();
    }//GEN-LAST:event_jButtonAnnandirEquipoActionPerformed

    private void jButtonEditarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarEquipoActionPerformed
        int index = jListEquipos.getSelectedIndex();
        if (index >= 0) {
            int id = listaIdEquipos.get(index);
            Equipo e = new Equipo(id);
            e.retrieve();
            EquipoJDialog dialogoEquipo = new EquipoJDialog(this, e);
            dialogoEquipo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un equipo", "Atención", JOptionPane.WARNING_MESSAGE);
        }
        actualizarListaEquipos();

    }//GEN-LAST:event_jButtonEditarEquipoActionPerformed

    private void jButtonAnnandirJugadorEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnandirJugadorEquipoActionPerformed
        int index = jListEquipos.getSelectedIndex();
        if (index >= 0) {
            int id = listaIdEquipos.get(index);
            Jugador j = new Jugador();
            j.setIdEquipo(id);
            JugadorJDialog dialogoJugador = new JugadorJDialog(this, j);
            dialogoJugador.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un equipo", "Atención", JOptionPane.WARNING_MESSAGE);
        }
        actualizarListaJugadores();
    }//GEN-LAST:event_jButtonAnnandirJugadorEquipoActionPerformed

    private void jButtonEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarEquipoActionPerformed
        int index = jListEquipos.getSelectedIndex();
        if (index >= 0) {
            if (JOptionPane.showConfirmDialog(this, "¿Está seguro?", "Confirmación", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                int id = listaIdEquipos.get(index);
                Equipo e = new Equipo(id);
                e.delete();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un equipo", "Atención", JOptionPane.WARNING_MESSAGE);
        }
        actualizarListaEquipos();

    }//GEN-LAST:event_jButtonEliminarEquipoActionPerformed

    private void jButtonAnnandirJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnandirJugadorActionPerformed
        Jugador j = new Jugador();
        JugadorJDialog dialogoJugador = new JugadorJDialog(this, j);
        dialogoJugador.setVisible(true);
        actualizarListaEquipos();
    }//GEN-LAST:event_jButtonAnnandirJugadorActionPerformed

    private void jButtonEditarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarJugadorActionPerformed
        int index = jListJugadores.getSelectedIndex();
        if (index >= 0) {
            int id = listaIdJugadores.get(index);
            Jugador j = new Jugador(id);
            j.retrieve();
            JugadorJDialog dialogoJugador = new JugadorJDialog(this, j);
            dialogoJugador.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un equipo", "Atención", JOptionPane.WARNING_MESSAGE);
        }
        
        actualizarListaJugadores();
    }//GEN-LAST:event_jButtonEditarJugadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupOrden;
    private javax.swing.JButton jButtonAnnandirEquipo;
    private javax.swing.JButton jButtonAnnandirJugador;
    private javax.swing.JButton jButtonAnnandirJugadorEquipo;
    private javax.swing.JButton jButtonEditarEquipo;
    private javax.swing.JButton jButtonEditarJugador;
    private javax.swing.JButton jButtonEliminarEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLBuscar;
    private javax.swing.JLabel jLabelLBuscarJugador;
    private javax.swing.JList<String> jListEquipos;
    private javax.swing.JList<String> jListJugadores;
    private javax.swing.JList<String> jListJugadoresEquipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonOrdenNombre;
    private javax.swing.JRadioButton jRadioButtonOrdenPais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldBuscarEquipos;
    private javax.swing.JTextField jTextFieldBuscarJugadores;
    // End of variables declaration//GEN-END:variables
}
