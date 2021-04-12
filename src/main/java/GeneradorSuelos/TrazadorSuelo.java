
package GeneradorSuelos;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author e30ri
 */
public class TrazadorSuelo {
    
       //El arreglo debe estar ligado a la clase que contiene las caracteristicas del objeto
    public static SueloIndicador[][] creadorSueloIncial(int CasillasX , int CasillasY){
    
        SueloIndicador celdaSuelo; //variable que se llamara continuamente
        
        SueloIndicador[][] suelo1 = new SueloIndicador[CasillasX][CasillasY];
        for(int i = 0; i < CasillasX; i++){
        for(int j = 0; j < CasillasY; j++){
        
           CreadorSuelos jLabel1 = new CreadorSuelos(i+1, j+1,"Fila:" + (i + 1) + " Columna:" + (j + 1) );
           jLabel1.setOpaque(true);
           jLabel1.setBackground(Color.BLUE);
           jLabel1.addMouseListener(new java.awt.event.MouseAdapter(){
           @Override
           public void mouseClicked(java.awt.event.MouseEvent evt){
           CreadorSuelos label=(CreadorSuelos)evt.getComponent();
                        JOptionPane.showMessageDialog(null,"Fila:"+(label.nFilas) +" Columna:"+(label.nColumnas));
           }
           });
         celdaSuelo = new SueloIndicador(EnumSuelos.AGUA, jLabel1,false);
                 suelo1[i][j] = celdaSuelo;

        }
    }
       return suelo1;
  }
      
    
}
