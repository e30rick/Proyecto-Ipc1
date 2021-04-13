package GeneradorSuelos;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author e30ri
 */
public class TrazadorSuelo {

    //El arreglo debe estar ligado a la clase que contiene las caracteristicas del objeto
    public static SueloIndicador[][] creadorSueloIncial(int CasillasX, int CasillasY) {

        SueloIndicador celdaSueloAgua; //variable que se llamara continuamente

        SueloIndicador[][] suelo1 = new SueloIndicador[CasillasX][CasillasY];
        for (int i = 0; i < CasillasX; i++) {
            for (int j = 0; j < CasillasY; j++) {

                CreadorSuelos jLabel1 = new CreadorSuelos(i + 1, j + 1, "Esto es agua");
                jLabel1.setOpaque(true);
                jLabel1.setBackground(Color.BLUE);
                jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        CreadorSuelos label = (CreadorSuelos) evt.getComponent();
                        JOptionPane.showMessageDialog(null, "Esto es parte de la granja :c");
                    }
                });
                celdaSueloAgua = new SueloIndicador(EnumSuelos.AGUA, jLabel1, false);
                suelo1[i][j] = celdaSueloAgua;

            }
        }
        return (suelo1);

    }

    public static SueloIndicador[][] creadorSacate(int CasillaX, int CasillaY) {
        SueloIndicador celdasSueloGrama;// varibale que llame a tierra 

        SueloIndicador[][] suelo12 = new SueloIndicador[CasillaX][CasillaY];

        for (int i = 0; i < CasillaX; i++) {
            for (int j = 0; j < CasillaY; j++) {

                CreadorSuelos jLabel2 = new CreadorSuelos(i + 1, j + 1, "Esto es grama");
                jLabel2.setOpaque(true);
                jLabel2.setBackground(Color.GREEN);

                celdasSueloGrama = new SueloIndicador(EnumSuelos.GRAMA, jLabel2, false);
                suelo12[i][j] = celdasSueloGrama;

            }

        }

        return suelo12;
    }

    public static SueloIndicador[][] creadorDesierto(int CasillasXl, int CasillasYl) {
        SueloIndicador celdasSueloDesierto; // variable para crear desierto

        SueloIndicador[][] suelo13 = new SueloIndicador[CasillasXl][CasillasYl];
        for (int i = 0; i < CasillasXl; i++) {
            for (int j = 0; j < CasillasYl; i++) {

                CreadorSuelos jLabel3 = new CreadorSuelos(i + 1, j + 1, "Esto es Desierto");
                jLabel3.setOpaque(true);
                jLabel3.setBackground(Color.orange);

                celdasSueloDesierto = new SueloIndicador(EnumSuelos.DESIERTO, jLabel3, false);
                suelo13[i][j] = celdasSueloDesierto;

            }

        }
        return suelo13;
    }

}
