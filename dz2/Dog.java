package dz2;

public class Dog extends HomePet{
    private boolean trainig;
    public Dog(String trainig) {
        super(13, 12, "blue", "Dog", "yes", "yes", "red", "180");
        this.trainig=true;
    }

    public String toString() {
        return String.format("height:%d weight:%d eye color: %s nickname:%s"+
        " breed:%s vaccinations: %s coat_color:%s date_of_birth:%s trainig:%s\n", 
        super.getHeight(), super.getWeight(), super.getEye_color(),
        super.getNickname(), super.getBreed(), super.getVaccination(),
        super.getCoat_color(), super.getDate_of_birth(), this.trainig);
        
    }
    public void roar() {
        System.out.println("Собака:gav");
        
     }
     public Boolean Tenderness() {
        return false;
     }
}
