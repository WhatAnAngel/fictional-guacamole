package simulacroproact3;

import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {

    //Atributos
    JPanel miPanel;
    JLabel lluviosoT;
    JTextField litrosTF;
    JButton comprobarB, limpiarB, salirB;
    String lluvioso;
    Double litros;
    
    public Formulario() {
        
        //Propiedades del formulario
        this.setTitle("Actividad 3 Simulacro PRO");
        this.setSize(400, 300);
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
        comprobarB.setBounds(125, 125, 150, 40);
        miPanel.add(comprobarB);
        comprobarB.addActionListener(this);
        
        limpiarB = new JButton("Limpiar");
        limpiarB.setBounds(50, 200, 100, 30);
        miPanel.add(limpiarB);
        limpiarB.addActionListener(this);
        
        salirB = new JButton("Salir");
        salirB.setBounds(250, 200, 100, 30);
        miPanel.add(salirB);
        salirB.addActionListener(this);
        
        //Añadimos el panel
        add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == salirB) {            
            System.exit(0);           
        } else if (e.getSource() == limpiarB) {
            lluviosoT.setText("Introduzca litros de agua recogidos:");
            litrosTF.setText("");
        } else if (e.getSource() == comprobarB) {
            try {
                litros = Double.parseDouble(litrosTF.getText());
                lluvioso = (litros > 0) ? "LLUVIOSO" : "NO LLUVIOSO";
                lluviosoT.setText(lluvioso);
            } catch (NumberFormatException ex){
                lluviosoT.setText("Valor introducido incorrecto. Introduzca litros:");
            }
            
        }
        
    }

}
