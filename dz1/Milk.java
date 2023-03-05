package dz1;

public class Milk extends Products2 {
    private int fat;

    public Milk(int fat) {
        super("Milk", 12, 2, 23);
        this.fat = 12;

    }

    public String toString() {
        return String.format("Name: %s, count: %d, measurment: %d, expiration: %s, fat proc: %s",
                super.getName(), super.getCount(), super.getMeasurment(), super.getexpiration(), this.fat);
    }
}
