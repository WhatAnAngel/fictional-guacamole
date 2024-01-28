package ejemplowrappers;

public class EjemploWrappers {

    public static void main(String[] args) {

        //Crear un wrapper u objeto contenedor
        Integer valor = new Integer(25);
        Integer cantidad = new Integer("8");
        Double dato = 56.3;

        //Ejemplo de conversión de String s int o double 
        // ParseInt() o parseDouble()
        int edad = Integer.parseInt("28");
        double sueldo = Double.parseDouble("1674.78");
        
        int numero = Integer.parseInt("1000101", 2);
        System.out.println("Conversion a Binario: " + numero);
        
        int numero1 = Integer.parseInt("fa", 16);
        System.out.println("Conversion a Hexadecimal: " + numero1);
        
        int numero2 = Integer.parseInt("6370", 8);
        System.out.println("Conversion de Octal: " + numero2); 
        
        //Crear Wrapper a partir de un String con valueOf() 
        Integer dato1 = Integer.valueOf("45");
        
        //Integer dato1 = new Integer ("45")
        Integer dato2 = Integer.valueOf("1001", 2);
        System.out.println("Dato 2: " + dato2);
        
        //Convertir wrapper en dato primitivo
        //Integer --> int
        Integer valor1 = 20;
        int valor2 = valor1.intValue();
        
        //Double --> double
        Double valor3 = 57.8;
        double valor4 = valor3.doubleValue();
        
        //Convertir Wrapper en String (.toString())
        Double nota = new Double ("5.67");
        String notaT = nota.toString();
        
        //Convertir entero en base 10 en cualquier base .toXXXXString()
        String conBinario = Integer.toBinaryString(145);
        System.out.println("145 en binario: " + conBinario);
        
        String conOctal = Integer.toOctalString(9909);
        System.out.println("9909 en Octal: " + conOctal);
        
        String conHexa = Integer.toHexString(42069);
        System.out.println("42069 en Hexadecimal: " + conHexa);
    }

}
