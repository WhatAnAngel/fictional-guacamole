package numeropar;

public class NumeroPar {
    public static void main(String[] args) {
        int num = 0;
        int par = 0;
        
        for (int i = 1; i < 5; i++) {
            num = (int) (Math.random()*10)+1;
                if (num%2==0) {
                    par++;
                }
            }
        if (par!=0) {
            System.out.println("Hay algún número par");
        } else {
            System.out.println("No hay ningún número par");
        }
        
        }
        
                
    
}
