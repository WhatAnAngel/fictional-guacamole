package actividad23t6pro;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {

    //Atributos
    JPanel miPanel;
    JLabel tituloT, nombreT, fechaNacimientoT;
    JTextField nombreTF, fechaNacimientoTF;
    JButton calcularB, salirB, limpiarB;
    JTextArea resultadoTA;

    public Formulario() {

        // Propiedades del formulario
        this.setTitle("Calcular edad");
        this.setSize(455, 355);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos el panel
        miPanel = new JPanel();
        miPanel.setLayout(null);

        // JLABELS
        tituloT = new JLabel("Nota: Introduzca la fecha en formato DD/MM/AAAA");
        tituloT.setBounds(50, 20, 350, 20);
        miPanel.add(tituloT);

        nombreT = new JLabel("Nombre:");
        nombreT.setBounds(50, 60, 100, 30);
        miPanel.add(nombreT);

        fechaNacimientoT = new JLabel("Fecha de nacimiento:");
        fechaNacimientoT.setBounds(50, 100, 200, 30);
        miPanel.add(fechaNacimientoT);

        // TEXTFIELDS
        nombreTF = new JTextField();
        nombreTF.setBounds(120, 60, 285, 30);
        miPanel.add(nombreTF);

        fechaNacimientoTF = new JTextField();
        fechaNacimientoTF.setBounds(190, 100, 215, 30);
        miPanel.add(fechaNacimientoTF);

        // TEXTAREA
        resultadoTA = new JTextArea();
        resultadoTA.setBounds(46, 145, 360, 70);
        resultadoTA.setMargin(new Insets(10, 10, 10, 10));
        resultadoTA.setLineWrap(true); //Esto es meramente estético
        resultadoTA.setWrapStyleWord(true);
        resultadoTA.setFocusable(false);
        miPanel.add(resultadoTA);

        // BUTTONS
        calcularB = new JButton("Calcular");
        calcularB.setBounds(170, 230, 100, 40);
        miPanel.add(calcularB);
        calcularB.addActionListener(this);

        salirB = new JButton("Salir");
        salirB.setBounds(310, 275, 100, 30);
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

        //Formato fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nombreAlumno;
        int edad;
        LocalDate fechaHoy = LocalDate.now();

        if (e.getSource() == salirB) {
            System.exit(0); //Salir del programa   
        } else if (e.getSource() == limpiarB) {
            tituloT.setText("Introduzca los datos del alumno/a:");
            nombreTF.setText(""); //Limpiar todos los campos
            fechaNacimientoTF.setText("");
            resultadoTA.setText("");
        } else {
            try {
                nombreAlumno = nombreTF.getText();
                LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoTF.getText(), formatter);
                edad = (int) (ChronoUnit.DAYS.between(fechaNacimiento, fechaHoy)) / 365;
                resultadoTA.setText("La edad del alumno/a " + nombreAlumno
                        + " es de: " + edad + " años.");
            } catch (DateTimeParseException ex) {
                tituloT.setText("Introduzca la fecha en formato DD/MM/AAAA");
                resultadoTA.setText("Se ha producido un error. "
                        + "Por favor, compruebe que el formato de la fecha introducida sea el siguiente: DD/MM/AAAA.");
            }
        }
    }
}
