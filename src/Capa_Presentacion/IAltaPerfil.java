package Capa_Presentacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cedre
 */
public class IAltaPerfil extends javax.swing.JPanel {

    /**
     * Creates new form IAltaPerfil
     */
    public IAltaPerfil() {
        initComponents();
        Text1.setText("Nickname");
        Text2.setText("Nombre");
        Text3.setText("Apellido");
        Text4.setText("Correo");
        Text5.setText("Contraseña");
        Text6.setText("Confirme contraseña");
        Text7.setText("Fecha de Nacimiento");
        Text8.setText("Tipo de Perfil");
        Text9.setText("Biografia");
        Text10.setText("Pagina Web");
        Text11.setVisible(false);
        TextField1.setText("");
        TextField2.setText("");
        TextField3.setText("");
        TextField4.setText("");
        TextField5.setText("");
        TextField6.setText("");
        TextField7.setText("");
        PassField1.setText("");
        PassField2.setText("");
        TextField7.setVisible(false);
        jComboBox4.addItem("Cliente");
        jComboBox4.addItem("Artista");
        
        List<Integer> anios = new ArrayList<>();
        for (int i = 2025; i >= 1920; i--) {
        anios.add(i);
        }
        
        List<String> meses = Arrays.asList(
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        );
        
        for(int anio : anios){
            jComboBox3.addItem(String.valueOf(anio));
        }
        
        for(String mes : meses){
            jComboBox2.addItem(mes);
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

        Text1 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        Text2 = new javax.swing.JLabel();
        TextField2 = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        TextField3 = new javax.swing.JTextField();
        Text4 = new javax.swing.JLabel();
        TextField4 = new javax.swing.JTextField();
        Text5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        Text6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        ACEPTAR = new javax.swing.JButton();
        Text10 = new javax.swing.JLabel();
        CheckBox1 = new javax.swing.JCheckBox();
        Text9 = new javax.swing.JLabel();
        Text7 = new javax.swing.JLabel();
        Text8 = new javax.swing.JLabel();
        TextField7 = new javax.swing.JTextField();
        Text11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PassField1 = new javax.swing.JPasswordField();
        TextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        PassField2 = new javax.swing.JPasswordField();
        TextField6 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(51, 51, 51));

        Text1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Text1");

        TextField1.setBackground(new java.awt.Color(102, 102, 102));
        TextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField1.setForeground(new java.awt.Color(255, 255, 255));
        TextField1.setText("TextField1");
        TextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });

        Text2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Text2");

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

        Text3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text3.setForeground(new java.awt.Color(255, 255, 255));
        Text3.setText("Text3");

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

        Text4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text4.setForeground(new java.awt.Color(255, 255, 255));
        Text4.setText("Text4");

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

        Text5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text5.setForeground(new java.awt.Color(255, 255, 255));
        Text5.setText("Text5");

        jComboBox1.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        Text6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text6.setForeground(new java.awt.Color(255, 255, 255));
        Text6.setText("Text6");

        jComboBox4.setBackground(new java.awt.Color(102, 102, 102));
        jComboBox4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        TextArea1.setBackground(new java.awt.Color(102, 102, 102));
        TextArea1.setColumns(20);
        TextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextArea1.setForeground(new java.awt.Color(255, 255, 255));
        TextArea1.setRows(5);
        jScrollPane6.setViewportView(TextArea1);

        ACEPTAR.setBackground(new java.awt.Color(0, 204, 102));
        ACEPTAR.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ACEPTAR.setText("ACEPTAR");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });

        Text10.setBackground(new java.awt.Color(255, 255, 255));
        Text10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text10.setForeground(new java.awt.Color(255, 255, 255));
        Text10.setText("Text10");

        CheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        CheckBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        CheckBox1.setText("Ver");
        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });

        Text9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text9.setForeground(new java.awt.Color(255, 255, 255));
        Text9.setText("Text9");

        Text7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text7.setForeground(new java.awt.Color(255, 255, 255));
        Text7.setText("Text7");

        Text8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text8.setForeground(new java.awt.Color(255, 255, 255));
        Text8.setText("Text8");

        TextField7.setBackground(new java.awt.Color(102, 102, 102));
        TextField7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField7.setForeground(new java.awt.Color(255, 255, 255));
        TextField7.setText("TextField7");
        TextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField7ActionPerformed(evt);
            }
        });

        Text11.setBackground(new java.awt.Color(255, 255, 255));
        Text11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text11.setForeground(new java.awt.Color(255, 255, 255));
        Text11.setText("Text11");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(null);

        PassField1.setBackground(new java.awt.Color(102, 102, 102));
        PassField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PassField1.setForeground(new java.awt.Color(255, 255, 255));
        PassField1.setText("jPasswordField1");
        PassField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(PassField1);
        PassField1.setBounds(0, 0, 310, 20);

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
        jPanel3.add(TextField5);
        TextField5.setBounds(0, 0, 310, 20);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        PassField2.setBackground(new java.awt.Color(102, 102, 102));
        PassField2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PassField2.setForeground(new java.awt.Color(255, 255, 255));
        PassField2.setText("jPasswordField2");
        PassField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PassField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassField2ActionPerformed(evt);
            }
        });
        jPanel1.add(PassField2);
        PassField2.setBounds(0, 0, 310, 21);

        TextField6.setBackground(new java.awt.Color(102, 102, 102));
        TextField6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextField6.setForeground(new java.awt.Color(255, 255, 255));
        TextField6.setText("TextField6");
        TextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(TextField6);
        TextField6.setBounds(0, 0, 310, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text10)
                    .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text9, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Text8, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Text5)
                            .addGap(6, 6, 6)
                            .addComponent(CheckBox1))
                        .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(449, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Text11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ACEPTAR)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Text1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(Text8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Text9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Text10)
                .addGap(6, 6, 6)
                .addComponent(TextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ACEPTAR)
                    .addComponent(Text11))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1ActionPerformed

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField2ActionPerformed

    private void TextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField3ActionPerformed

    private void TextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField4ActionPerformed

    private void TextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField6ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        String selectedItem = jComboBox4.getSelectedItem().toString();
        
        if(selectedItem.equals("Artista")){
            Text9.setVisible(true);
            TextField7.setVisible(true);
            Text10.setVisible(true);
            TextArea1.setVisible(true);
            jScrollPane6.setVisible(true);
        }else{
            Text9.setVisible(false);
            TextField7.setVisible(false);
            Text10.setVisible(false);
            TextArea1.setVisible(false);
            jScrollPane6.setVisible(false);
            TextField7.setText("");
            TextArea1.setText("");
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        Object selectedItem = jComboBox2.getSelectedItem();
        
        if (selectedItem != null && !selectedItem.toString().isEmpty()) {
            String selectedText = selectedItem.toString();
            System.out.println("ComboBox2: " + selectedText);
        } else {
            System.out.println("");
        }
        
        List<Integer> dias = new ArrayList<>();
        if(selectedItem.toString().equals("Febrero")){
            for (int i = 1; i <= 29; i++) {
                dias.add(i);
            }
        }else if(selectedItem.toString().equals("Abril") || selectedItem.toString().equals("Junio") || selectedItem.toString().equals("Septiembre") || selectedItem.equals("Noviembre")){
            for (int i = 1; i <= 30; i++) {
                dias.add(i);
            }
        }else{
            for (int i = 1; i <= 31; i++) {
                dias.add(i);
            }
        }
        for(int dia : dias){
            jComboBox1.addItem(String.valueOf(dia)); // Convertir el int a String

        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACEPTARActionPerformed
        // TODO add your handling code here:
        if(CheckBox1.isSelected()){
            PassField1.setText(TextField5.getText());
            PassField2.setText(TextField6.getText());
        }else{
            TextField5.setText(PassField1.getText());
            TextField6.setText(PassField2.getText());
        }
        if(PassField2.getText().equals(PassField1.getText())){
        if(TextField1.getText().equals("")){
            Text11.setText("Ingrese un nickname");
            Text11.setVisible(true);
        }else if(TextField2.getText().equals("")){
            Text11.setText("Ingrese un nombre");
            Text11.setVisible(true);
        }else if(TextField3.getText().equals("")){
            Text11.setText("Ingrese un apellido");
            Text11.setVisible(true);
        }else if(TextField4.getText().equals("")){
            Text11.setText("Ingrese un correo");
            Text11.setVisible(true);
        }else if(PassField1.getText().equals("") && TextField5.getText().equals("")){
            Text11.setText("Ingrese una contraseña");
            Text11.setVisible(true);
        }else if(PassField2.getText().equals("") && TextField6.getText().equals("")){
            Text11.setText("Confirme la contraseña ingresada");
            Text11.setVisible(true);
        }else if(jComboBox4.getSelectedItem().toString().equals("Artista")){
            if(TextArea1.getText().equals("")){
                Text11.setText("Ingrese una Biografia");
                Text11.setVisible(true);
            }else if(TextField7.getText().equals("")){
                Text11.setText("Ingrese una pagina web");
                Text11.setVisible(true);
            }else{
                Text11.setText("Se creo al Artista "+TextField1.getText()+" con exito");
                Text11.setVisible(true);
            }
        }else{
            //crearCliente
            Text11.setText("Se creo al Cliente "+TextField1.getText()+" con exito");
            Text11.setVisible(true);
        }
        }else{
            Text11.setText("Las contraseñas no concuerdan");
            Text11.setVisible(true);
        }
    }//GEN-LAST:event_ACEPTARActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        Object selectedItem = jComboBox1.getSelectedItem();
        
        if (selectedItem != null && !selectedItem.toString().isEmpty()) {
            String selectedText = selectedItem.toString();
            System.out.println("ComboBox1: " + selectedText);
        } else {
            System.out.println("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        Object selectedItem = jComboBox3.getSelectedItem();
        
        if (selectedItem != null && !selectedItem.toString().isEmpty()) {
            String selectedText = selectedItem.toString();
            System.out.println("ComboBox3: " + selectedText);
        } else {
            System.out.println("");
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void TextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField5ActionPerformed

    private void PassField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassField2ActionPerformed

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
        // TODO add your handling code here:
        if (CheckBox1.isSelected()) {
            String contra1 = PassField1.getText();
            String contra2 = PassField2.getText();
            TextField5.setText(contra1);
            TextField6.setText(contra2);
            TextField5.setVisible(true);
            TextField6.setVisible(true);
            PassField1.setVisible(false);
            PassField2.setVisible(false);
        } else {
            String contra1 = TextField5.getText();
            String contra2 = TextField6.getText();
            PassField1.setText(contra1);
            PassField2.setText(contra2);
            TextField5.setVisible(false);
            TextField6.setVisible(false);
            PassField1.setVisible(true);
            PassField2.setVisible(true);
        }
    }//GEN-LAST:event_CheckBox1ActionPerformed

    private void TextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JPasswordField PassField1;
    private javax.swing.JPasswordField PassField2;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text10;
    private javax.swing.JLabel Text11;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Text6;
    private javax.swing.JLabel Text7;
    private javax.swing.JLabel Text8;
    private javax.swing.JLabel Text9;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.JTextField TextField5;
    private javax.swing.JTextField TextField6;
    private javax.swing.JTextField TextField7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
