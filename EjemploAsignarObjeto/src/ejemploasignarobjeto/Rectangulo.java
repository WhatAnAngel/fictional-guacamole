package ejemploasignarobjeto;

public class Rectangulo {
    
    private int width;
    private int height;

    public Rectangulo(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangulo() {
        this.width = 0;
        this.height = 0;
    }
        
    public Rectangulo (int side) {
        this.width = side;
        this.height = side;
    }
    
    //Constructor de copia
    
       public Rectangulo (Rectangulo r){
          this.width = r.getWidth();
          this.height = r.getHeight();
       }

    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Width =" + width + ", Height =" + height + '}';
    }
    
    public void makeWider() {
        this.width++;
    }
    
    public void makeTaller() {
     this.height++;
 } 
    
    
    
    
    
    
    

}
