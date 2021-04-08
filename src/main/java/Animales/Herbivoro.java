

package Animales;

public class Herbivoro extends Animal{
    protected String comerHiervas;

    public Herbivoro(String comida, String nombre, Integer edad) {
        super(comida, nombre, edad);
    }

    public String getComerHiervas() {
        return comerHiervas;
    }

    public void setComerHiervas(String comerHiervas) {
        this.comerHiervas = comerHiervas;
    }

    @Override
    public String toString(){
    
    return "Hiervas" + comerHiervas;
    }

    @Override
    public void Especie() {
      
    }
}