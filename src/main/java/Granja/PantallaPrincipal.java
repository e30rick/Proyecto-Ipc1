
package Granja;

import GeneradorSuelos.AdminSuelos;
import Manejadores.ManejadorVisualSuelo;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.WindowConstants;

public class PantallaPrincipal extends javax.swing.JFrame {
 protected ManejadorVisualSuelo manejadorSuelo;
 protected AdminSuelos AdminSuelos;
 
 
 
    public PantallaPrincipal(int nCantidadCeldasX, int nCantidadCeldasY) {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        terreno.setBackground(new java.awt.Color(255, 204, 153));
        terreno.setForeground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout terrenoLayout = new javax.swing.GroupLayout(terreno);
        terreno.setLayout(terrenoLayout);
        terrenoLayout.setHorizontalGroup(
            terrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        terrenoLayout.setVerticalGroup(
            terrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(terreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addComponent(terreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel terreno;
    // End of variables declaration//GEN-END:variables
}
