package Capa_Presentacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author cedre
 */
public class IDejarDeSeguirUsuario extends javax.swing.JPanel {

    /**
     * Creates new form IAltaPerfil
     */
    public IDejarDeSeguirUsuario() {
        initComponents();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        Text2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ACEPTAR.setBackground(new java.awt.Color(0, 204, 102));
        ACEPTAR.setForeground(new java.awt.Color(0, 0, 0));
        ACEPTAR.setText("ACEPTAR");
        add(ACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, -1, -1));

        Text1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text1.setForeground(new java.awt.Color(255, 255, 255));
        Text1.setText("Text1");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, -1));

        Text2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Text2.setForeground(new java.awt.Color(255, 255, 255));
        Text2.setText("Text2");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 160, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    // End of variables declaration//GEN-END:variables
}
