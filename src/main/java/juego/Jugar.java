
package juego;

import datosJugador.Oro;
import javax.swing.JOptionPane;
import Granja.Vista;

public class Jugar {
    String  nombre1;
    String nickName1;
    Oro pu1;
    Vista Vp;
    
//metodo para preguntar e imprimir los datos iniciales
public void datoIns(){

nombre1 = JOptionPane.showInputDialog("ingrese su nombre: ");
nickName1 = JOptionPane.showInputDialog("ingrese su nickName: ");
pu1 = new Oro(nombre1, nickName1, 100, 10);
pu1.toString();


}

//meotodo para presentar la ventana
public void VentanaI(){
Vp = new Vista();
Vp.setVisible(true);

}


    
}
