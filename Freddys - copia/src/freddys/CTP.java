/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class CTP extends JFrame implements ActionListener {
     JButton btn1a,btn1b,btn2a,btn2b,btn3a,btn3b,btn4a,btn4b,btn5a,btn5b,btn6a,btn6b,btn7a,btn7b,btn8a,btn8b,btn9a,btn9b,btn10a,btn10b
             ,btn11a,btn11b,btn12a,btn12b,btn13a,btn13b,btn14a,btn14b,btn15,btn16;
    JPanel BaG2,bag4,bag5;
    private boolean btn1aVisible = true;
    private boolean btn2aVisible = true;
    private boolean btn3aVisible = true;
    private boolean btn4aVisible = true;
   Inicio ini = new Inicio();
           
     ArrayList<String> listaIngredientes = new ArrayList<>();
    JLabel Immage2;
    JTextArea textArea;
    JLabel txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14;
    int contador6 = 0;
    int contador7 = 0;
    int contador8= 0;
    int contador9 = 0;
    int contador10 = 0;
    int contador11 = 0;
    int contador12 = 0;
    int contador13 = 0;
    int contador14 = 0;
    int contador15 = 0;
    int contador16 = 0;
    int contador17= 0;
    int contador18 = 0;
    int contador19 = 0;
    
    
    
    public CTP(){
                Immage2 = new JLabel();
    ImageIcon icon = new ImageIcon("C:\\Users\\srg12\\Documents\\NetBeansProjects\\Freddys - copia\\src\\Imagenes\\Fondo3.png");
    Immage2.setIcon(icon);
    Immage2.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        setTitle("Crea tu pizza"); //Establece el título de la ventana
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
                JOptionPane.showMessageDialog(CTP.this,
                        "(Nombre), Bienvenido a 'Crea tu pizza', aqui podras personalizar tu pedido, añadiendole los ingredientes que quieras",
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
        contador6++;
        agregarPizzaALista("Masa Integral", contador6);
        textArea.append("Masa integral: " + contador6 + "\n");
        btn1aVisible = false; // Oculta btn1a
        btn1a.setVisible(false);
        btn2aVisible = false; // Oculta btn1a
        btn2a.setVisible(false);
        
    } else if (e.getSource() == btn1b) {
        if (contador6 > 0) {
            contador6--;
            agregarPizzaALista("Masa Integral", contador6);
        }
        textArea.append("Masa integral:" + contador6 + "\n");
    } else if (e.getSource() == btn2a || e.getSource() == btn2b || e.getSource() == btn3a || e.getSource() == btn3b
            || e.getSource() == btn4a || e.getSource() == btn4b || e.getSource() == btn5a || e.getSource() == btn5b
            || e.getSource() == btn6a || e.getSource() == btn6b || e.getSource() == btn7a || e.getSource() == btn7b
            || e.getSource() == btn8a || e.getSource() == btn8b || e.getSource() == btn9a || e.getSource() == btn9b
            || e.getSource() == btn10a || e.getSource() == btn10b || e.getSource() == btn11a || e.getSource() == btn11b
            || e.getSource() == btn12a || e.getSource() == btn12b || e.getSource() == btn13a || e.getSource() == btn13b
            || e.getSource() == btn14a || e.getSource() == btn14b) {
        btn1aVisible = true; // Restaura la visibilidad de btn1a
        btn1a.setVisible(true);
        btn2aVisible = true; // Oculta btn1a
        btn2a.setVisible(true);
    
          // Acción para el Masa integral
        if (e.getSource() == btn2a) {
        contador7++;
         agregarPizzaALista("Masa Harina", contador7);
        textArea.append("Masa integral: " + contador7 + "\n");
        btn2aVisible = false; // Oculta btn1a
        btn2a.setVisible(false);
        btn1aVisible = false; // Oculta btn1a
        btn1a.setVisible(false);
    } else if (e.getSource() == btn2b) {
        if (contador7 > 0) {
            contador7--;
            agregarPizzaALista("Masa Harina", contador7);
        }
        textArea.append("Masa Harina:" + contador7 + "\n");
    } else if (e.getSource() == btn1a || e.getSource() == btn2b || e.getSource() == btn3a || e.getSource() == btn3b
            || e.getSource() == btn4a || e.getSource() == btn4b || e.getSource() == btn5a || e.getSource() == btn5b
            || e.getSource() == btn6a || e.getSource() == btn6b || e.getSource() == btn7a || e.getSource() == btn7b
            || e.getSource() == btn8a || e.getSource() == btn8b || e.getSource() == btn9a || e.getSource() == btn9b
            || e.getSource() == btn10a || e.getSource() == btn10b || e.getSource() == btn11a || e.getSource() == btn11b
            || e.getSource() == btn12a || e.getSource() == btn12b || e.getSource() == btn13a || e.getSource() == btn13b
            || e.getSource() == btn14a || e.getSource() == btn14b) {
        btn2aVisible = true; // Restaura la visibilidad de btn1a
        btn2a.setVisible(true);
        btn1aVisible = true; // Oculta btn1a
        btn1a.setVisible(true);
         // Acción para masa harina
    }
    }
            if (e.getSource() == btn3a) {
              contador8++;
              agregarPizzaALista("Salsa Pesto", contador8);
         textArea.append("Salsa Pesto " + contador8 + "\n");
        btn3aVisible = false; // Oculta btn1a
        btn3a.setVisible(false);
        btn4aVisible = false; // Oculta btn1a
        btn4a.setVisible(false);
        } 
else if (e.getSource() == btn3b) {
        if (contador8 > 0) {
            contador8--;
            agregarPizzaALista("Salsa Pesto", contador8);
        }
        textArea.append("Salsa Pesto:" + contador8 + "\n");
    } else if (e.getSource() == btn1a || e.getSource() == btn2b || e.getSource() == btn3a || e.getSource() == btn3b
            || e.getSource() == btn4a || e.getSource() == btn4b || e.getSource() == btn5a || e.getSource() == btn5b
            || e.getSource() == btn6a || e.getSource() == btn6b || e.getSource() == btn7a || e.getSource() == btn7b
            || e.getSource() == btn8a || e.getSource() == btn8b || e.getSource() == btn9a || e.getSource() == btn9b
            || e.getSource() == btn10a || e.getSource() == btn10b || e.getSource() == btn11a || e.getSource() == btn11b
            || e.getSource() == btn12a || e.getSource() == btn12b || e.getSource() == btn13a || e.getSource() == btn13b
            || e.getSource() == btn14a || e.getSource() == btn14b) {
        btn3aVisible = true; // Restaura la visibilidad de btn1a
        btn3a.setVisible(true);
        btn4aVisible = true; // Oculta btn1a
        btn4a.setVisible(true);
    
    
         // Acción para salsa pesto
         if (e.getSource() == btn4a) {
        contador9++;
        agregarPizzaALista("Salsa Tomate", contador9);
        textArea.append("Salsa tomate " + contador9 + "\n");
        btn3aVisible = false; // Oculta btn1a
        btn3a.setVisible(false);
        btn4aVisible = false; // Oculta btn1a
        btn4a.setVisible(false);
        } 
    else if (e.getSource() == btn4b) {
        if (contador9 > 0) {
            contador9--;
            agregarPizzaALista("Salsa Tomate", contador8);
        }
        textArea.append("Masa harina:" + contador9 + "\n");
    } else if (e.getSource() == btn1a || e.getSource() == btn2b || e.getSource() == btn3a || e.getSource() == btn3b
            || e.getSource() == btn4a || e.getSource() == btn4b || e.getSource() == btn5a || e.getSource() == btn5b
            || e.getSource() == btn6a || e.getSource() == btn6b || e.getSource() == btn7a || e.getSource() == btn7b
            || e.getSource() == btn8a || e.getSource() == btn8b || e.getSource() == btn9a || e.getSource() == btn9b
            || e.getSource() == btn10a || e.getSource() == btn10b || e.getSource() == btn11a || e.getSource() == btn11b
            || e.getSource() == btn12a || e.getSource() == btn12b || e.getSource() == btn13a || e.getSource() == btn13b
            || e.getSource() == btn14a || e.getSource() == btn14b) {
        btn3aVisible = true; // Restaura la visibilidad de btn1a
        btn3a.setVisible(true);
        btn4aVisible = true; // Oculta btn1a
        btn4a.setVisible(true);
    }// Acción para salsa tomate
        }
        if (e.getSource() == btn5a) {
         contador10++;
          agregarPizzaALista("Pepperoni", contador10);
         textArea.append("Pepperoni: " + contador10 + "\n");
        } 
    else if (e.getSource() == btn5b) {
                if (contador10 > 0) {
                contador10--;
                agregarPizzaALista("Pepperoni", contador10);
            }
         textArea.append("Pepperoni:" + contador10 + "\n");
         // Acción para Pepperoni
        } else if (e.getSource() == btn6a) {
         contador11++;
         agregarPizzaALista("Aceitunas", contador11);
         textArea.append("Aceitunas" + contador11 + "\n");
        } 
    else if (e.getSource() == btn6b) {
                if (contador11 > 0) {
                contador11--;
                agregarPizzaALista("Aceitunas", contador11);
            }
         textArea.append("Aceirunas" + contador11 + "\n");
         // Acción para Aceitunas
        }
        else if (e.getSource() == btn7a) {
         contador12++;
         agregarPizzaALista("Marisco", contador12);
         textArea.append("Marisco" + contador12 + "\n");
        } 
    else if (e.getSource() == btn7b) {
                if (contador12 > 0) {
                contador12--;
                agregarPizzaALista("Marisco", contador12);
            }
         textArea.append("Marisco" + contador12 + "\n");
         // Acción para el Marisco
        }        else if (e.getSource() == btn8a) {
         contador13++;
         agregarPizzaALista("Piña", contador13);
         textArea.append("Piña" + contador13 + "\n");
        } 
    else if (e.getSource() == btn8b) {
                if (contador13 > 0) {
                contador13--;
                agregarPizzaALista("Piña", contador13);
            }
         textArea.append("Piña" + contador13 + "\n");
         // Acción para Piña
        }
                else if (e.getSource() == btn9a) {
         contador14++;
         agregarPizzaALista("Jamon", contador14);
         textArea.append("Jamon" + contador14 + "\n");
        } 
    else if (e.getSource() == btn9b) {
                if (contador14 > 0) {
                contador14--;
                agregarPizzaALista("Jamon", contador14);
            }
         textArea.append("Jamon" + contador14+ "\n");
         // Acción para el Jamon
        }
                else if (e.getSource() == btn10a) {
         contador15++;
         agregarPizzaALista("Jalapeño", contador15);
         textArea.append("Jalapeño" + contador15 + "\n");
        } 
    else if (e.getSource() == btn10b) {
                if (contador15 > 0) {
                contador15--;
                agregarPizzaALista("Jalapeño", contador15);
            }
         textArea.append("Jalapeño" + contador15 + "\n");
         // Acción para el Jalapeño
        }
                else if (e.getSource() == btn11a) {
         contador16++;
         agregarPizzaALista("Carne", contador16);
         textArea.append("Carne" + contador16 + "\n");
        } 
    else if (e.getSource() == btn11b) {
                if (contador16 > 0) {
                contador16--;
                agregarPizzaALista("Carne", contador16);
            }
         textArea.append("Carne" + contador16 + "\n");
         // Acción para el Carne
        }
                else if (e.getSource() == btn12a) {
         contador17++;
         agregarPizzaALista("Cebolla", contador17);
         textArea.append("Cebolla" + contador17+ "\n");
        } 
    else if (e.getSource() == btn12b) {
                if (contador17 > 0) {
                contador17--;
                agregarPizzaALista("Cebolla", contador17);
            }
         textArea.append("Cebolla" + contador17 + "\n");
         // Acción para Cebolla
        }   else if (e.getSource() == btn13a) {
         contador18++;
         agregarPizzaALista("Pimiento", contador18);
         textArea.append("Pimiento" + contador18 + "\n");
        } 
    else if (e.getSource() == btn13b) {
                if (contador18 > 0) {
                contador18--;
                agregarPizzaALista("Pimiento", contador18);
            }
         textArea.append("Pimiento" + contador18 + "\n");
         // Acción para el Pimiento
        }
                else if (e.getSource() == btn14a) {
         contador19++;
         agregarPizzaALista("Queso", contador19);
         textArea.append("Queso" + contador19 + "\n");
        } 
    else if (e.getSource() == btn14b) {
                if (contador19 > 0) {
                contador19--;
                agregarPizzaALista("Queso", contador19);
            }
         textArea.append("Queso" + contador19 + "\n");
         // Acción para el Queso
        }
          else if (e.getSource() == btn15) {
        imprimirListaIngredientes();
        btn16.setVisible(true); 
          }
           else if (e.getSource() == btn16) {
        imprimirListaIngredientes();
        int total = calcularTotal();
        boolean pagarConTarjeta = confirmarPagoConTarjeta();
        if (pagarConTarjeta) {
            double descuento = total * 0.15;
            total -= descuento;
            JOptionPane.showMessageDialog(this, 
                    "      Fredys Fazbear Pizza\n"+
                    "------ Ticket de Compra ------\n"+
                    "Masa integral______"+contador6+
                    "\nMasa de harina_____"+contador7+
                    "\nSalsa pesto________"+contador8+
                    "\nSalsa de Tomate____"+contador9+
                    "\nPepperoni_________"+contador10+
                    "\nAceitunas__________"+contador11+
                    "\nMariscos__________"+contador12+
                    "\nPiña______________"+contador13+
                    "\nJamon____________"+contador14+
                    "\nJalapeño__________"+contador15+
                    "\nCarne____________"+contador16+
                    "\ncebolla____________"+contador17+
                    "\nPimiento___________"+contador18+
                    "\nQueso_____________"+contador19+
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
                    "Masa integral______"+contador6+
                    "\nMasa de harina_____"+contador7+
                    "\nSalsa pesto________"+contador8+
                    "\nSalsa de Tomate____"+contador9+
                    "\nPepperoni_________"+contador10+
                    "\nAceitunas__________"+contador11+
                    "\nMariscos__________"+contador12+
                    "\nPiña______________"+contador13+
                    "\nJamon____________"+contador14+
                    "\nJalapeño__________"+contador15+
                    "\nCarne____________"+contador16+
                    "\ncebolla____________"+contador17+
                    "\nPimiento___________"+contador18+
                    "\nQueso_____________"+contador19+
                    "\n-----------------------------\n"+
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
    int total = (contador6*100) + (contador7*100) + (contador8*20) + (contador9*20) + (contador10*20) +
                (contador11*20) + (contador12*20) + (contador13*20) + (contador14*20) + (contador15*20) +
                (contador16*20) + (contador17*20) + (contador18*20) + (contador19*20);

    // Puedes agregar costos adicionales o lógica de precios aquí si es necesario

    return total;
}

private boolean confirmarPagoConTarjeta() {
    // Pregunta al usuario si va a pagar con tarjeta
    int opcion = JOptionPane.showConfirmDialog(this, "¿Va a pagar con tarjeta?", "Confirmar pago", JOptionPane.YES_NO_OPTION);
    return opcion == JOptionPane.YES_OPTION;

    }
     public void imprimirListaIngredientes() {
        textArea.setText(""); // Limpiar el área de texto

        for (String Ingrediente : listaIngredientes) {
            textArea.append(Ingrediente + "\n");
        }
    }

    public void agregarPizzaALista(String nombreIngre, int cantidad) {
        String mensaje = "+Ingrediente " + nombreIngre + ": " + cantidad;
        listaIngredientes.add(mensaje);
    }
    public final void cuerpo2(){
        //Texto
    txt1 = new JLabel("Masa Integral");
    txt1.setForeground(Color.white);
    txt1.setBounds(110,70,300,30);
    txt2 = new JLabel("Masa de Harina");
    txt2.setForeground(Color.white);
    txt2.setBounds(110,110,300,30);
    txt3 = new JLabel("Salsa pesto");
    txt3.setForeground(Color.white);
    txt3.setBounds(110,160,300,30);
    txt4 = new JLabel("Salsa de tomate");
    txt4.setForeground(Color.white);
    txt4.setBounds(110,210,300,30);
    txt5 = new JLabel("Pepperoni");
    txt5.setForeground(Color.white);
    txt5.setBounds(110,260,300,30);
    txt6 = new JLabel("Aceitunas");
    txt6.setForeground(Color.white);
    txt6.setBounds(110,310,300,30);
    txt7 = new JLabel("Mariscos");
    txt7.setForeground(Color.white);
    txt7.setBounds(110,360,300,30);
    txt8 = new JLabel("Piña");
    txt8.setForeground(Color.white);
    txt8.setBounds(110,410,300,30);
    txt9 = new JLabel("Jamon");
    txt9.setForeground(Color.white);
    txt9.setBounds(370,70,300,30);
    txt10 = new JLabel("Jalapeño");
    txt10.setForeground(Color.white);
    txt10.setBounds(370,110,300,30);
    txt11 = new JLabel("Carne");
    txt11.setForeground(Color.white);
    txt11.setBounds(370,160,300,30);
    txt12= new JLabel("Cebolla");
    txt12.setForeground(Color.white);
    txt12.setBounds(370,210,300,30);
    txt13= new JLabel("Pimiento");
    txt13.setForeground(Color.white);
    txt13.setBounds(370,260,300,30);    
    txt14= new JLabel("Queso");
    txt14.setForeground(Color.white);
    txt14.setBounds(370,310,300,30);
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
     btn1a.setBounds(220,70,50,25);
     btn1b = new JButton();
     btn1b= new JButton("-");
     btn1b.setBounds(50,70,50,25);
     btn2a = new JButton();
     btn2a= new JButton("+");
     btn2a.setBounds(220,110,50,25);
     btn2b = new JButton();
     btn2b= new JButton("-");
     btn2b.setBounds(50,110,50,25);
     btn3a = new JButton();
     btn3a= new JButton("+");
     btn3a.setBounds(220,160,50,25);
     btn3b = new JButton();
     btn3b= new JButton("-");
     btn3b.setBounds(50,160,50,25);
     btn4a = new JButton();
     btn4a= new JButton("+");
     btn4a.setBounds(220,210,50,25);
     btn4b = new JButton();
     btn4b= new JButton("-");
     btn4b.setBounds(50,210,50,25);
     btn5a = new JButton();
     btn5a= new JButton("+");
     btn5a.setBounds(220,260,50,25);
     btn5b = new JButton();
     btn5b= new JButton("-");
     btn5b.setBounds(50,260,50,25);
     btn6a = new JButton();
     btn6a= new JButton("+");
     btn6a.setBounds(220,310,50,25);
     btn6b = new JButton();
     btn6b= new JButton("-");
     btn6b.setBounds(50,310,50,25);
     btn7a = new JButton();
     btn7a= new JButton("+");
     btn7a.setBounds(220,360,50,25);
     btn7b = new JButton();
     btn7b= new JButton("-");
     btn7b.setBounds(50,360,50,25);
     btn8a = new JButton();
     btn8a= new JButton("+");
     btn8a.setBounds(220,410,50,25);
     btn8b = new JButton();
     btn8b= new JButton("-");
     btn8b.setBounds(50,410,50,25);
     btn9a = new JButton();
     btn9a= new JButton("+");
     btn9a.setBounds(470,700,50,25);
     btn9b = new JButton();
     btn9b= new JButton("-");
     btn9b.setBounds(300,70,50,25);
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
     btn12a = new JButton();
     btn12a= new JButton("+");
     btn12a.setBounds(470,210,50,25);
     btn12b = new JButton();
     btn12b= new JButton("-");
     btn12b.setBounds(300,210,50,25);
     btn13a = new JButton();
     btn13a= new JButton("+");
     btn13a.setBounds(470,260,50,25);
     btn13b = new JButton();
     btn13b= new JButton("-");
     btn13b.setBounds(300,260,50,25);    
     btn14a = new JButton();
     btn14a= new JButton("+");
     btn14a.setBounds(470,310,50,25);
     btn14b = new JButton();
     btn14b= new JButton("-");
     btn14b.setBounds(300,310,50,25);
     btn15= new JButton("Confirmar");
     btn15.setBounds(700, 400, 100,25);
     btn16= new JButton("Ticket");
     btn16.setBounds(800, 400, 100,25);
     
     
     
     
     
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
     add(txt10);
     add(txt11);
     add(txt12);
     add(txt13);
     add(txt14);
     //Termino de txt
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
     add(btn7a);
     btn7a.addActionListener(this);
     add(btn7b);
     btn7b.addActionListener(this);
     add(btn8a);
     btn8a.addActionListener(this);
     add(btn8b);
     btn8b.addActionListener(this);
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
     add(btn12a);
     btn12a.addActionListener(this);
     add(btn12b);
     btn12b.addActionListener(this);
     add(btn13a);
     btn13a.addActionListener(this);
     add(btn13b);
     btn13b.addActionListener(this);     
     add(btn14a);
     btn14a.addActionListener(this);
     add(btn14b);
     btn14b.addActionListener(this);
     add(btn15);
     btn15.addActionListener(this);        
     add(btn16);
     btn16.addActionListener(this);     
     add(scrollPane);
     add(Immage2);
     add(bag5);
     add(bag4);
     add(BaG2);
     }
}