package formulario;
import javax.swing.*;
public class FORMULARIO extends JFrame {
   public FORMULARIO (){ 
    setLayout(null);
   }
    public static void main(String[] args) {
     FORMULARIO formulario1=new FORMULARIO();
     formulario1.setBounds( 10,20,400,300);
     formulario1.setVisible( true);
     formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    
    
}
