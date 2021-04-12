
package Granja;

import GeneradorSuelos.AdminSuelos;
import Manejadores.ManejadorVisualSuelo;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class PantallaPrincipal extends javax.swing.JFrame {
 protected ManejadorVisualSuelo manejadorSuelo;
 protected AdminSuelos AdminSuelos;
 Login mostrar;
 
    public PantallaPrincipal(int nCantidadCeldasX, int nCantidadCeldasY) {
        initComponents();
        this.NombrePlayer.setText(mostrar.person.getNombre());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.terreno.setLayout(new GridLayout(nCantidadCeldasX, nCantidadCeldasY));
        enviarDatos(nCantidadCeldasX, nCantidadCeldasY);
        
    }
    
    public void enviarDatos(int CantidadX, int CantidadY){
    this.AdminSuelos = new AdminSuelos(CantidadX, CantidadY);
    manejadorSuelo = new ManejadorVisualSuelo(terreno, AdminSuelos.getSuelo(), CantidadX, CantidadY);
    
    }
      
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        terreno = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NombrePlayer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Farm IPC");
        setBackground(new java.awt.Color(255, 153, 0));
        setForeground(new java.awt.Color(255, 153, 0));
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(null);

        terreno.setBackground(new java.awt.Color(51, 204, 0));
        terreno.setForeground(new java.awt.Color(51, 255, 0));

        javax.swing.GroupLayout terrenoLayout = new javax.swing.GroupLayout(terreno);
        terreno.setLayout(terrenoLayout);
        terrenoLayout.setHorizontalGroup(
            terrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        terrenoLayout.setVerticalGroup(
            terrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        getContentPane().add(terreno);
        terreno.setBounds(263, 86, 640, 483);

        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton1.setText("Plantas");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 11, 135, 57);

        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton2.setText("Animales");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        getContentPane().add(jButton2);
        jButton2.setBounds(290, 11, 135, 57);

        jButton3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton3.setText("Productos");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        getContentPane().add(jButton3);
        jButton3.setBounds(443, 11, 131, 57);

        jButton4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton4.setText("Bodega");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        getContentPane().add(jButton4);
        jButton4.setBounds(608, 11, 125, 57);

        jButton5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton5.setText("Mercado");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));
        getContentPane().add(jButton5);
        jButton5.setBounds(767, 11, 127, 57);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        NombrePlayer.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(NombrePlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(712, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombrePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -6, 910, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombrePlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel terreno;
    // End of variables declaration//GEN-END:variables
}
