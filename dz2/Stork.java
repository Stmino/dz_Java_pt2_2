package dz2;

public class Stork extends Bird{

    public Stork() {
        super(12, 12, "black", 12);
        
    }
    public String toString() {
        return String.format("height: %d  weight: %d  eye color: %s\n", 
        super.getHeight(),super.getWeight(), super.getEye_color());
    }
    public void roar() {
        System.out.println("Аист:tuck tuck");
    }
}
