package dz2;

public class Tiger extends Wild{

    public Tiger() {
        super(33, 3, "red", "yes", "150 days ago");
        
    }
    public String toString() {
        return String.format("height: %d weight: %d eye color: %s habitat: %s date_of_location: %s\n", 
        super.getHeight(),super.getWeight(),super.getEye_color(),super.getHabitat(), super.getDate_of_location());
     }
     public void roar() {
        System.out.println("Тигр:grrrr");
     }
}
