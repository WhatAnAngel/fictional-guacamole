package actividad22t6pro;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

    //Atributos
    JPanel miPanel;
    JLabel tituloT, importeInT, importeOuT;
    JTextField importeInTF, divisaInTF, importeOuTF, divisaOuTF;
    JButton francosB, librasB;
    JButton calcularB, salirB, limpiarB;
    
    public Formulario() {

        // Propiedades del formulario
        this.setTitle("Convertidor de divisas");
        this.setSize(455, 320);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos el panel
        miPanel = new JPanel();
        miPanel.setLayout(null);

        // JLABELS
        tituloT = new JLabel("Intoduzca importe y seleccione divisa a convertir: ");
        tituloT.setBounds(50, 25, 350, 20);
        miPanel.add(tituloT);

        importeInT = new JLabel("Importe: ");
        importeInT.setBounds(50, 70, 100, 30);
        miPanel.add(importeInT);
        
        importeOuT = new JLabel("Cambio: ");
        importeOuT.setBounds(50, 115, 100, 30);
        miPanel.add(importeOuT);

        // TEXTFIELDS
        
        //Entrada
        importeInTF = new JTextField();
        importeInTF.setBounds(110, 70, 190, 30);
        miPanel.add(importeInTF);

        divisaInTF = new JTextField();
        divisaInTF.setBounds(310, 70, 90, 30);
        divisaInTF.setFocusable(false);
        divisaInTF.setText("euros");
        miPanel.add(divisaInTF);
        
        //Salida
        importeOuTF = new JTextField();
        importeOuTF.setBounds(110, 115, 190, 30);
        importeOuTF.setFocusable(false);
        miPanel.add(importeOuTF);

        divisaOuTF = new JTextField();
        divisaOuTF.setBounds(310, 115, 90, 30);
        divisaOuTF.setFocusable(false);
        miPanel.add(divisaOuTF);

        // BUTTONS       
        francosB = new JButton("Francos");
        francosB.setBounds(45, 170, 160, 40);
        miPanel.add(francosB);
        francosB.addActionListener(this);
        
        librasB = new JButton("Libras");
        librasB.setBounds(240, 170, 160, 40);
        miPanel.add(librasB);
        librasB.addActionListener(this); 
  
        //Limpiar y cerrar
        salirB = new JButton("Salir");
        salirB.setBounds(305, 235, 100, 30);
        miPanel.add(salirB);
        salirB.addActionListener(this);

        limpiarB = new JButton("Limpiar");
        limpiarB.setBounds(45, 235, 100, 30);
        miPanel.add(limpiarB);
        limpiarB.addActionListener(this);

        // Añadimos el panel al JFrame
        add(miPanel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        double importeIn = 0, importeOut = 0;
        
        if (e.getSource() == salirB) {
            System.exit(0); //Salir del programa   
        } else if (e.getSource() == limpiarB) {
            tituloT.setText("Intoduzca importe y seleccione divisa a convertir:");
            importeInTF.setText(""); //Limpiar todos los campos
            importeOuTF.setText("");
            divisaOuTF.setText("");
        } else {
            
            try{
                importeIn = Double.parseDouble(importeInTF.getText());
            }catch(NumberFormatException ex){
                tituloT.setText("Valor introducido incorrecto");
            }
            
            if (e.getSource() == librasB){
                importeOut = importeIn*1.15;
                divisaOuTF.setText("libras");
            } else {
                importeOut = importeIn*0.9;
                divisaOuTF.setText("francos");
            } 
            importeOuTF.setText(""+importeOut);

        }      
        
    }

}
