package Capa_Presentacion;

import Logica.Factory;
import Logica.ICtrl;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cedre
 */
public class IAltaAlbum extends javax.swing.JPanel {
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    List <Integer> ordenesIngresados = new ArrayList();
    List <String> nombresIngresados = new ArrayList();
    List <String> generosAlbum = new ArrayList(); //por las dudas
    List <DataTema> temasAlbum = new ArrayList();
    public IAltaAlbum() {
        initComponents();
        generosAlbum.clear();
        temasAlbum.clear();
        ordenesIngresados.clear();
        nombresIngresados.clear();
        ACEPTAR.setVisible(false);
        Text1.setVisible(false);
        Text10.setVisible(false);
        Text2.setVisible(false);
        Text3.setVisible(false);
        Text4.setVisible(false);
        Text5.setVisible(false);
        Text6.setVisible(false);
        Text7.setVisible(false);
        Text8.setVisible(false);
        TextField2.setVisible(false);
        TextField2.setText("");
        TextField3.setVisible(false);
        TextField3.setText("");
        TextField4.setVisible(false);
        TextField4.setText("");
        TextField5.setVisible(false);
        TextField5.setText("");
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox4.setVisible(false);
        jScrollPane1.setVisible(false);
        
        Text1.setText("Artista:");
        
        if(ctrl.obtenerNombresDeArtista().isEmpty()){
            System.out.println("no hay artistas jefesito");
        }else{
            for (String art: ctrl.obtenerNombresDeArtista()){
                    jComboBox1.addItem(art);
                
            }
        }
        
        jButton1.setText("Seleccionar Autor");
        
        
        jButton1.setVisible(true);
        Text1.setVisible(true);
        jComboBox1.setVisible(true);
        ACEPTAR.setVisible(false);
        
        
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
        Text1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Text2 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Text4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Text5 = new javax.swing.JLabel();
        Text6 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        TextField3 = new javax.swing.JTextField();
        TextField4 = new javax.swing.JTextField();
        TextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        Text8 = new javax.swing.JLabel();
        Text10 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ACEPTAR.setBackground(new java.awt.Color(0, 204, 102));
        ACEPTAR.setForeground(new java.awt.Color(0, 0, 0));
        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });
        add(ACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        Text1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Text1");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 170, 30));

        Text2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Text2");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 20));

        Text3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Text3");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 310, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        Text4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text4.setForeground(new java.awt.Color(255, 255, 255));
        Text4.setText("Text4");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 20));

        jButton2.setBackground(new java.awt.Color(0, 204, 102));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 30));

        Text5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text5.setForeground(new java.awt.Color(255, 255, 255));
        Text5.setText("Text5");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, 20));

        Text6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text6.setForeground(new java.awt.Color(255, 255, 255));
        Text6.setText("Text6");
        add(Text6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, 20));

        Text7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text7.setForeground(new java.awt.Color(255, 255, 255));
        Text7.setText("Text7");
        add(Text7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, 20));

        TextField3.setBackground(new java.awt.Color(102, 102, 102));
        TextField3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField3.setForeground(new java.awt.Color(255, 255, 255));
        TextField3.setText("TextField3");
        TextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField3ActionPerformed(evt);
            }
        });
        add(TextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 20));

        TextField4.setBackground(new java.awt.Color(102, 102, 102));
        TextField4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField4.setForeground(new java.awt.Color(255, 255, 255));
        TextField4.setText("TextField4");
        TextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField4ActionPerformed(evt);
            }
        });
        add(TextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 110, 20));

        TextField5.setBackground(new java.awt.Color(102, 102, 102));
        TextField5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField5.setForeground(new java.awt.Color(255, 255, 255));
        TextField5.setText("TextField5");
        TextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField5ActionPerformed(evt);
            }
        });
        add(TextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 100, 20));

        jButton3.setBackground(new java.awt.Color(0, 204, 102));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 190, 20));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        Text8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text8.setForeground(new java.awt.Color(255, 255, 255));
        Text8.setText("Text8");
        add(Text8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 320, 30));

        Text10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text10.setForeground(new java.awt.Color(255, 255, 255));
        Text10.setText("Text10");
        add(Text10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 310, 30));

        TextField2.setBackground(new java.awt.Color(102, 102, 102));
        TextField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField2.setForeground(new java.awt.Color(255, 255, 255));
        TextField2.setText("TextField2");
        TextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField2ActionPerformed(evt);
            }
        });
        add(TextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 310, 20));
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 430, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField3ActionPerformed

    private void TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField4ActionPerformed

    private void TextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Text2.setText("Nombre del Album:");
        Text3.setText("Año de salida:");
        Text4.setText("Genero:");
        jButton2.setText("Agregar Genero");
        if(generosAlbum.isEmpty()){
            Text8.setVisible(false);
        }
        
        Text2.setVisible(true);
        Text3.setVisible(true);
        Text4.setVisible(true);
           
        TextField2.setVisible(true);
        
        for (Integer i = 2024; i >= 1920; i--) {
            jComboBox4.addItem(i.toString());
        }
        jComboBox4.setVisible(true);

        if(ctrl.obtenerNombresDeGeneros().isEmpty()){
            System.out.println("no hay generos jefesito");
        }else{
            for (String gen: ctrl.obtenerNombresDeGeneros()){
                if(gen.equalsIgnoreCase("Genero")){
                    
                }else{
                    jComboBox2.addItem(gen);
                }
            }
        }
        
        jComboBox2.setVisible(true);
        jButton2.setVisible(true);
        
        
        Text5.setText("Nombre");
        Text6.setText("Duracion (xx:xx)");
        Text7.setText("Posicion en el Album");
        jButton3.setText("Agregar Cancion");
        jButton3.setVisible(true);
        Text5.setVisible(true);
        Text6.setVisible(true);
        Text7.setVisible(true);
        
        
        TextField3.setVisible(true);
        TextField4.setVisible(true);
        TextField5.setVisible(true);

        ACEPTAR.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String gen = jComboBox2.getSelectedItem().toString() != null ? jComboBox2.getSelectedItem().toString() : "";

        if (generosAlbum.contains(gen)){
            Text10.setVisible(false);
            Text10.setText("Genero ya aniadido");
            Text10.setVisible(true);

        } else{
            Text10.setVisible(false);
            Text10.setText("Genero aniadido");
            Text10.setVisible(true);
            
            generosAlbum.add(gen);
        } 
        
        String cadenaGeneros = "";
        for(String geneneroCadena : generosAlbum){
            cadenaGeneros = cadenaGeneros.concat(geneneroCadena+" || ");
        }
        Text8.setText("Generos aniadidos: "+cadenaGeneros);
        Text8.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         //variable para guardar la direccion del tema
        String direccion = null;
        
        //creo opciones para una ventana emergente
        Object[] options = {"URL", "Archivo"};

        // muestro una ventana emergente con las opciones
        int eleccion = JOptionPane.showOptionDialog(
            null,
            "Seleccione como desea guardar la cancion:",
            "URL o Archivo",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]);
            
            //si elgie URL
            if (eleccion == 0){
                //muestro un input para la url
                String url = JOptionPane.showInputDialog(null, "Ingrese la URL:");
                if (url != null && !url.trim().isEmpty()) {
                    direccion = url;
                }
            }else{
                //si elige archivo
                if(eleccion == 1){
                    //creo el selector
                    JFileChooser chooser = new JFileChooser();
                    //creo un filtro
                    FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.MP3", "mp3");
                    //aplico el filtro al selector
                    chooser.setFileFilter(filtro);
                    
                    //muestro la ventana donde pueden seleccionar el archivo
                    int seleccion = chooser.showOpenDialog(this);
                    //si seleccionan un archivo y le dan a OK
                    if (seleccion == JFileChooser.APPROVE_OPTION){
                        File fichero = chooser.getSelectedFile();
                        direccion = fichero.getAbsolutePath();
                        System.out.println("el fichero está en: "+ direccion);
                    } else{
                        Text10.setVisible(false);
                        Text10.setText("Fichero no seleccionado");
                        Text10.setVisible(true);
                    }
                }
            }
            
            //preguntto si es null por las dudas
            if(direccion != null){
                int posicionC = Integer.parseInt((String) TextField5.getText());
                DataTema dt = ctrl.crearDataTemaAltaAlbum(temasAlbum, TextField3.getText(), TextField2.getText(), TextField4.getText(), posicionC, direccion, generosAlbum);
                    
                
                if (dt==null){
                    Text10.setVisible(false);
                    Text10.setText("Tema ya aniadido");
                    Text10.setVisible(true);
                    
                }else if(ordenesIngresados.contains(posicionC)){
                    Text10.setVisible(false);
                    Text10.setText("Eliga otra posicion");
                    Text10.setVisible(true);
                }else{
                    ordenesIngresados.add(posicionC);
                    Text10.setVisible(false);
                    Text10.setText("Tema aniadido");
                    Text10.setVisible(true);
                    //agrego a la lista de temas (se borra despues de usarse)
                    temasAlbum.add(dt);
                    ctrl.ordenarTemasPorPosicion(temasAlbum);
                }
            } else {
                ctrl.ordenarTemasPorPosicion(temasAlbum);
                Text10.setVisible(false);
                Text10.setText("Direccion de guardado nula");
                Text10.setVisible(true);
            }
            
            if(!(temasAlbum.isEmpty())){
                JPanel panelContenedor = new JPanel();
                panelContenedor.setLayout(new BoxLayout(panelContenedor, BoxLayout.Y_AXIS));
                
                for(DataTema tem : temasAlbum){
                    
                    // Crear un nuevo panel para cada tema
                    JPanel info = new JPanel();
                    info.setLayout(new FlowLayout(FlowLayout.LEFT));

                    JLabel labelNombre = new JLabel(tem.getNombre() + " - ");
                    labelNombre.setFont(new Font("Arial", Font.PLAIN, 12));
                    labelNombre.setForeground(Color.BLACK);

                    JLabel labelDuracion = new JLabel(tem.getDuracion() + " mins" + "  ");
                    labelDuracion.setFont(new Font("Arial", Font.PLAIN, 12));
                    labelDuracion.setForeground(Color.BLACK);

                    JLabel labelOrden = new JLabel(tem.getOrdenAlbum() + " - ");
                    labelOrden.setFont(new Font("Arial", Font.PLAIN, 12));
                    labelOrden.setForeground(Color.BLACK);

                    // Agregar etiquetas al panel de tema
                    info.add(labelOrden); //el niño mimado pidio que modificara como se muestra
                    info.add(labelNombre);
                    info.add(labelDuracion);

                    // Botón para abrir el archivo o URL
                    JButton botonTema = new JButton("Borrar");
                    botonTema.addActionListener(e -> {        
                        int posTem = tem.getOrdenAlbum();
                        ordenesIngresados.remove(Integer.valueOf(posTem));
                        
                        temasAlbum.remove(tem);

                        panelContenedor.remove(info);
                        jScrollPane1.revalidate();
                        jScrollPane1.repaint();

                        Text10.setVisible(false);
                        Text10.setText("Tema borrado");
                        Text10.setVisible(true);
                    });
                    info.add(botonTema);
                    panelContenedor.add(info);
                }
                jScrollPane1.setViewportView(panelContenedor);
                jScrollPane1.setVisible(true);
                jScrollPane1.revalidate();
                jScrollPane1.repaint();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField2ActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        String nombreArtista = jComboBox1.getSelectedItem()!= null ? jComboBox1.getSelectedItem().toString() : "";
        String nombreAlbum = TextField2.getText();
        String anio = jComboBox4.getSelectedItem()!= null ? jComboBox4.getSelectedItem().toString() : "";
        int anioCreacion = Integer.parseInt((String) anio);

        Text10.setVisible(false);
        Text10.setText("Ingresado con exito");
        Text10.setVisible(true);
        
        ctrl.CrearAlbum(null,nombreAlbum, nombreArtista, anioCreacion, generosAlbum, temasAlbum);
        ctrl.DeleteArtista(nombreArtista);
        temasAlbum.clear();
        generosAlbum.clear();
        
    }//GEN-LAST:event_ACEPTARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
