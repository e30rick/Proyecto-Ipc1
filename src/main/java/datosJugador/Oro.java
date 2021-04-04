
package datosJugador;
import javax.swing.JOptionPane;


public class Oro extends Player{

protected int monedas;
protected int puntosVida;

 //Constructor heredado de player nombre y apodo   
    public Oro(String nombre, String nickName, int monedas, int puntosVida){
   super(nombre, nickName);
   this.monedas = monedas;
   this.puntosVida = puntosVida;

}
    // metodo para sumar dinero
   public void Ganancias(int monedas){
      if (monedas>0){
    this.monedas += monedas;
    }
}
   //metodo para restar el dinero
   public void Gastos(int monedas){
     if (this.monedas - monedas < 0){
    this.monedas = 0;
    } else {
    this.monedas -= monedas;
    }    
   } 
   
   
//retorno y mostrar los datos     
@Override
   public String toString(){
     JOptionPane.showMessageDialog(null, "Nombre: " + this.getNombre() + "\nNick Name: "+ this.getNickName() + 
             "\nMonedas Iniciales = " + this.monedas);
    return null;
   }
}
