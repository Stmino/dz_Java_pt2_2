package dz1;

public class Children extends Products_main {
    private  int min_age;
    private Boolean hypoallergenic;


    public Children(String name, int count, int measurement,int min_age,Boolean hypoallergenic) {
    super(name, count, measurement);
    this.min_age=min_age;
    this.hypoallergenic=hypoallergenic;
    }
    public String toString() {
      return String.format("Name: %s, count: %d, measurment: %d, min_age: %d,hypoallergenic: %b",
      super.getName(),super.getCount(),super.getMeasurment(), this.min_age, this.hypoallergenic);
   }

   }
