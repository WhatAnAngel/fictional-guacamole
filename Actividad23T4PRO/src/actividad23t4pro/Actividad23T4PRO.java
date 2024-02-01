package actividad23t4pro;


public class Actividad23T4PRO {

    public static void main(String[] args) {
        
        Libro miLibro = new Libro(111, "Luna de Plutón", 2015);
        System.out.println(miLibro.Prestado());
        miLibro.Prestar();
        System.out.println(miLibro.Prestado());
        miLibro.Devolver();
        System.out.println(miLibro.Prestado());
        System.out.println(miLibro);

    }
    
}
