/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Granja;
import Manejadores.ManejadorVisualPlan;
import Manejadores.ManejadorVisualAn;
import Manejadores.ManejadorPantalla1;
import datosJugador.Player;
import javax.swing.WindowConstants;


public class Pantalla1 extends javax.swing.JFrame {
Player presente;
   
    public Pantalla1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InitFarm = new javax.swing.JButton();
        NuevoAnim = new javax.swing.JButton();
        NuevaPlant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Farm IPC");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        InitFarm.setBackground(new java.awt.Color(255, 0, 0));
        InitFarm.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        InitFarm.setForeground(new java.awt.Color(255, 102, 102));
        InitFarm.setText("¡GENERAR GRANJA!");
        InitFarm.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        InitFarm.setContentAreaFilled(false);
        InitFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitFarmActionPerformed(evt);
            }
        });

        NuevoAnim.setBackground(new java.awt.Color(51, 0, 255));
        NuevoAnim.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 24)); // NOI18N
        NuevoAnim.setForeground(new java.awt.Color(51, 0, 255));
        NuevoAnim.setText("Crear Nuevo Animal");
        NuevoAnim.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        NuevoAnim.setContentAreaFilled(false);
        NuevoAnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoAnimActionPerformed(evt);
            }
        });

        NuevaPlant.setBackground(new java.awt.Color(0, 0, 204));
        NuevaPlant.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 24)); // NOI18N
        NuevaPlant.setForeground(new java.awt.Color(0, 0, 204));
        NuevaPlant.setText("Crear Nueva Planta");
        NuevaPlant.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        NuevaPlant.setContentAreaFilled(false);
        NuevaPlant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPlantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NuevaPlant, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(NuevoAnim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(InitFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(InitFarm, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(NuevoAnim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NuevaPlant, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevaPlantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPlantActionPerformed
        // TODO add your handling code here:
        ManejadorVisualPlan cnp = new ManejadorVisualPlan();
        cnp.windowOnP();
    }//GEN-LAST:event_NuevaPlantActionPerformed

    private void NuevoAnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoAnimActionPerformed
        // TODO add your handling code here:
        ManejadorVisualAn cna = new ManejadorVisualAn();
        cna.windowOnA();
    }//GEN-LAST:event_NuevoAnimActionPerformed

    private void InitFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitFarmActionPerformed
        // TODO add your handling code here:
       ManejadorPantalla1 miGranja = new ManejadorPantalla1();
       miGranja.granja();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_InitFarmActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InitFarm;
    private javax.swing.JButton NuevaPlant;
    private javax.swing.JButton NuevoAnim;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
