
package freddys;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author srg12
 */
public class Ordenar extends JFrame implements ActionListener {
     JButton btn1a,btn1b,btn2a,btn2b,btn3a,btn3b,btn4a,btn4b,btn5a,btn5b,btn6a,btn6b,btn7,btn8,btn9a,btn9b,btn10a,btn10b,btn11a,btn11b;
    JPanel BaG2,bag4,bag5;
    JLabel Immage2;
    JTextArea textArea;
    JLabel txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;
  ArrayList<String> listaPizzas = new ArrayList<>();
   Inicio ini = new Inicio();
    int contador = 0;
    int contador1 = 0;
    int contador2= 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int contador6 = 0;
    int contador7 = 0;
    int contador8 = 0;
    
    public Ordenar(){
        Immage2 = new JLabel();
    ImageIcon icon = new ImageIcon("C:\\Users\\srg12\\Documents\\NetBeansProjects\\Freddys\\src\\Imagenes\\Fondo1.png");
    Immage2.setIcon(icon);
    Immage2.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        setTitle("Ordenar"); //Establece el título de la ventana
        setSize(1000, 560); //Dimenciona la ventana (largo y ancho)
        setLayout(null); //Posicionamiento de los objetos
        cuerpo2(); //Llamada al método que contiene los componentes que conforman el  formulario
        this.setResizable(Boolean.FALSE); //Cambiar el tamaño del marco
        setLocationRelativeTo(null); //Posiciona la ventana en el centro
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Operación que se va a realizar, cuando se cierre la ventana
        setVisible(true); //Hace visible la ventana 
        JMenu menuArchivo = new JMenu("Informacion"); // crea el menú archivo
        menuArchivo.setMnemonic('A'); // establece el nemónico a A


        // Agregar componentes al marco
        
        

        // crea el elemento de menú Acerca de...
        JMenuItem elementoAcercaDe = new JMenuItem("Acerca de...");
        elementoAcercaDe.setMnemonic('c'); // establece el nemónico a c
        menuArchivo.add(elementoAcercaDe); // agrega el elemento elementoAcercaDe al menú archivo
        elementoAcercaDe.addActionListener(
                new ActionListener() // clase interna anónima
        {

            // muestra cuadro de diálogo de mensaje cuando el usuario selecciona Acerca de...
            public void actionPerformed(ActionEvent evento) {
                JOptionPane.showMessageDialog(Ordenar.this,
                        ini.prueba+", bienvenido a 'Ordenar', aqui podras\nrealizar e lpedido de cuantas pizzas quieras, solo\nda en el boton ´+´ para agregar una o en el boton\n´-´ para eliminarla y despues el boton ´confirmar´\npara que se actualice tu pedido despues de\ncualquier modoficacion\n"+
                                "Para pagar solo da en el boton ´Pagar´ y podras\nrealizar tu compra",
                        "Acerca de", JOptionPane.PLAIN_MESSAGE);
            } // ﬁn del método actionPerformed
        } // ﬁn de la clase interna anónima
        ); // ﬁn de la llamada a addActionListener
        JMenuItem elementoSalir = new JMenuItem("Salir"); // crea el elemento salir
        elementoSalir.setMnemonic('S'); // establece el nemónico a S
        menuArchivo.add(elementoSalir); // agrega elemento salir al menú archivo
        elementoSalir.addActionListener(
                new ActionListener() // clase interna anónima
        {
            
            // termina la aplicación cuando el usuario hace clic en elementoSalir
            public void actionPerformed(ActionEvent evento) {
                dispose(); // sale de la aplicación
            } // ﬁn del método actionPerformed
        } // ﬁn de la clase interna anónima
        ); // ﬁn de la llamada a addActionListener
        JMenuBar barra = new JMenuBar(); // crea la barra de menús
        setJMenuBar(barra); // agrega la barra de menús a la aplicación
        barra.add(menuArchivo); // agrega el menú archivo a la barra de menús
        
    }
 
    public void actionPerformed(ActionEvent e) {
        // Acciones específicas para cada botón
        if (e.getSource() == btn1a) {
            
            // Acción para el botón "Menu"
            contador++;
             agregarPizzaALista("Pepperoni", contador);
         textArea.append("Pizza de pepperoni: " + contador + "\n");
        } 
    else if (e.getSource() == btn1b) {
                if (contador > 0) {
                    agregarPizzaALista("Pepperoni", contador);
                contador--;
            }
         textArea.append("Pizza de pepperoni:" + contador + "\n");
        } else if (e.getSource() == btn2a) {
               
            // Acción para el botón "Menu"
            contador1++;
            agregarPizzaALista("Hawaianna", contador1);

         textArea.append("Pizza de Hawaianna: " + contador1 + "\n");
        } 
    else if (e.getSource() == btn2b) {
                if (contador1 > 0) {
                contador1--;
                agregarPizzaALista("Hawaianna", contador1);
            }
         textArea.append("Pizza Hawaianna:" + contador1 + "\n");
        }
             else   if (e.getSource() == btn3a) {
            
            // Acción para el botón "Menu"
            contador2++;
            agregarPizzaALista("Tres Quesos", contador2);
         textArea.append("Pizza de Tres quesos: " + contador2 + "\n");
        } 
    else if (e.getSource() == btn3b) {
                if (contador2 > 0) {
                contador2--;
                agregarPizzaALista("Tres Quesos", contador2);
            }
         textArea.append("Pizza de Tres quesos:" + contador2+ "\n");
        } else if (e.getSource() == btn4a) {
               
            // Acción para el botón "Menu"
            contador3++;
            agregarPizzaALista("Vegetariana", contador3);
         textArea.append("Pizza de Vegetariana: " + contador3 + "\n");
        } 
    else if (e.getSource() == btn4b) {
                if (contador3 > 0) {
                contador3--;
                agregarPizzaALista("Vegetariana", contador3);
            }
         textArea.append("Pizza de Vegetariana:" + contador3 + "\n");
        }
       else if (e.getSource() == btn5a) {
            
            // Acción para el botón "Menu"
            contador4++;
            agregarPizzaALista("Mexicana", contador4);
         textArea.append("Pizza de Mexicana: " + contador4 + "\n");
        } 
    else if (e.getSource() == btn5b) {
                if (contador4 > 0) {
                contador4--;
                agregarPizzaALista("Mexicana", contador4);
            }
         textArea.append("Pizza de mexicana:" + contador4 + "\n");
        } else if (e.getSource() == btn6a) {
               
            // Acción para el botón "Menu"
            contador5++;
            agregarPizzaALista("Mariscos", contador5);
         textArea.append("Pizza de Mariscos: " + contador5 + "\n");
        } 
    else if (e.getSource() == btn6b) {
                if (contador5 > 0) {
                contador5--;
                agregarPizzaALista("Mariscos", contador5);
            }
         textArea.append("Pizza de Mariscos:" + contador5 + "\n");
        }else if (e.getSource() == btn9a) {
               
            // Acción para el botón "Menu"
            contador6++;
            agregarPizzaALista("Paquete familiar ", contador6);

         textArea.append("Pizza Pepperoni\n" +"Pizza Mariscos\n"+"Refresco Grande "+ contador6 + "\n");
        } 
    else if (e.getSource() == btn9b) {
                if (contador6 > 0) {
                contador6--;
                agregarPizzaALista("Paquete Familiar ", contador6);
            }
         textArea.append("Pizza Pepperoni\n" +"Pizza Mariscos\n"+"Refresco Grande "+ contador6 + "\n");
        }
             else   if (e.getSource() == btn10a) {
            
            // Acción para el botón "Menu"
            contador7++;
            agregarPizzaALista("Paquete amigos ", contador7);
         textArea.append("Pizza Pepperoni\n" +"Pizza Hawaianna\n"+"Pizza tres Quesos\n" +"Seis refrescos chicos " + contador7 + "\n");
        } 
    else if (e.getSource() == btn10b) {
                if (contador7 > 0) {
                contador7--;
                agregarPizzaALista("Paquete amigos ", contador7);
            }
         textArea.append("Pizza Pepperoni\n" +"Pizza Hawaianna\n"+"Pizza tres Quesos\n" +"Seis refrescos chicos " + contador7+ "\n");
        }              else   if (e.getSource() == btn11a) {
            
            // Acción para el botón "Menu"
            contador8++;
            agregarPizzaALista("Paquete Pareja ", contador8);
         textArea.append("Pizza Hawaianna\n Dos refrescos Medianos " +contador8 + "\n");
        } 
    else if (e.getSource() == btn11b) {
                if (contador8 > 0) {
                contador8--;
                agregarPizzaALista("Paquete pareja ", contador8);
            }
         textArea.append("Pizza Hawaianna\n Dos refrescos Medianos " + contador8+ "\n");
                 }
                      else if (e.getSource() == btn7) {
        imprimirListaPizzas();
         
          }
           else if (e.getSource() == btn8) {
        imprimirListaPizzas();
        int total = calcularTotal();
        boolean pagarConTarjeta = confirmarPagoConTarjeta();
        if (pagarConTarjeta) {
            double descuento = total * 0.15;
            total -= descuento;
            JOptionPane.showMessageDialog(this, 
                    "      Fredys Fazbear Pizza\n"+
                    "------ Ticket de Compra ------\n"+
                    "Pizza Peperoni______"+contador+
                    "\nPizza Hawaiana_____"+contador1+
                    "\nPizza de Tres Quesos________"+contador2+
                    "\nPizza de Vegetariana____"+contador3+
                    "\nPizza Mexicana_________"+contador4+
                    "\nPizza Mariscos__________"+contador5+
                    "\n-----------------------------\n"+
                    "\nDescuento del 15% aplicado.\n"
                    + " Total a pagar: $" + total+
                    "\n-----------------------------\n"+
                      "Gracias por tu compra "+ ini.prueba);
           
            this.setVisible(false);
        } else {
                    JOptionPane.showMessageDialog(this, 
                    "      Fredys Fazbear Pizza\n"+
                    "------ Ticket de Compra ------\n"+
                    "Pizza Peperoni______"+contador+
                    "\nPizza Hawaiana_____"+contador1+
                    "\nPizza de Tres Quesos________"+contador2+
                    "\nPizza de Vegetariana____"+contador3+
                    "\nPizza Mexicana_________"+contador4+
                    "\nPizza Mariscos__________"+contador5+
                    "\n-----------------------------\n"+
                    "\nDescuento del 15% aplicado.\n"
                    + 
                    "\nSin descuento del 15% aplicado."
                    + "\n Total a pagar: $" + total+
                    "\n-----------------------------\n"+
                      "Gracias por tu compra "+ ini.prueba);
                                
            this.setVisible(false);
        }
           }
    }
         


private int calcularTotal() {
    // Calcula el total sumando la cantidad de cada ingrediente
    int total = (contador*120) + (contador1*120) + (contador2*120) + (contador3*120) + (contador4*120) +
                (contador5*120)+(contador6*300)+(contador7*500)+(contador8*250);

    // Puedes agregar costos adicionales o lógica de precios aquí si es necesario

    return total;
}

private boolean confirmarPagoConTarjeta() {
    // Pregunta al usuario si va a pagar con tarjeta
    int opcion = JOptionPane.showConfirmDialog(this, "¿Va a pagar con tarjeta?", "Confirmar pago", JOptionPane.YES_NO_OPTION);
    return opcion == JOptionPane.YES_OPTION;

    }
     public void imprimirListaPizzas() {
        textArea.setText(""); // Limpiar el área de texto

        for (String pizza : listaPizzas) {
            textArea.append(pizza + "\n");
        }
    }

    public void agregarPizzaALista(String nombrePizza, int cantidad) {
        String mensaje = "Pizza de " + nombrePizza + ": " + cantidad;
        listaPizzas.add(mensaje);
    }

    public final void cuerpo2(){
        //Texto
    txt1 = new JLabel("Pizza de Peperoni");
    txt1.setForeground(Color.white);
    txt1.setBounds(110,20,300,30);
    txt2 = new JLabel("Pizza Hawaianna");
    txt2.setForeground(Color.white);
    txt2.setBounds(110,70,300,30);
    txt3 = new JLabel("Pizza de Tres Qesos");
    txt3.setForeground(Color.white);
    txt3.setBounds(110,110,300,30);
    txt4 = new JLabel("Pizza Vegetariana");
    txt4.setForeground(Color.white);
    txt4.setBounds(110,160,300,30);
    txt5 = new JLabel("Pizza de Mexicana");
    txt5.setForeground(Color.white);
    txt5.setBounds(110,210,300,30);
    txt6 = new JLabel("Pizza de Mariscos");
    txt6.setForeground(Color.white);
    txt6.setBounds(110,260,300,30);
    txt7 = new JLabel("Paquete Familair");
    txt7.setForeground(Color.white);
    txt7.setBounds(370,70,300,30);
    txt8 = new JLabel("Paquete Amigos");
    txt8.setForeground(Color.white);
    txt8.setBounds(370,110,300,30);
    txt9 = new JLabel("Paquete Pareja");
    txt9.setForeground(Color.white);
    txt9.setBounds(370,160,300,30);
    
    
    textArea = new JTextArea();
    textArea.setEditable(false); // Hacer el área de texto no editable
    JScrollPane scrollPane = new JScrollPane(textArea);
    scrollPane.setBounds(700, 50, 200, 250);
        //Fondos
    bag4 = new JPanel();
    bag4.setBackground(new Color (0,255,255));//Borde azul
    bag4.setBounds(15,10,950, 480);
    bag5 = new JPanel();
    bag5.setBackground(Color.black);
    bag5.setBounds(23,18,932, 462);
    BaG2 = new JPanel();
    BaG2.setBackground(Color.black);
    BaG2.setSize(1000, 500);    
    //Botones
    btn1a = new JButton();
     btn1a= new JButton("+");
     btn1a.setBounds(220,20,50,25);
     btn1b = new JButton();
     btn1b= new JButton("-");
     btn1b.setBounds(50,20,50,25);
     btn2a = new JButton();
     btn2a= new JButton("+");
     btn2a.setBounds(220,70,50,25);
     btn2b = new JButton();
     btn2b= new JButton("-");
     btn2b.setBounds(50,70,50,25);
     btn3a = new JButton();
     btn3a= new JButton("+");
     btn3a.setBounds(220,110,50,25);
     btn3b = new JButton();
     btn3b= new JButton("-");
     btn3b.setBounds(50,110,50,25);
     btn4a = new JButton();
     btn4a= new JButton("+");
     btn4a.setBounds(220,160,50,25);
     btn4b = new JButton();
     btn4b= new JButton("-");
     btn4b.setBounds(50,160,50,25);
     btn5a = new JButton();
     btn5a= new JButton("+");
     btn5a.setBounds(220,210,50,25);
     btn5b = new JButton();
     btn5b= new JButton("-");
     btn5b.setBounds(50,210,50,25);
     btn6a = new JButton();
     btn6a= new JButton("+");
     btn6a.setBounds(220,260,50,25);
     btn6b = new JButton();
     btn6b= new JButton("-");
     btn6b.setBounds(50,260,50,25);
     btn7= new JButton("Confirmar");
     btn7.setBounds(700, 400, 100,25);
     btn8= new JButton("Ticket");
     btn8.setBounds(800, 400, 100,25);
     btn9a = new JButton();
     btn9a= new JButton("+");
     btn9a.setBounds(470,60,50,25);
     btn9b = new JButton();
     btn9b= new JButton("-");
     btn9b.setBounds(300,60,50,25);
     btn10a = new JButton();
     btn10a= new JButton("+");
     btn10a.setBounds(470,110,50,25);
     btn10b = new JButton();
     btn10b= new JButton("-");
     btn10b.setBounds(300,110,50,25);
     btn11a = new JButton();
     btn11a= new JButton("+");
     btn11a.setBounds(470,160,50,25);
     btn11b = new JButton();
     btn11b= new JButton("-");
     btn11b.setBounds(300,160,50,25);
     
     
        //Mostrar
     add(txt1);
     add(txt2);
     add(txt3);
     add(txt4);
     add(txt5);
     add(txt6);
     add(txt7);
     add(txt8);
     add(txt9);
     
     add(btn1a);
     btn1a.addActionListener(this);
     add(btn1b);
     btn1b.addActionListener(this);
     add(btn2a);
     btn2a.addActionListener(this);
     add(btn2b);
     btn2b.addActionListener(this);
     add(btn3a);
     btn3a.addActionListener(this);
     add(btn3b);
     btn3b.addActionListener(this);
     add(btn4a);
     btn4a.addActionListener(this);
     add(btn4b);
     btn4b.addActionListener(this);
     add(btn5a);
     btn5a.addActionListener(this);
     add(btn5b);
     btn5b.addActionListener(this);
     add(btn6a);
     btn6a.addActionListener(this);
     add(btn6b);
     btn6b.addActionListener(this);
     add(btn7);
     btn7.addActionListener(this);
     add(btn8);
     btn8.addActionListener(this);
     add(btn9a);
     btn9a.addActionListener(this);
     add(btn9b);
     btn9b.addActionListener(this);
     add(btn10a);
     btn10a.addActionListener(this);
     add(btn10b);
     btn10b.addActionListener(this);
     add(btn11a);
     btn11a.addActionListener(this);
     add(btn11b);
     btn11b.addActionListener(this);
     
     add(scrollPane);
     add(Immage2);
     add(bag5);
     add(bag4);
     add(BaG2);
  
}

}
