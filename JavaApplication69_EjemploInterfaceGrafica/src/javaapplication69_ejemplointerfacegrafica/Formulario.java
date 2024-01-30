package javaapplication69_ejemplointerfacegrafica;

import javax.swing.*;

public class Formulario extends JFrame{
    //Todos los números son ejemplos!!
    JPanel miPanel;
    JLabel nombreT, mensajeT;
    JTextField nombreTF;
    JButton enviarB, salirB;
    public Formulario(){
        // Propiedades del formulario
        this.setTitle("Ejemplo formulario");
        this.setSize(400, 200); //Ancho y alto en píxeles
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Creamos el panel
        miPanel = new JPanel();
        miPanel.setLayout(null);
        
        //Creamos los controles de la interface
        nombreT = new JLabel();
        nombreT.setText("Nombre: ");//Introducir texto en el JLabel()
        
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        nombreT.setBounds(20, 40, 120, 30);
        miPanel.add(nombreT);
        
        nombreTF=new JTextField();
        nombreTF.setBounds(80, 40, 120, 30);
        miPanel.add(nombreTF);
        
        enviarB = new JButton("Enviar");
        enviarB.setBounds(210, 40, 100, 29);
        miPanel.add(enviarB);
        
        mensajeT = new JLabel("¡Hola!");
        mensajeT.setBounds(20, 80, 150, 30);
        miPanel.add(mensajeT);
        
        //JButton Salir
        salirB = new JButton("Salir");
        salirB.setBounds(20, 120, 100, 29);
        miPanel.add(salirB);
        
        //Volcar el panel al formulario
        this.add(miPanel);
    }
    
}
