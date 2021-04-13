
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
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.terreno.setLayout(new GridLayout(nCantidadCeldasX, nCantidadCeldasY));
        enviarDatos(nCantidadCeldasX, nCantidadCeldasY);
        pasto(nCantidadCeldasX, nCantidadCeldasY);
        
    }
    
    
    
    public void enviarDatos(int CantidadX, int CantidadY){
    this.AdminSuelos = new AdminSuelos(CantidadX, CantidadY);
    manejadorSuelo = new ManejadorVisualSuelo(terreno, AdminSuelos.getSuelo(), CantidadX, CantidadY);
    
    }
    
    public void pasto(int CeldasX, int CeldasY){
    this.AdminSuelos = new AdminSuelos(CeldasX, CeldasY);
    manejadorSuelo = new ManejadorVisualSuelo(terreno, AdminSuelos.getSuelo(), CeldasX, CeldasY);
    }
      
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        terreno = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

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
            .addGap(0, 920, Short.MAX_VALUE)
        );
        terrenoLayout.setVerticalGroup(
            terrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(terreno);
        terreno.setBounds(23, 86, 920, 480);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jButton1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton1.setText("Plantas");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        jButton2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton2.setText("Animales");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        jButton3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton3.setText("Productos");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        jButton4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton4.setText("Bodega");
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        jButton5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton5.setText("Mercado");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        jButton6.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 11)); // NOI18N
        jButton6.setText("Reportes");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(512, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -6, 960, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel terreno;
    // End of variables declaration//GEN-END:variables
}
