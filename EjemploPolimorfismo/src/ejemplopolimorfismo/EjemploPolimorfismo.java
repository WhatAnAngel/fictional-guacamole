package ejemplopolimorfismo;


public class EjemploPolimorfismo {

    public static void main(String[] args) {

        Persona encargadoCarniceria = new Encargado(null, 0, "Rosa Ramos");
        Encargado miEncargado = (Encargado) encargadoCarniceria;
        miEncargado.setSueldoBase(1500);
        miEncargado.setSeccion("Carniceria");
        
        System.out.println(encargadoCarniceria);
    }

}
