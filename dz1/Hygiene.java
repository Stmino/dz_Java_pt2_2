package dz1;

public class Hygiene extends Products_main {
   private int count_1;

   public Hygiene(String name, int count, int measurement, int count_1) {
      super(name, count, measurement);
      this.count_1 = count_1;
   }

   public String toString() {
      return String.format("Name: %s, count: %d, measurment: %d, count_1: %s",
            super.getName(), super.getCount(), super.getMeasurment(), this.count_1);
   }

   public int getcount_1() {
      return this.count_1;
   }
}
