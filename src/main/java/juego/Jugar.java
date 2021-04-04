
package juego;

import datosJugador.Oro;
import javax.swing.JOptionPane;


public class Jugar {
    String  nombre1;
    String nickName1;
    Oro pu1;
    
//metodo para preguntar e imprimir los datos iniciales
public void datoIns(){

nombre1 = JOptionPane.showInputDialog("ingrese su nombre: ");
nickName1 = JOptionPane.showInputDialog("ingrese su nickName: ");
pu1 = new Oro(nombre1, nickName1, 100, 10);
pu1.toString();


}

    
}
