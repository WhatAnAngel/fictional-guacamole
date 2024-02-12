package actividad24t6pro;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

    JPanel miPanel;
    JLabel tituloT, nombreT, notaTeoriaT, notaPracticaT;
    JTextField nombreTF, notaTeoriaTF, notaPracticaTF;
    JTextArea resultadoTA;
    JButton calcularB, salirB, limpiarB;
    double notaT, notaP, notaFinal = 0;
    Boolean aprobado;
    String nombreAlumno, mensaje;

    public Formulario() {

        // Propiedades del formulario
        this.setTitle("Calcular nota");
        this.setSize(455, 355);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Creamos el panel
        miPanel = new JPanel();
        miPanel.setLayout(null);
        
        //Creamos los controles de la interface

        // LABELS
        tituloT = new JLabel("Introduzca los datos del alumno/a:");
        tituloT.setBounds(50, 20, 350, 20);
        miPanel.add(tituloT);

        nombreT = new JLabel("Nombre:");
        nombreT.setBounds(50, 60, 100, 30);
        miPanel.add(nombreT);

        notaTeoriaT = new JLabel("Nota Teoría:");
        notaTeoriaT.setBounds(50, 100, 100, 30);
        miPanel.add(notaTeoriaT);

        notaPracticaT = new JLabel("Nota Práctica:");
        notaPracticaT.setBounds(230, 100, 100, 30);
        miPanel.add(notaPracticaT);

        // TEXTFIELDS
        nombreTF = new JTextField();
        nombreTF.setBounds(120, 60, 285, 30);
        miPanel.add(nombreTF);

        notaTeoriaTF = new JTextField();
        notaTeoriaTF.setBounds(135, 100, 80, 30);
        miPanel.add(notaTeoriaTF);

        notaPracticaTF = new JTextField();
        notaPracticaTF.setBounds(325, 100, 80, 30);
        miPanel.add(notaPracticaTF);

        // TEXTAREA
        resultadoTA = new JTextArea();
        resultadoTA.setBounds(46, 145, 360, 70);
        resultadoTA.setMargin(new Insets(10, 10, 10, 10));
        resultadoTA.setLineWrap(true); //Esto es meramente estético
        resultadoTA.setWrapStyleWord(true);
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

        //Esto es para que no dé 200 decimales
        DecimalFormat df = new DecimalFormat("#.##");

        if (e.getSource() == salirB) {

            System.exit(0); //Salir del programa   

        } else if (e.getSource() == limpiarB) {

            tituloT.setText("Introduzca los datos del alumno/a:");
            nombreTF.setText(""); //Limpiar todos los campos
            resultadoTA.setText("");
            notaTeoriaTF.setText("");
            notaPracticaTF.setText("");

        } else {

            //Comprobamos que los datos introducidos sean del tipo esperado
            try {

                nombreAlumno = nombreTF.getText();

                //Parseamos los datos introducidos para las notas a Double
                notaT = Double.parseDouble(notaTeoriaTF.getText()) * 0.2;
                notaP = Double.parseDouble(notaPracticaTF.getText()) * 0.8;

                notaFinal = notaT + notaP;

                aprobado = (notaFinal >= 5);

                String aprobadoSuspendido = aprobado ? "APROBADO" : "SUSPENDIDO";

                resultadoTA.setText(
                        "El alumno/a " + nombreAlumno
                        + " ha obtenido una nota media final de "
                        + df.format(notaFinal)
                        + "\nPor lo tanto, ha " + aprobadoSuspendido);

                tituloT.setText(aprobadoSuspendido);

            } catch (NumberFormatException ex) {
                tituloT.setText("Valor introducido incorrecto. Vuelva a intentarlo.");
                resultadoTA.setText(":(");
            }

        }
    }
}
