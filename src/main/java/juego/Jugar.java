
package juego;

import javax.swing.JOptionPane;
import Granja.Vista;
import datosJugador.Player;


public class Jugar {
    static String  nombre1;
    static String nickName1;
    Player pu1;
    Vista Vp;
   
//metodo para preguntar e imprimir los datos iniciales
public void datoIns(){

nombre1 = JOptionPane.showInputDialog("ingrese su nombre: ");
nickName1 = JOptionPane.showInputDialog("ingrese su nickName: ");
pu1 = new Player(nombre1, nickName1);
pu1.presentar();

}

//meotodo para presentar la ventana
public void VentanaI(){
Vp = new Vista();
Vp.setVisible(true);

}

public void Contro(){

    System.out.println("nombre: " + this.pu1.getNombre());
}




}
