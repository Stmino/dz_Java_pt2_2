package dz1;

public class Products2 extends Products_main {
   private int expiration;

   public Products2(String name, int count, int measurement, int expiration) {
      super(name, count, measurement);
      this.expiration = expiration;
   }

   public String toString() {
      return String.format("Name: %s, count: %d, measurment: %d, expiration: %s", 
      super.getName(), super.getCount(),super.getMeasurment(), this.expiration);
   }

   public int getexpiration() {
      return this.expiration;
   }
}
