
package Animales;

 
public abstract class Animal {
   protected String comida;
   protected String nombre; 
   protected Integer edad = 1;
   
    public abstract void Especie();

    public Animal(String comida, String nombre, Integer edad) {
        this.comida = comida;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public void crecer(Integer edad){
       
     }
    

    
   @Override
    public String toString(){
    return "Animal" + "nombre" + nombre + "Comida" + comida;
    
    }
    
    
}
