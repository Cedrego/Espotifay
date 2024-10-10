package Capa_Presentacion;

import Logica.Factory;
import Logica.ICtrl;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JList;
import javax.swing.JScrollPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cedre
 */
public class IAgregarTema extends javax.swing.JPanel {

    /**
     * Creates new form IAltaPerfil
     */
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public IAgregarTema() {
        initComponents();
        Text1.setText("Tipo de Lista");
        jComboBox1.addItem("Particular");
        jComboBox1.addItem("Por Defecto");
        Text3.setText("Listas");
        Text4.setText("Temas");
        Text5.setVisible(false);
        Text6.setText("Temas ya Agregados");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text1 = new javax.swing.JLabel();
        ACEPTAR = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        Text2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Text3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Text4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        Text5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Text6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        Text1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Text1");

        ACEPTAR.setBackground(new java.awt.Color(0, 204, 102));
        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Text2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Text2");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Text3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Text3");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        Text4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text4.setForeground(new java.awt.Color(255, 255, 255));
        Text4.setText("Text4");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        Text5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text5.setForeground(new java.awt.Color(255, 255, 255));
        Text5.setText("Text5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Text6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text6.setForeground(new java.awt.Color(255, 255, 255));
        Text6.setText("Text6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACEPTAR)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACEPTAR)
                    .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        Object selectedItem1 = jComboBox1.getSelectedItem();
        //Object selectedItem2 = jComboBox2.getSelectedItem();
        String GoC = jComboBox2.getSelectedItem() != null ? jComboBox2.getSelectedItem().toString() : "";
        if("Particular".equals(selectedItem1)){
            if(jComboBox3.getItemCount() > 0){
                jComboBox3.removeAllItems();
            }
            for (String Part : ctrl.obtenerNombresDeListPart((String) GoC)) {
                    jComboBox3.addItem(Part);
            }
        }else{
            if(jComboBox3.getItemCount() > 0){
                jComboBox3.removeAllItems();
            }
            for (String PD : ctrl.obtenerNombresDeListPD((String) GoC)) {
                    jComboBox3.addItem(PD);
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:        
        //Particular o porDefecto
        Object selectedItem = jComboBox1.getSelectedItem();
        if("Particular".equals(selectedItem)){
            Text2.setText("Clientes");
            if(jComboBox2.getItemCount() > 0){
                jComboBox2.removeAllItems();
            }
            //Agregar nombres de los clientes
             for (String cli : ctrl.obtenerNombresDeCliente()) {
                    jComboBox2.addItem(cli);
            }
        }else{
            Text2.setText("Generos");
            if(jComboBox2.getItemCount() > 0){
                jComboBox2.removeAllItems();
            }
            //Agregar nombres de los Generos
            for (String genero : ctrl.obtenerNombresDeGeneros()) {
                if(!"Genero".equals(genero)){
                    jComboBox2.addItem(genero);
                }
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        // TODO add your handling code here:
        String PoPD = jComboBox1.getSelectedItem() != null ? jComboBox1.getSelectedItem().toString() : "";
        String nom = jComboBox2.getSelectedItem() != null ? jComboBox2.getSelectedItem().toString() : "";
        String NomPlay = jComboBox3.getSelectedItem() != null ? jComboBox3.getSelectedItem().toString() : ""; 
        Object selectedItem = jComboBox4.getSelectedItem();
        // Verifica que el elemento seleccionado no sea nulo
        if(selectedItem != null){
            String NomTema = jComboBox4.getSelectedItem() != null ? jComboBox4.getSelectedItem().toString() : "";
            //En la funcion AgregarTemaLista verifica si es Particular o PorDefecto
            ctrl.AddTemaList(PoPD, NomPlay, NomTema, nom);
            Text5.setVisible(false);
            Text5.setText("Tema "+NomTema+" Agregado con Exito");
            Text5.setVisible(true);
            // Eliminar el tema de jComboBox4
            jComboBox4.removeItem(NomTema); // Eliminar el tema de jComboBox4
            System.out.println("Tema eliminado de ComboBox4: " + NomTema);
        }else{
            Text5.setVisible(false);
            Text5.setText("No hay ningún tema seleccionado");
            Text5.setVisible(true);
        }
        List<String> listaTemas;
        if ("Particular".equals(PoPD)) {
            listaTemas = ctrl.obtenerNombresTemaParaPartREMOVE(NomPlay, nom);
        } else {
            listaTemas = ctrl.obtenerNombresTemaParaPDREMOVE(NomPlay, nom);
        }
        // Limpiar el JPanel y preparar para mostrar los temas
        jPanel1.removeAll();
        jPanel1.setLayout(new BorderLayout());

        // Crear un JList para mostrar los temas
        JList<String> listaJList = new JList<>(listaTemas.toArray(new String[0]));

        // Hacer que la lista sea desplazable si es necesario
        JScrollPane scrollPane = new JScrollPane(listaJList);

        // Agregar el JList (dentro de JScrollPane) al JPanel
        jPanel1.add(scrollPane, BorderLayout.CENTER);

        // Refrescar el JPanel para que se muestre el nuevo contenido
        jPanel1.revalidate();
        jPanel1.repaint();   
    }//GEN-LAST:event_ACEPTARActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        Object selectedItem1 = jComboBox1.getSelectedItem();
        String nom = jComboBox2.getSelectedItem() != null ? jComboBox2.getSelectedItem().toString() : "";
        String NomPlay = jComboBox3.getSelectedItem() != null ? jComboBox3.getSelectedItem().toString() : ""; 
        if("Particular".equals(selectedItem1)){
            if(jComboBox4.getItemCount() > 0){
                jComboBox4.removeAllItems();
            }            
            for (String tem : ctrl.obtenerNombresTemaParaPartADD(NomPlay, nom)) {
                jComboBox4.addItem(tem);
            }  
        }else{
            if(jComboBox4.getItemCount() > 0){
                jComboBox4.removeAllItems();
            }
           
            for (String tem : ctrl.obtenerNombresTemaParaPDADD(NomPlay, nom)) {
                jComboBox4.addItem(tem);
            }
        }
        List<String> listaTemas;
        if ("Particular".equals(selectedItem1)) {
            listaTemas = ctrl.obtenerNombresTemaParaPartREMOVE(NomPlay, nom);
        } else {
            listaTemas = ctrl.obtenerNombresTemaParaPDREMOVE(NomPlay, nom);
        }
        // Limpiar el JPanel y preparar para mostrar los temas
        jPanel1.removeAll();
        jPanel1.setLayout(new BorderLayout());

        // Crear un JList para mostrar los temas
        JList<String> listaJList = new JList<>(listaTemas.toArray(new String[0]));

        // Hacer que la lista sea desplazable si es necesario
        JScrollPane scrollPane = new JScrollPane(listaJList);

        // Agregar el JList (dentro de JScrollPane) al JPanel
        jPanel1.add(scrollPane, BorderLayout.CENTER);

        // Refrescar el JPanel para que se muestre el nuevo contenido
        jPanel1.revalidate();
        jPanel1.repaint();
    }//GEN-LAST:event_jComboBox3ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
