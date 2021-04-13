/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneradorSuelos;

/**
 *
 * @author e30ri
 */
public class AdminSuelos {
    
    protected SueloIndicador[][] Suelo;
   
    
    public AdminSuelos(int celdasX, int celdasY){
    
    this.Suelo = TrazadorSuelo.creadorSueloIncial(celdasX, celdasY);
    
    
    }
   

    public SueloIndicador[][] getSuelo() {
        return Suelo;
    }

    public void setSuelo(SueloIndicador[][] Suelo) {
        this.Suelo = Suelo;
    }
    
    
    
}
