package dz2;

public class Cat extends HomePet {
private String wool;
    public Cat(String wool) {
        super(12, 12, "blue", "Cat"," yes", "yes"," red", "yes");
        this.wool="red";
    }

 public String toString() {
    return String.format("height:%d weight:%d eye color: %s nickname:%s"+
    " breed:%s vaccinations: %s coat_color:%s date_of_birth:%s wool:%s\n", 
    super.getHeight(), super.getWeight(), super.getEye_color(),
    super.getNickname(), super.getBreed(), super.getVaccination(),
    super.getCoat_color(), super.getDate_of_birth(), this.wool);
    
}
public void roar() {
    System.out.println("Кошка:may");
    
 }

}




