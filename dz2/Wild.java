package dz2;

public class Wild extends Animals {
    private  String habitat;
    private  String date_of_location;


    public Wild(int height, int weight, String eye_color,String habitat, String date_of_location) {
        super(height, weight, eye_color);
        this.date_of_location=date_of_location;
        this.habitat=habitat;       
    }

    public String toString() {
        return String.format("height: %d,weight: %d,eye color: %s,habitat: %s,date_of_location: %s", 
        super.getHeight(),super.getWeight(),super.getEye_color(),this.habitat, this.date_of_location );
     }

    public String getHabitat(){
        return this.habitat;
    }
    public String getDate_of_location(){
        return this.date_of_location;
    }


}
