package actividad18t7pro;


public class Actividad18T7PRO {

    public static void main(String[] args) {
        
        //            Numero, precio
        double A[][] = {
                        {1, 5},
                        {2, 5.5},
                        {3, 6},
                        {4, 6.25},
                        {5, 7.5},
                        {6, 8.75},
                        {7, 9.05},
                        {8, 10.10},
                        {9, 11.5},
                        {10, 12.10}
        };
        
        //            Numero, cantidad
        double B[][] = {
                        {1, 5},
                        {2, 10},
                        {4, 15},
                        {5, 12},
                        {10, 50}
        };
        
        Object[][] factura = new Object[B.length][4];
        int i = 0;
        double total = 0;
        
        for (double[] datoB:B){
            for (double[] datoA:A){
                if (datoA[0] == datoB[0]){
                    int numeroProducto = (int) datoB[0];
                    int cantidad = (int) datoB[1];
                    double precio = datoA[1];
                    double importe = precio * cantidad;
                    
                    factura[i][0] = numeroProducto;
                    factura[i][1] = cantidad;
                    factura[i][2] = precio + "€";
                    factura[i][3] = importe + "€";
                    total+=importe;
                    i++;
                }
            }
        }
        
        System.out.println("Numero Cantidad Precio Importe");
        for (Object[] dato : factura) {
            for (int j = 0; j < dato.length; j++) {
                System.out.print(dato[j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("TOTAL: ............... " + total + "€");
        
    }

}
