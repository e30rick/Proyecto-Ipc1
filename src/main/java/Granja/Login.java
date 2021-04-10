
package Granja;


import Manejadores.ManejadorPlayer;
import datosJugador.Player;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class Login extends javax.swing.JFrame {
  
      protected Player person;
      private Pantalla1 segunda;
    
      
   public Login(){
       initComponents();
       person = new Player("", "");
       nombreField.setText(person.getNombre());
       nickField.setText(person.getNickName());
       this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

       }

    public Login(JTextField nickField, JTextField nombreField) {
        this.nickField = nickField;
        this.nombreField = nombreField;
    }

    public JTextField getNickField() {
        return nickField;
    }

    public void setNickField(JTextField nickField) {
        this.nickField = nickField;
    }

    public JTextField getNombreField() {
        return nombreField;
    }

    public void setNombreField(JTextField nombreField) {
        this.nombreField = nombreField;
    }
  
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        nickField = new javax.swing.JTextField();
        Jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Farm IPC");
        setBackground(new java.awt.Color(102, 51, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 153));
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(341, 244));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 255, 51));
        jLabel1.setFont(new java.awt.Font("Goudy Stout", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("¡Bienvenido a My Farm IPC!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 440, 47);

        jLabel2.setFont(new java.awt.Font("Goudy Stout", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Ingrese su Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 100, 250, 24);

        jLabel3.setFont(new java.awt.Font("Goudy Stout", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setText("Ingrese su Nick Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 150, 320, 28);

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nombreField);
        nombreField.setBounds(320, 100, 180, 20);

        nickField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nickField);
        nickField.setBounds(320, 150, 180, 20);

        Jugar.setFont(new java.awt.Font("Goudy Stout", 3, 24)); // NOI18N
        Jugar.setForeground(new java.awt.Color(102, 102, 255));
        Jugar.setText("JUGAR");
        Jugar.setContentAreaFilled(false);
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Jugar);
        Jugar.setBounds(140, 240, 280, 90);

        setSize(new java.awt.Dimension(646, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void nickFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nickFieldActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        // TODO add your handling code here:
        String nombre = nombreField.getText();
        String nickName1 = nickField.getText();
        person = new Player(nombre, nickName1);
        this.setVisible(false);
        this.dispose(); //cerrar esta ventana
        //invocanco a la otra ventana
        ManejadorPlayer v2 = new ManejadorPlayer();
        v2.mostrarPantalla();
        
      
    }//GEN-LAST:event_JugarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nickField;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables

   
    
    
}
