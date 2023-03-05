
package dz1;

public class Products_main {
   private String name;
   private int count;
   private int measurement;

   public Products_main(String name, int count, int measurement) {

      this.name = name;
      this.count = count;
      this.measurement = measurement;
   }

   public String toString() {
      return String.format("Name: %s, count: %d, measurment: %d", this.name, this.count, this.measurement);
   }

   public String getName() {
      return this.name;
   }

   public int getCount() {
      return this.count;
   }

   public int getMeasurment() {
      return this.measurement;
   }
}
