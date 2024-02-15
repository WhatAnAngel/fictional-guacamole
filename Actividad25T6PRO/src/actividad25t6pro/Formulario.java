package actividad25t6pro;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

    JPanel miPanel;
    JLabel tituloT, codigoT;
    JTextField codigoTF;
    JTextArea resultadoTA;
    JButton calcularB, salirB, limpiarB;
    Viaje[] misViajes;

    public Formulario(Viaje[] misViajes) {
        this.misViajes = misViajes;
        // Propiedades del formulario 

        this.setTitle("Localizador de viajes");

        this.setSize(455, 355);

        this.setResizable(false);

        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos el panel
        miPanel = new JPanel();

        miPanel.setLayout(
                null);

        //JLABELS
        tituloT = new JLabel("Introduzca el código de viaje: ");

        tituloT.setBounds(
                50, 20, 350, 20);
        miPanel.add(tituloT);

        codigoT = new JLabel("Código: ");

        codigoT.setBounds(
                50, 60, 350, 30);
        miPanel.add(codigoT);

        //TEXTFIELD
        codigoTF = new JTextField();

        codigoTF.setBounds(
                120, 60, 285, 30);
        miPanel.add(codigoTF);

        //TEXTAREA
        resultadoTA = new JTextArea();

        resultadoTA.setBounds(46, 110, 360, 115);
        resultadoTA.setMargin(new Insets(10, 10, 10, 10));
        resultadoTA.setLineWrap(true); //Esto es meramente estético
        resultadoTA.setWrapStyleWord(true);
        resultadoTA.setFocusable(false);
        miPanel.add(resultadoTA);

        //BUTTONS
        calcularB = new JButton("Buscar");

        calcularB.setBounds(175, 230, 100, 40);
        miPanel.add(calcularB);

        calcularB.addActionListener(this);

        salirB = new JButton("Salir");

        salirB.setBounds(
                310, 275, 100, 30);
        miPanel.add(salirB);

        salirB.addActionListener(this);

        limpiarB = new JButton("Limpiar");

        limpiarB.setBounds(45, 275, 100, 30);
        miPanel.add(limpiarB);

        limpiarB.addActionListener(this);

        // Añadimos el panel al JFrame
        add(miPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codViaje;
        String codIntroducido = codigoTF.getText();
        Boolean viajeEncontrado = false;

        if (e.getSource() == salirB) {

            System.exit(0);

        } else if (e.getSource() == limpiarB) {

            codigoTF.setText(""); //Limpiar todos los campos
            resultadoTA.setText("");

        } else if (e.getSource() == calcularB) {

            for (Viaje misViaje : misViajes) {
                codViaje = misViaje.getCodigo();
                if (codViaje.equals(codIntroducido)) {
                    resultadoTA.setText(misViaje.toString());
                    viajeEncontrado = true;
                }
            }
            if (!viajeEncontrado) {
                resultadoTA.setText("Viaje no encontrado");
            }
        }

    }

}
