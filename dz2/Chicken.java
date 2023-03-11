package dz2;

public class Chicken  extends Bird{
    
    public Chicken() {
        super(1, 1, "red", 2);
        
    }
    public String toString() {
        return String.format("height: %d weight: %d eye color: %s\n", 
        super.getHeight(),super.getWeight(), super.getEye_color());
    }
    public void roar() {
        System.out.println("Курица:kykareky");
    }
    
    }
       
   

    

