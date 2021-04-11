
package GeneradorSuelos;


public class SueloIndicador {
    protected EnumSuelos tipoDeSuelo; //tipo de suelo creado enum
    protected CreadorSuelos sueloCreado;   //tipoJLabel
    protected boolean Comprado;
    
    //getters&Setters de las variables

    public EnumSuelos getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(EnumSuelos tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }

    public CreadorSuelos getSueloCreado() {
        return sueloCreado;
    }

    public void setSueloCreado(CreadorSuelos sueloCreado) {
        this.sueloCreado = sueloCreado;
    }

    public boolean isComprado() {
        return Comprado;
    }

    public void setComprado(boolean Comprado) {
        this.Comprado = Comprado;
    }
    
    
    //Constructo de las variables

    public SueloIndicador(EnumSuelos tipoDeSuelo, CreadorSuelos sueloCreado, boolean Comprado) {
        this.tipoDeSuelo = tipoDeSuelo;
        this.sueloCreado = sueloCreado;
        this.Comprado = Comprado;
    }
    
    
    
    
    
}
