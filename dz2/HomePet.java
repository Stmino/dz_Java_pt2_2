package dz2;

public class HomePet extends Animals {
private String nickname;
private String breed;
private String vaccinations;
private String coat_color;
private String date_of_birth;


    public HomePet(int height, int weight, String eye_color,String nickname,
    String breed,String vaccinations,String coat_color,String date_of_birth
    ) {
        super(height, weight, eye_color);
        this.nickname= nickname;
        this.breed=breed;
        this.vaccinations=vaccinations;
        this.coat_color=coat_color;
        this.date_of_birth=date_of_birth;
        
       
    }
    public String toString() {
        return String.format("height: %d,\nweight: %d,\neye color: %s,\nnickname: %s,"+
        "\nbreed: %s,\nvaccinations: %s,\ncoat_color: %s,\ndate_of_birth: %s", 
        super.getHeight(), super.getWeight(), super.getEye_color(),
        this.nickname, this.breed, this.vaccinations,
        this.coat_color, this.date_of_birth);
     }

    public String getBreed() {
        return this.breed;
     }
    public String getVaccination() {
        return this.vaccinations;
     }
    public String getCoat_color() {
        return this.coat_color;
     }
    public String getDate_of_birth() {
        return this.date_of_birth;
     }
    
    public String getNickname() {
        return this.nickname;
     }
     public Boolean Tenderness() {
        return true;
    } 
     
  }




