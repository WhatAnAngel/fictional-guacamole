package actividad2t3ede;

public class ParImpar {
    
    public boolean esPar(int num){
        boolean par = num%2==0;
        return par;
    }
    
    public boolean esImpar(int num){
        boolean impar = num%2!=0;
        return impar;
    }

    public boolean esCero(int num){
        boolean cero = (num==0);
        return cero;
    }
}
