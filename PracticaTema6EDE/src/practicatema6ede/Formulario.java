package practicatema6ede;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
public class Formulario extends JFrame implements ActionListener{
 
    JPanel miPanel;
    JLabel tituloT, valor1T, valor2T;
    JTextField valor2TF, valor1TF, resultadoTF;
    JButton suma, resta, multiplicacion, division, salir, limpiarB;
    double num1, num2, resultado;
    public Formulario(){
        // Propiedades del formulario
        this.setTitle("Ejemplo formulario");
        this.setSize(550, 300); //Ancho y alto en píxeles
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Creamos el panel
        miPanel = new JPanel();
        miPanel.setLayout(null);
        //Creamos los controles de la interface
        //TEXTFIELDS
        valor1TF = new JTextField();
        valor1TF.setText("");//Introducir texto en el JLabel()
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        valor1TF.setBounds(50, 110, 200, 35);
        miPanel.add(valor1TF);
        valor2TF = new JTextField();
        valor2TF.setText("");//Introducir texto en el JLabel()
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        valor2TF.setBounds(295, 110, 200, 35);
        miPanel.add(valor2TF);
        resultadoTF = new JTextField();
        resultadoTF.setFocusable(false);
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        resultadoTF.setBounds(50, 30, 445, 50);
        miPanel.add(resultadoTF);
        //JLABEL
        tituloT = new JLabel();
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        tituloT.setBounds(50, 10, 445, 20);
        miPanel.add(tituloT);
        valor1T = new JLabel();
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        valor1T.setBounds(50, 80, 200, 35);
        valor1T.setText("Introduce valor 1: ");
        miPanel.add(valor1T);
        valor2T = new JLabel();
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        valor2T.setBounds(295, 80, 200, 35);
        valor2T.setText("Introduce valor 2: ");
        miPanel.add(valor2T);
        //BUTTONS
        suma = new JButton("Sumar");
        suma.setBounds(30, 155, 110, 35);
        miPanel.add(suma);
        suma.addActionListener(this);
 
        resta = new JButton("Restar");
        resta.setBounds(155, 155, 110, 35);
        miPanel.add(resta);
        resta.addActionListener(this);
 
        multiplicacion = new JButton("Multiplicar");
        multiplicacion.setBounds(280, 155, 110, 35);
        miPanel.add(multiplicacion);
        multiplicacion.addActionListener(this);
 
        division = new JButton("División");
        division.setBounds(405, 155, 110, 35);
        miPanel.add(division);
        division.addActionListener(this);
        salir = new JButton("Salir");
        salir.setBounds(155, 220, 110, 35);
        miPanel.add(salir);
        salir.addActionListener(this);
        limpiarB = new JButton("Limpiar");
        limpiarB.setBounds(280, 220, 110, 35);
        miPanel.add(limpiarB);
        limpiarB.addActionListener(this);
        this.add(miPanel);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Double resultado = 0.0;
        if (e.getSource() == salir) {
            System.exit(0);            
        } else if (e.getSource() == limpiarB){
            resultadoTF.setText("");
            valor1TF.setText("");
            valor2TF.setText("");
        } else {
            try {
                Double num1 = Double.parseDouble(valor2TF.getText());
                Double num2 = Double.parseDouble(valor1TF.getText());
                if(e.getSource() == suma) {
                    resultado = (num1 + num2);  
                } else if(e.getSource() == resta){
                    resultado = (num1 - num2);
                } else if(e.getSource() == multiplicacion){
                    resultado = (num1 * num2);
                } else if(e.getSource() == division){
                    resultado = (num1 / num2);
                }
                resultadoTF.setText("Resultado: " + resultado);
            } catch (NumberFormatException ex){
                tituloT.setText("Valor introducido incorrecto. Vuelva a intentarlo.");
                resultadoTF.setText(":(");
            }     
        }
    }
}