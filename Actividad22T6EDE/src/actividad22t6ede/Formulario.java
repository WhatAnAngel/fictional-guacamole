package actividad22t6ede;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{

    //Atributos
    JPanel miPanel;
    JLabel tituloT, importeInT, importeOuT;
    JTextField importeInTF, divisaInTF, importeOuTF, divisaOuTF;
    JButton eurosInB, eurosOuB, francosInB, francosOuB, librasInB, librasOuB;
    JButton calcularB, salirB, limpiarB;
    
    public Formulario() {

        // Propiedades del formulario
        this.setTitle("Convertidor de divisas");
        this.setSize(455, 380);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos el panel
        miPanel = new JPanel();
        miPanel.setLayout(null);

        // JLABELS
        tituloT = new JLabel("Intoduzca importe y seleccione divisa a convertir: ");
        tituloT.setBounds(50, 20, 350, 20);
        miPanel.add(tituloT);

        importeInT = new JLabel("Importe: ");
        importeInT.setBounds(50, 70, 100, 30);
        miPanel.add(importeInT);
        
        importeOuT = new JLabel("Cambio: ");
        importeOuT.setBounds(50, 170, 100, 30);
        miPanel.add(importeOuT);

        // TEXTFIELDS
        
        //Entrada
        importeInTF = new JTextField();
        importeInTF.setBounds(110, 70, 190, 30);
        miPanel.add(importeInTF);

        divisaInTF = new JTextField();
        divisaInTF.setBounds(310, 70, 90, 30);
        divisaInTF.setFocusable(false);
        miPanel.add(divisaInTF);
        
        //Salida
        importeOuTF = new JTextField();
        importeOuTF.setBounds(110, 170, 190, 30);
        importeOuTF.setFocusable(false);
        miPanel.add(importeOuTF);

        divisaOuTF = new JTextField();
        divisaOuTF.setBounds(310, 170, 90, 30);
        divisaOuTF.setFocusable(false);
        miPanel.add(divisaOuTF);

        // BUTTONS
        
        //Entrada
        eurosInB = new JButton("Euros");
        eurosInB.setBounds(45, 120, 90, 30);
        miPanel.add(eurosInB);
        eurosInB.addActionListener(this);
        
        francosInB = new JButton("Franco");
        francosInB.setBounds(180, 120, 90, 30);
        miPanel.add(francosInB);
        francosInB.addActionListener(this);
        
        librasInB = new JButton("Libras");
        librasInB.setBounds(315, 120, 90, 30);
        miPanel.add(librasInB);
        librasInB.addActionListener(this);
        
        //Salida
        eurosOuB = new JButton("Euros");
        eurosOuB.setBounds(45, 220, 90, 30);
        miPanel.add(eurosOuB);
        eurosOuB.addActionListener(this);
        
        francosOuB = new JButton("Franco");
        francosOuB.setBounds(180, 220, 90, 30);
        miPanel.add(francosOuB);
        francosOuB.addActionListener(this);
        
        librasOuB = new JButton("Libras");
        librasOuB.setBounds(315, 220, 90, 30);
        miPanel.add(librasOuB);
        librasOuB.addActionListener(this); 
  
        //Limpiar y cerrar
        salirB = new JButton("Salir");
        salirB.setBounds(305, 290, 100, 30);
        miPanel.add(salirB);
        salirB.addActionListener(this);

        limpiarB = new JButton("Limpiar");
        limpiarB.setBounds(45, 290, 100, 30);
        miPanel.add(limpiarB);
        limpiarB.addActionListener(this);

        // Añadimos el panel al JFrame
        add(miPanel);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String divisaIn = "", divisaOut = "";
        double importeIn = 0, importeOut = 0;
        
        if (e.getSource() == salirB) {
            System.exit(0); //Salir del programa   
        } else if (e.getSource() == limpiarB) {
            tituloT.setText("Intoduzca importe y seleccione divisa a convertir:");
            importeInTF.setText(""); //Limpiar todos los campos
            importeOuTF.setText("");
            divisaInTF.setText("");
            divisaOuTF.setText("");
            divisaIn = "";
            divisaOut = "";
        } else {
            
            try{
                importeIn = Double.parseDouble(importeInTF.getText());
            }catch(NumberFormatException ex){
                tituloT.setText("Valor introducido incorrecto");
            }
            
            if (e.getSource() == eurosInB){
                divisaIn = "euros";
            } else if (e.getSource() == librasInB){
                divisaIn = "libras";
            } else if (e.getSource() == francosInB){
                divisaIn = "francos";
            }
            divisaInTF.setText(divisaIn);
            
            if (e.getSource() == eurosOuB){
                divisaOut = "euros";
            } else if (e.getSource() == librasOuB){
                divisaOut = "libras";
            } else if (e.getSource() == francosOuB){
                divisaOut = "francos";
            }
            divisaOuTF.setText(divisaOut);
            
            if (divisaIn == "euros"){
                if (divisaOut == "libras"){
                    importeOut = 1.15;
                }else if (divisaOut == "francos"){
                    importeOut = 0.9;
                } else { 
                    importeOut = 1;
                } 
            } 
            importeOut*=importeIn;
            importeOuTF.setText(""+importeOut);
        }
        
        
        
        
    }

}
