package Capa_Presentacion;

import Logica.Factory;
import Logica.ICtrl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cedre
 */
public class IQuitarTema extends javax.swing.JPanel {

    /**
     * Creates new form IAltaPerfil
     */
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public IQuitarTema() {
        initComponents();
        Text1.setText("Tipo de Lista");
        jComboBox1.addItem("Particular");
        jComboBox1.addItem("Por Defecto");
        Text3.setText("Listas");
        Text4.setText("Temas");
        Text5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ACEPTAR = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        Text4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Text3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Text2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Text1 = new javax.swing.JLabel();
        Text5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        ACEPTAR.setBackground(new java.awt.Color(0, 204, 102));
        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        Text4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text4.setForeground(new java.awt.Color(255, 255, 255));
        Text4.setText("Text4");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        Text3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Text3");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Text2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Text2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Text1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Text1");

        Text5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text5.setForeground(new java.awt.Color(255, 255, 255));
        Text5.setText("Text4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 372, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACEPTAR)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ACEPTAR)
                    .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
         Object selectedItem1 = jComboBox1.getSelectedItem();
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

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
         Object selectedItem1 = jComboBox1.getSelectedItem();
        String nom = jComboBox2.getSelectedItem() != null ? jComboBox2.getSelectedItem().toString() : "";
        String NomPlay = jComboBox3.getSelectedItem() != null ? jComboBox3.getSelectedItem().toString() : ""; 
        if("Particular".equals(selectedItem1)){
            if(jComboBox4.getItemCount() > 0){
                jComboBox4.removeAllItems();
            }            
            for (String tem : ctrl.obtenerNombresTemaParaPartREMOVE(NomPlay, nom)) {
                jComboBox4.addItem(tem);
            }
        }else{
            if(jComboBox4.getItemCount() > 0){
                jComboBox4.removeAllItems();
            }
           
            for (String tem : ctrl.obtenerNombresTemaParaPDREMOVE(NomPlay, nom)) {
                jComboBox4.addItem(tem);
            }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        // TODO add your handling code here:
         String PoPD = jComboBox1.getSelectedItem() != null ? jComboBox1.getSelectedItem().toString() : "";
        String nom = jComboBox2.getSelectedItem() != null ? jComboBox2.getSelectedItem().toString() : "";
        String NomPlay = jComboBox3.getSelectedItem() != null ? jComboBox3.getSelectedItem().toString() : ""; 
        Object selectedItem = jComboBox4.getSelectedItem();
        // Verifica que el elemento seleccionado no sea nulo
        if(selectedItem != null){
            String NomTema = jComboBox4.getSelectedItem() != null ? jComboBox4.getSelectedItem().toString() : "";
            //En la funcion QuitarTemaLista verifica si es Particular o PorDefecto
            ctrl.RemoveTemaList(PoPD, NomPlay, NomTema, nom);
            Text5.setVisible(false);
            Text5.setText("Tema "+NomTema+" Eliminado con Exito");
            Text5.setVisible(true);
            // Eliminar el tema de jComboBox4
            jComboBox4.removeItem(NomTema); // Eliminar el tema de jComboBox4
            System.out.println("Tema eliminado de ComboBox4: " + NomTema);
        }else{
            Text5.setVisible(false);
            Text5.setText("No hay ningún tema seleccionado");
            Text5.setVisible(true);
        }
    }//GEN-LAST:event_ACEPTARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    // End of variables declaration//GEN-END:variables
}
