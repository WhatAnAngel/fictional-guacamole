package actividad7t4pro;

public class Probabilidad {

    //Array de Strings con dos elementos, en el índice 0 "bola negra" y en el índice 1 "bola roja"
    private String[] bolsa = {"Bola negra", "Bola roja"};
    
    public void calculaProbabilidad(){
        
        //atributos del método 
        int i;
        int extracciones = 15;
        String bola;
        double bolaNegra = 0;
        double porcentajeNegra = 0;
        double porcentajeRoja = 0;
        
        //operación que realiza el método
        for(i = 0; i <= extracciones; i++){
            
            bola = bolsa[(int) (Math.random() * bolsa.length)];
            if (bola.equals(bolsa[0])){
                bolaNegra++;
            }
        }
        
        porcentajeNegra = (bolaNegra / extracciones) * 100;
        porcentajeRoja = 100 - porcentajeNegra;
        
        System.out.println("Porcentaje de bolas negras extraídas: " + porcentajeNegra);
        System.out.println("Porcentaje de bolas rojas extraídas: " + porcentajeRoja);
    }
    
}
