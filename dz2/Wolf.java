package dz2;

public class Wolf extends Wild{
    private boolean leader;
    public Wolf(boolean leader) {
        super(123, 234, "white", "yes", "14 days ago");
        this.leader=false;
        
    }
    public String toString() {
        return String.format("height: %d weight: %d eye color: %s habitat: %s date_of_location: %s leader: %s \n", 
        super.getHeight(),super.getWeight(),super.getEye_color(),super.getHabitat(), super.getDate_of_location(),this.leader);
     }
     public void roar() {
        System.out.println("Волк: ayyyyf");
     }
    
}
