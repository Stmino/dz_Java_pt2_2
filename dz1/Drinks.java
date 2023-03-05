package dz1;

public class Drinks extends Products_main {
   private int volume;

   public Drinks(String name, int count, int measurement, int volume) {
      super(name, count, measurement);
      this.volume = volume;
   }

   public String toString() {
      return String.format("Name: %s, Count: %d, Measurment: %d, volume: %s",
            super.getName(), super.getCount(), super.getMeasurment(), this.volume);
   }

   public int getvolume() {
      return this.volume;
   }

}
