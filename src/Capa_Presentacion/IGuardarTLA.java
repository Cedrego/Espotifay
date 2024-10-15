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
public class IGuardarTLA extends javax.swing.JPanel {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    /**
     * Creates new form IAltaPerfil
     */
    public IGuardarTLA() {
        initComponents();
        ACEPTAR.setVisible(false);
        Text1.setVisible(false);
        Text2.setVisible(false);
        Text3.setVisible(false);
        Text4.setVisible(false);
        Text5.setVisible(false);
        Text6.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        jComboBox4.removeAllItems();
        jComboBox5.removeAllItems();
        
        Text1.setText("Cliente:");
        for (String cli : ctrl.obtenerNombresDeCliente()) {
            jComboBox1.addItem(cli);
        }
        Text1.setVisible(true);
        jComboBox1.setVisible(true);
       
        Text2.setText("Que desea agregar a favoritos?");
        
        jComboBox2.addItem("Tema");
        jComboBox2.addItem("Lista");
        jComboBox2.addItem("Album");
        
        Text2.setVisible(true);
        jComboBox2.setVisible(true);
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
        jComboBox5 = new javax.swing.JComboBox<>();
        Text6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Text1");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 20));

        ACEPTAR.setBackground(new java.awt.Color(0, 204, 102));
        ACEPTAR.setForeground(new java.awt.Color(0, 0, 0));
        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });
        add(ACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, -1));

        Text2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Text2");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, -1));

        Text3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Text3");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 370, 20));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 210, -1));

        Text4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text4.setForeground(new java.awt.Color(255, 255, 255));
        Text4.setText("Text4");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 350, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, -1));

        Text5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text5.setForeground(new java.awt.Color(255, 255, 255));
        Text5.setText("Text5");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 340, 20));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, -1));

        Text6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text6.setForeground(new java.awt.Color(255, 255, 255));
        Text6.setText("Text6");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 460, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String nombreCliente = jComboBox1.getSelectedItem()!= null ? jComboBox1.getSelectedItem().toString() : "";
        System.out.println(nombreCliente+" seleccionado");
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String fav = jComboBox2.getSelectedItem()!= null ? jComboBox2.getSelectedItem().toString() : "";
        System.out.println(fav+" seleccionado");
        
        Text3.setText("Seleccione filtro:");
        jComboBox3.removeAllItems();
        
        if(fav.equalsIgnoreCase("Tema")){
            jComboBox3.addItem("Album");
            jComboBox3.addItem("Genero");
            jComboBox3.addItem("Lista Particular");
            jComboBox3.addItem("Lista Por Defecto");
        }
        
        if(fav.equalsIgnoreCase("Album")){
            jComboBox3.addItem("Artista");
            jComboBox3.addItem("Genero");
        }
        
        if(fav.equalsIgnoreCase("Lista")){
            jComboBox3.addItem("Particular");
            jComboBox3.addItem("Por defecto");
        }
        
        Text3.setVisible(true);
        jComboBox3.setVisible(true);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

        String fav = jComboBox2.getSelectedItem()!= null ? jComboBox2.getSelectedItem().toString() : "";
        String filtro = jComboBox3.getSelectedItem()!= null ? jComboBox3.getSelectedItem().toString() : "";
        
        jComboBox4.removeAllItems();
        if(fav.equalsIgnoreCase("Tema")){
            if(filtro.equalsIgnoreCase("Album")){
                Text4.setText("Seleccione el Album: ");
                for(String alb : ctrl.obtenerNombresDeAlbumes()){
                    jComboBox4.addItem(alb);
                }
            }
            
            if(filtro.equalsIgnoreCase("Genero")){
                Text4.setText("Seleccione el Genero: ");
                for(String gen : ctrl.obtenerNombresDeGeneros()){
                    if (gen.equalsIgnoreCase("Genero")){
                        
                    }else{
                        jComboBox4.addItem(gen);
                    }
                }
            }
            
            if(filtro.equalsIgnoreCase("Lista Particular")){
                Text4.setText("Seleccione la Lista: ");
                for(String part : ctrl.obtenerNombresListasPartTODO()){
                    if(!(ctrl.esPrivado(part, ctrl.obtenerDuenioPart(part)))){
                        jComboBox4.addItem(part);
                    }
                }
            }    
            
            if(filtro.equalsIgnoreCase("Lista Por Defecto")){
                for(String pd : ctrl.obtenerNombresListasPDTODO()){
                    jComboBox4.addItem(pd);
                }
            }
        }
        
        if(fav.equalsIgnoreCase("Album")){
            if(filtro.equalsIgnoreCase("Artista")){
                Text4.setText("Seleccione el Artista: ");
                for (String art : ctrl.obtenerNombresDeArtista()) {
                    jComboBox4.addItem(art);
                }
            }
            
            if(filtro.equalsIgnoreCase("Genero")){
                Text4.setText("Seleccione el Genero: ");
                for(String gen : ctrl.obtenerNombresDeGeneros()){
                    if (gen.equalsIgnoreCase("Genero")){
                        
                    }else{
                    jComboBox4.addItem(gen);
                    }
                }
            } 
        }
        
        if(fav.equalsIgnoreCase("Lista")){
            if(filtro.equalsIgnoreCase("Particular")){
                Text4.setText("Seleccione el Cliente dueño de la Lista: ");
                for (String cli : ctrl.obtenerNombresClienteConParticular()) {
                    jComboBox4.addItem(cli);
                }
            }
            
            if(filtro.equalsIgnoreCase("Por defecto")){
                Text4.setText("Seleccione el Genero de la Lista: ");
                for(String gen : ctrl.obtenerNombresDeGenerosConPorDefecto()){
                    if(gen.equalsIgnoreCase("Genero")){
                        
                    }else{
                        jComboBox4.addItem(gen);
                    }
                }
            }      
        }
        
        Text4.setVisible(true);
        jComboBox4.setVisible(true);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        String fav = jComboBox2.getSelectedItem()!= null ? jComboBox2.getSelectedItem().toString() : "";
        String filtro = jComboBox3.getSelectedItem()!= null ? jComboBox3.getSelectedItem().toString() : "";
        String segundoFiltro = jComboBox4.getSelectedItem()!= null ? jComboBox4.getSelectedItem().toString() : "";
        
        jComboBox5.removeAllItems();
        //tema
        if(fav.equalsIgnoreCase("Tema")){
            Text5.setText("Seleccione el Tema: ");
            if(filtro.equalsIgnoreCase("Album")){   
                for(String tema : ctrl.obtenerTemasDeAlbum(segundoFiltro)){
                    jComboBox5.addItem(tema);
                }
            }

            if(filtro.equalsIgnoreCase("Genero")){
                for(String tema : ctrl.obtenerTemasDeGenero(segundoFiltro)){
                    jComboBox5.addItem(tema);
                }
            }

            if(filtro.equalsIgnoreCase("Lista Particular")){
                Text4.setText("Seleccione la Lista: ");
                for(String tema : ctrl.obtenerTemasDeParticular(segundoFiltro)){
                    jComboBox5.addItem(tema);
                }
            }    

            if(filtro.equalsIgnoreCase("Lista Por Defecto")){
                for(String tema : ctrl.obtenerTemasDePD(segundoFiltro)){
                    jComboBox5.addItem(tema);
                }
            }   
        }

        //album
        if(fav.equalsIgnoreCase("Album")){
            Text5.setText("Seleccione el Album: ");
            if(filtro.equalsIgnoreCase("Artista")){
                for (String alb : ctrl.obtenerAlbumesDeArtista(segundoFiltro)) {
                    jComboBox5.addItem(alb);
                }
            }

            if(filtro.equalsIgnoreCase("Genero")){
                for(String alb : ctrl.obtenerAlbumesDeGenero(segundoFiltro)){
                    jComboBox5.addItem(alb);
                }
            } 
        }
        
        //listas
        if(fav.equalsIgnoreCase("Lista")){
            Text5.setText("Seleccione la lista");
            if(filtro.equalsIgnoreCase("Particular")){
                if(ctrl.obtenerPartPublicaDeDuenio(segundoFiltro)!=null){
                    for (String part : ctrl.obtenerPartPublicaDeDuenio(segundoFiltro)){
                        jComboBox5.addItem(part);
                    }
                }
            }
            if(filtro.equalsIgnoreCase("Por Defecto")){
                if(ctrl.obtenerListasDeGenero(segundoFiltro)!=null){
                    for (String pd : ctrl.obtenerListasDeGenero(segundoFiltro)){
                        jComboBox5.addItem(pd);
                    }
                }
            }
        }
        Text5.setVisible(true);
        jComboBox5.setVisible(true);
        ACEPTAR.setVisible(true);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        String nickCliente = jComboBox1.getSelectedItem()!= null ? jComboBox1.getSelectedItem().toString() : "";
        String fav = jComboBox2.getSelectedItem()!= null ? jComboBox2.getSelectedItem().toString() : "";
        String filtro = jComboBox3.getSelectedItem()!= null ? jComboBox3.getSelectedItem().toString() : "";
        String duenioLista = jComboBox4.getSelectedItem()!= null ? jComboBox4.getSelectedItem().toString() : "";
        String objeto = jComboBox5.getSelectedItem()!= null ? jComboBox5.getSelectedItem().toString() : "";
        
        
        
        if(fav.equalsIgnoreCase("Tema")){
            if(ctrl.chequearFavorito(fav, objeto, nickCliente)){
                Text6.setVisible(false);
                Text6.setText(objeto+" ya esta en favoritos del cliente");
                Text6.setVisible(true);
            }else{
                ctrl.guardarTLA(fav, objeto, nickCliente,"Potato");
                Text6.setVisible(false);
                Text6.setText(objeto+" fue agregado a favoritos del cliente");
                Text6.setVisible(true);
            }
        }
        
        if(fav.equalsIgnoreCase("Album")){
            if(ctrl.chequearFavorito(fav, objeto, nickCliente)){
                Text6.setVisible(false);
                Text6.setText(objeto+" ya esta en favoritos del cliente");
                Text6.setVisible(true);
            }else{
                ctrl.guardarTLA(fav, objeto, nickCliente,"Potato");
                Text6.setVisible(false);
                Text6.setText(objeto+" fue agregado a favoritos del cliente");
                Text6.setVisible(true);
            }
        }
        
        if(fav.equalsIgnoreCase("Lista")){
            if(filtro.equalsIgnoreCase("Particular")){
                if(ctrl.chequearFavorito(filtro, objeto, nickCliente)){
                    Text6.setVisible(false);
                    Text6.setText(objeto+" ya esta en favoritos del cliente");
                    Text6.setVisible(true);
                }else{
                    
                    Text6.setVisible(false);
                    Text6.setText(objeto+" fue agregado a favoritos del cliente");
                    Text6.setVisible(true);
                    ctrl.guardarTLA(filtro, objeto, nickCliente,duenioLista);
                }
            }
            
            if(filtro.equalsIgnoreCase("Por Defecto")){
                if(ctrl.chequearFavorito(filtro, objeto, nickCliente)){
                    Text6.setVisible(false);
                    Text6.setText(objeto+" ya esta en favoritos del cliente");
                    Text6.setVisible(true);
                }else{
                    
                    Text6.setVisible(false);
                    Text6.setText(objeto+" fue agregado a favoritos del cliente");
                    Text6.setVisible(true);
                    ctrl.guardarTLA(filtro, objeto, nickCliente,"Potato");
                }
            }
        }
        
        
        
        
    }//GEN-LAST:event_ACEPTARActionPerformed


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
    private javax.swing.JComboBox<String> jComboBox5;
    // End of variables declaration//GEN-END:variables
}
