
package datosJugador;

public class Player {
 protected static String nombre;
 protected static String nickName;
 protected static Integer puntosVida = 100;
 protected static Integer  monedas = 200;

   
   public Player(String nombre, String nickName){
      this.nombre = nombre;
      this.nickName = nickName;
     
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
    //Vida
    public Integer getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(Integer puntosVida) {
        this.puntosVida = puntosVida;
    }
    
    //monedas
    public Integer getMonedas() {
        return monedas;
    }

    public void setMonedas(Integer monedas) {
        this.monedas = monedas;
    }
   
    //metodo para sumar dinero
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
  
//metodo para presentar solo nombre y nickName por option pane
 //*public void presentar(){
// JOptionPane.showMessageDialog(null, "Nombre: " + this.getNombre()+ "\nNickNsme: " + this.getNickName()
//+ "\nMonedas Inciales: " + this.getMonedas() + " chelines" + "\nVida: " + this.getPuntosVida());
    

}