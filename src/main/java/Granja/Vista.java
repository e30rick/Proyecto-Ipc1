
package Granja;
import datosJugador.Player;

import java.awt.Color;

import static java.awt.PageAttributes.ColorType.COLOR;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Vista extends JFrame{
    
    
    //Ventana Principal 
    public Vista(){
    //Tamaño de ventana
    this.setSize(600, 600);
    this.setLocationRelativeTo(null); //centrar ventana
    this.setTitle("My Farm IPC");
    PanelPrincipal();
      
    //cerrar ventana
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
      
    }
    
    private void PanelPrincipal(){
        JPanel pan1 = new JPanel(); //Creación de Panel principal
        pan1.setLayout(null); // diseño por defecto apahgado
        // agregar color al panel pan1.setBackground(Color.BLUE);
        this.getContentPane().add(pan1); //panel principal en la ventana
        
        JLabel et1 = new JLabel(); // primera etiqueta
        et1.setOpaque(true); //activar fondo
        et1.setText("Hola Mundo xd");
        et1.setHorizontalAlignment(SwingConstants.CENTER); //centrar texto
        // et1.setForeground(Color.PINK); color de letra
        et1.setBackground(Color.BLUE); //color fondo
        et1.setBounds(5, 5, 100, 100);
        pan1.add(et1); //agregar la etiqueta
              
    }
}
