package dz2;

public abstract class Bird extends Animals{
    private int flyingHeight;
    
    public Bird(int height, int weight, String eye_color,int flyingHeight ) {
        super(height, weight, eye_color);
        this.flyingHeight=flyingHeight;
        
    }
    public String toString() {
        return String.format("height: %d  weight: %d  eye color: %s\n", 
        super.getHeight(), super.getWeight(), super.getEye_color());
     }

     public int getFlyingHeight() {
        return this.flyingHeight;
    }

    public void flying() {
        System.out.println("Я лечу на высоте " + this.flyingHeight + " метров");
    }


     }



     

