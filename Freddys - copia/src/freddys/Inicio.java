package freddys;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author srg12
 */
public class Inicio extends JFrame implements ActionListener {
    JButton btn3,btn4,btn5,btn6,btn7;
    JPanel BaG2,bag4,bag5;
    JLabel Immage2;
    JTextField txt2;
    JTextArea Menu;
    JLabel txt1;
    public static String prueba;
  
   
  
 
          
     public Inicio(){
    Immage2 = new JLabel();
    ImageIcon icon = new ImageIcon("C:\\Users\\srg12\\Documents\\NetBeansProjects\\Freddys\\src\\Imagenes\\Logo.png");
    Immage2.setIcon(icon);
    Immage2.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        setTitle("Inicio"); //Establece el título de la ventana
        setSize(600, 400); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.FALSE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
        
     }
     
    public final void cuerpo(){
        //Texto
     txt1= new JLabel("<html>Holaa¡ y bienvenido a Freedy Fazbear Pizza, para comenzar con tu pedidio ingresa tu nombre  (Esto para tener una mejor experiencia en tu pedido)");//+nombre+ "estas son las opciones que te podemos ofrecer");
     txt1.setForeground(Color.white);
     txt1.setBounds(170,90,300,50);
     txt2 = new JTextField();
     txt2.setBounds(250,150,100,20);
     txt2.getText();
     
     
     
     
     //Fondos
    bag4 = new JPanel();
    bag4.setBackground(new Color (0,255,255));//Borde azul
    bag4.setBounds(15,15,550, 325);
    bag5 = new JPanel();
    bag5.setBackground(Color.black);
    bag5.setBounds(21,21,538, 310);
    BaG2 = new JPanel();
    BaG2.setBackground(Color.black);
    BaG2.setSize(600, 600);    
    //Botones
     btn3 = new JButton();
     btn3= new JButton("Siguiente");
     btn3.setBounds(350,250,100,25);
 
     add(btn3);
     btn3.addActionListener(this);
     add(txt1);
     add(txt2);
    add(Immage2);
    add(bag5);
    add(bag4);
    add(BaG2);
    
  }
    @Override
         public void actionPerformed(ActionEvent e){
             
     if(e.getSource()==btn3);
     prueba=txt2.getText();
     {
         
   int seleccion = JOptionPane.showOptionDialog(
   null,
   "¿Estas seguro que tu nombre esta escrito correctamente "+ prueba+"?\n(Si es asi da en el boton continuar, en caso contrario da en cancelar)  ",
   "Selector de opciones",
   JOptionPane.YES_NO_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    // null para icono por defecto.
   new Object[] { "Cambiar", "Continuar"},null);
if (seleccion != 1){
 

}
         else  {
        Menu men=new Menu();
         men.setVisible(true);
        setVisible(false); 


     }
     }
 }
public static void main(String[] args) {

       Inicio ini=new Inicio();
       
       

    }
    
}
