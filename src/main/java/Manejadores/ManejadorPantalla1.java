/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;
import Granja.Pantalla1; 
import Granja.PantallaPrincipal;
import Granja.VisualAnimal;

/**
 *
 * @author e30ri
 */
public class ManejadorPantalla1 {
   
    
    public void nextWIndow(){
    
    PantallaPrincipal vP = new PantallaPrincipal();
    vP.setVisible(true);
    }
    
    
    public void windowCAnimal(){
    VisualAnimal crA =  new VisualAnimal();
    crA.setVisible(true);
    
    }
    
    public void windowCPlanta(){
    
    }
    
}
