package actividad16t3;

public class Actividad16T3 {

    public static void main(String[] args) {
        Libro libroInformatica1 = new Libro("Programacion facil", "Luis Losan", 
                "Planeta", 7, 2);
        System.out.println("Título: " + libroInformatica1.getTitulo());
        libroInformatica1.setEditorial("Anaya");
        libroInformatica1.prestado();
        System.out.println("Prestados: " + libroInformatica1.getPrestados());
        libroInformatica1.devolver();
        System.out.println("Prestados: " + libroInformatica1.getPrestados());
        libroInformatica1.perdido();
        System.out.println("Ejemplares: " + libroInformatica1.getEjemplares());
        System.out.println(libroInformatica1.mostrarDatos());
       
    }
}
