
package datosJugador;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Player {
 protected String nombre;
 protected String nickName;
   Scanner dato = new Scanner(System.in);
   //Contrusctor Datos Jugador
   
   public Player(String nombre, String nickName){
      this.nombre=nombre;
      this.nickName=nickName;
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

  
//metodo para presentar solo nombre y nickName
 public void presentar(){
     JOptionPane.showMessageDialog(null, "Nombre: " + this.getNombre() + 
             "            " + "Nick Name: " + this.getNickName());
     
 }
 
    
}
