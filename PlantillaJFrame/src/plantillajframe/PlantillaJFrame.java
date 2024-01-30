package plantillajframe;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlantillaJFrame extends JFrame{
    //Todos los números son ejemplos!!
    JPanel miPanel;
    JLabel mensajeT;
    public PlantillaJFrame(){
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
        mensajeT = new JLabel("Hola, mundo!");
        
        //.setBounds(x, y, ancho, alto) para posicionar y dar tamaño al control
        mensajeT.setBounds(10, 40, 120, 30);
        miPanel.add(mensajeT);
        
        //Volcar el panel al formulario
        this.add(miPanel);
    }
    
}
