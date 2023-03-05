package dz1;

public class Toilet_paper extends Hygiene {
    private  int number_of_layers;
    
    public Toilet_paper(int number_of_layers) {
    super("Toilet paper", 1, 1, 1);
    this.number_of_layers = 12;
    }
    public String toString() {
      return String.format("Name: %s, count: %d, measurment: %d, count_1: %s, number_of_layers: %d" ,
      super.getName(),super.getCount(),super.getMeasurment(),super.getcount_1(), this.number_of_layers);
   }
 
   }
