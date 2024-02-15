package simulacroproact3;

import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {

    //Atributos
    JPanel miPanel;
    JLabel lluviosoT;
    JTextField litrosTF;
    JButton comprobarB, limpiarB, salirB;
    Boolean lluvioso;
    Double litros;
    
    public Formulario() {
        
        //Propiedades del formulario
        this.setTitle("Actividad 3 Simulacro PRO");
        this.setSize(400, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Creamos el panel
        JPanel miPanel = new JPanel();
        miPanel.setLayout(null);
        
        //Creamos los controles
        
        //JLabel
        lluviosoT = new JLabel("Introduzca litros de agua recogidos:");
        lluviosoT.setBounds(50, 25, 300, 30);
        miPanel.add(lluviosoT);
        
        //JTextField
        litrosTF = new JTextField();
        litrosTF.setBounds(50, 75, 300, 30);
        miPanel.add(litrosTF);
        
        //JButton
        comprobarB = new JButton("Comprobar");
        comprobarB.setBounds(125, 125, 150, 30);
        miPanel.add(comprobarB);
        
        //Añadimos el panel
        add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
