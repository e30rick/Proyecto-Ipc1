/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejadores;
import Granja.Pantalla1; 
import Granja.PantallaPrincipal;
import Granja.VisualAnimal;
import GeneradorSuelos.AdminSuelos;
import java.awt.Color;

/**
 *
 * @author e30ri
 */
public class ManejadorPantalla1 {
   
     
    public void windowCAnimal(){
    VisualAnimal crA =  new VisualAnimal();
    crA.setVisible(true);
    
    }
    
    
    public void granja(){
        int  filas = 5;
        int columnas = 5;
    PantallaPrincipal granjaFarm = new PantallaPrincipal(filas, columnas);
    granjaFarm.setVisible(true);
    granjaFarm.setBackground(Color.yellow);
    }
    
}