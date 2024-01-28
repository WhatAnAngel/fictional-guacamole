package emotions;

public class Sad {

    private boolean sad;
    
    public Sad(){
        this.sad = sad;
    }
    
    public void setSad(boolean sad){
        this.sad = sad;
    }
    
    public boolean getSad(){
        return this.sad;
    }
    
    public void stop(){
        this.sad = false;
        System.out.println("You are no longer sad");
    }
}
