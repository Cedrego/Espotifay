/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Capa_Presentacion;

import Logica.Factory;
import Logica.ICtrl;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author franb
 */
public class IArtistasEliminados extends javax.swing.JPanel {

    /**
     * Creates new form IArtistasEliminados
     */
    Factory fabric =Factory.getInstance();
    ICtrl ctrl = fabric.getICtrl();
    public IArtistasEliminados() {
        initComponents();
        //Cargar los leables
        jLabel1.setText("Artistas eliminados");
        // Obtener la lista de DataArtistaEliminado
        List<DataArtistaEliminado> listaArtistas = ctrl.ListaDataArtistaEliminado();

        // Limpiar el JPanel y preparar para mostrar la información
        jPanel1.removeAll();
        jPanel1.setLayout(new BorderLayout());

        // Crear un JScrollPane para manejar el desplazamiento si hay muchos artistas
        JPanel contenidoPanel = new JPanel();
        contenidoPanel.setLayout(new BoxLayout(contenidoPanel, BoxLayout.Y_AXIS));

        // Agregar la información de cada artista al contenidoPanel
        for (DataArtistaEliminado artista : listaArtistas) {
            String info = "<html>Nickname: " + artista.getNickname() +
                          "<br>Nombre: " + artista.getNombre() +
                          "<br>Apellido: " + artista.getApellido() +
                          "<br>Correo: " + artista.getCorreo() +
                          "<br>Fecha Nac.: " + (artista.getFecha() != null ? artista.getFecha().toString() : "N/A") +
                          "<br>Álbumes: " + artista.getAlbumes() +
                          "<br>Temas: " + artista.getTemas() +
                          "<br>Fecha Elim.: " + artista.getEliminado() +
                          "</html>";
                JLabel label = new JLabel(info);
                label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Margen alrededor del texto
                contenidoPanel.add(label);
            }

            // Asegurar que el contenidoPanel tenga un tamaño preferido adecuado
            contenidoPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, contenidoPanel.getPreferredSize().height));

            // Envolver el contenidoPanel en un JScrollPane
            JScrollPane scrollPane = new JScrollPane(contenidoPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // Barra vertical cuando sea necesario
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); // Barra horizontal cuando sea necesario

            // Agregar el JScrollPane al jPanel1
            jPanel1.setLayout(new BorderLayout());
            jPanel1.add(scrollPane, BorderLayout.CENTER);

            // Refrescar el jPanel1 para mostrar el nuevo contenido
            jPanel1.revalidate();
            jPanel1.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Text1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}