/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;

import GeneradorSuelos.SueloIndicador;
import javax.swing.JPanel;

/**
 *
 * @author e30ri
 */
public class ManejadorVisualSuelo {
    protected JPanel sueloPanel;
    protected SueloIndicador[][] distribucionSuelo;
    protected int nSueloX;
    protected int nSueloY;
    
    public ManejadorVisualSuelo(JPanel SueloPanel, SueloIndicador[][] distribucionSuelo,int nSueloX, int nSueloY ){
    this.sueloPanel = SueloPanel;
    this.distribucionSuelo = distribucionSuelo;
    this.nSueloX = nSueloX;
    this.nSueloY = nSueloY;
    }
    
    public void dibujarSuelo(){
       for(int i = 0; i < nSueloX; i++){
       for(int j = 0; j < nSueloY; j++){
       SueloIndicador sueloI = this.distribucionSuelo[i][j];
       this.sueloPanel.add(sueloI.getSueloCreado());
        }
    
      }
    }
    
}
