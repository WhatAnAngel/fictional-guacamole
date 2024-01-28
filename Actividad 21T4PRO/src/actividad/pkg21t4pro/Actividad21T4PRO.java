package actividad.pkg21t4pro;


public class Actividad21T4PRO {

    public static void main(String[] args) {
        
        Empleado miEmpleado = new Empleado (1, 2, "Luis", "Sanz Solís", 0, true, 1800);
        double sueldoFinal = miEmpleado.getSueldo() - miEmpleado.calculaRetencion() + miEmpleado.calculaPlus();
        
        System.out.println(miEmpleado);
        System.out.println("La retención es de " + miEmpleado.calculaRetencion() + "€");
        System.out.println("El sueldo final es de " + sueldoFinal + "€");

    }

}
