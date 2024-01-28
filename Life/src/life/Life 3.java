package life;
import emotions.Sad;

public class Life {

    public static void main(String[] args) {

        Sad sad = new Sad();
        
        sad.setSad(true);
        
        System.out.println("Sad: " + sad.getSad());
        
        if(sad.getSad() == true) {
        sad.stop();
        }
        
        System.out.println("Sad: " + sad.getSad());
        
       
    }

}
