package actividad15t3;

public class Actividad15T3 {

    public static void main(String[] args) {
     
    Cuenta cuentaParticular1 = new Cuenta("Mario");
    Cuenta cuentaEmpresa1 = new Cuenta("Aula Campus", 500);
    
        System.out.println(cuentaParticular1.getTitular());
        System.out.println(cuentaEmpresa1.getCantidad());
        
        cuentaParticular1.ingresar(1000);
        cuentaEmpresa1.retirar(500);
        
        System.out.println(cuentaParticular1.mostrarDatos());
        System.out.println(cuentaEmpresa1.mostrarDatos());
    }
    
}
