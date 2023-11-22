/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package freddys;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author srg12
 */
public class Menu extends JFrame implements ActionListener{
    JButton btn4,btn5;
    JPanel BaG2,bag4,bag5;
    JLabel Immage2;
    JTextArea Menu;
    JLabel txt1;
    Inicio ini = new Inicio();
        
            public Menu(){
     Immage2 = new JLabel();
   ImageIcon icon = new ImageIcon("C:\\Users\\srg12\\Documents\\NetBeansProjects\\Freddys - copia\\src\\Imagenes\\Fondo2.png");
    Immage2.setIcon(icon);
    Immage2.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        setTitle("Menu"); //Establece el título de la ventana
        setSize(600, 400); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo2(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.FALSE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
                    JMenu menuArchivo = new JMenu("Informacion"); // crea el menú archivo
        menuArchivo.setMnemonic('A'); // establece el nemónico a A

        // crea el elemento de menú Acerca de...
        JMenuItem elementoAcercaDe = new JMenuItem("Acerca de...");
        elementoAcercaDe.setMnemonic('c'); // establece el nemónico a c
        menuArchivo.add(elementoAcercaDe); // agrega el elemento elementoAcercaDe al menú archivo
        elementoAcercaDe.addActionListener(
                new ActionListener() // clase interna anónima
        {

            // muestra cuadro de diálogo de mensaje cuando el usuario selecciona Acerca de...
           public void actionPerformed(ActionEvent evento) {
                 JOptionPane.showMessageDialog(Menu.this,
                      "Bienvenido "+ini.prueba +", esta es la pantalla principal de todo el programa,\ncon los siguientes botones podras realizar diversas acciones por\nlo que este apartado te ayudara con tu pedido\n"+
                         "1. Ordenar: Con este boton podras pedir los\nproductos o alimentos que quieras, solamente\npresiona el boton '+' si quieres agregar algo\no ´-´ si es quieres quitar algun alimento.\n"+
                         "2. Crea tu pizza: Presionando este boton podras\npersonalizar tu pizza de la manera que mas te\nguste con diferentes ingredientes, diferentes\ntipos de masa etc. La seleccion de estos es de\n igual forma que la pestaña ´ordenar´",
                        "Acerca de", JOptionPane.PLAIN_MESSAGE);
            } // ﬁn del método actionPerformed
        } // ﬁn de la clase interna anónima
        ); // ﬁn de la llamada a addActionListener
        
        JMenuBar barra = new JMenuBar(); // crea la barra de menús
        setJMenuBar(barra); // agrega la barra de menús a la aplicación
        barra.add(menuArchivo); // agrega el menú archivo a la barra de menús
        
    
         
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        // Acciones específicas para cada botón
  if (e.getSource() == btn4) {
               int seleccion = JOptionPane.showOptionDialog(   null, "¿Estas seguro de que quieres ya quieres ordenar "+ini.prueba+"?",
   "Selector de opciones",   JOptionPane.YES_NO_OPTION,   JOptionPane.QUESTION_MESSAGE,   null,  
   new Object[] { "Si", "No"},null);
if (seleccion != 1){
            Ordenar inge=new Ordenar();
            inge.setVisible(true);
            this.setVisible(false);
         

}
         else  {
     }
                      
        } else if (e.getSource() == btn5) {
            
   int seleccion = JOptionPane.showOptionDialog(   null, "¿Estas seguro de que quieres crear tu pizza "+ini.prueba+"? ",
   "Crear pizza",   JOptionPane.YES_NO_OPTION,   JOptionPane.QUESTION_MESSAGE,   null,  
   new Object[] { "Si", "No"},null);
if (seleccion != 1){
    
         CTP crear=new CTP();
         crear.setVisible(true);
         this.setVisible(false);
         

}
         else  {

     }
        }

    }
    public final void cuerpo2(){
        //Texto
     txt1= new JLabel("<html>Holaa "+ini.prueba+"! En este apartado podras seleccionar dos de nuestras opciones,<p> ´Ordenar´ o 'Crear tu Pizza' dependiendo de lo que gustes comer el dia de hoy"
             + "(Para mas informacion abre la pestaña 'Informacion')");//+nombre+ "estas son las opciones que te podemos ofrecer");
     txt1.setForeground(Color.white);
     txt1.setBounds(170,90,300,100);
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
     
     btn4 = new JButton();
     btn4= new JButton("Ordenar");
     btn4.setBounds(150,250,100,25);
     btn5 = new JButton();
     btn5= new JButton("Crea tu pizza");
     btn5.setBounds(350,250,120,25);
     
     
     
        //Mostrar
     Menu = new JTextArea();
     Menu.setBounds(25,25,200,200);
        
     
    add(txt1);

    add(btn4);
    btn4.addActionListener(this);
    add(btn5);
    btn5.addActionListener(this);
    add(Immage2);
    add(bag5);
    add(bag4);
    add(BaG2);
  }

    
}
