package dz2;

public class Animals {
    private int height;
    private int weight;
    private String eye_color; 

public Animals(int height, int weight , String eye_color) {
    this.height= height;
    this.weight =weight;
    this.eye_color = eye_color;
 
}


public String toString() {
    return String.format("height: %d, weight: %d, eye color: %s", this.height, this.weight, this.eye_color);
 }
 public void roar() {
    System.out.println("");
    
 }

  public int getHeight() {
   return this.height;
  
  }
  public int getWeight() {
   return this.weight;
   
  }
  public String getEye_color() {
   return this.eye_color;
   
  }

 }