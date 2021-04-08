
package Animales;


public class Omnivoro extends Animal{
    protected String comerCarne;
    
    public Omnivoro(String comida, String nombre, Integer edad) {
        super(comida, nombre, edad);
    }

    public String getComerCarne() {
        return comerCarne;
    }

    public void setComerCarne(String comerCarne) {
        this.comerCarne = comerCarne;
    }

    
    public String toString(){
    return "Carne" + comerCarne;
    }
    
    @Override
    public void Especie() {
    
    }


    
}
