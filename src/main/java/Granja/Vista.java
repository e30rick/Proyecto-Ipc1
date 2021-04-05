
package Granja;

import javax.swing.JFrame;

public class Vista extends JFrame{
    
    //Ventana Principal 
    public Vista(){
    //Tamaño de ventana
    this.setSize(600, 600);
    this.setLocationRelativeTo(null); //centrar ventana
    //cerrar ventana
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("My Farm IPC");
    }
}
