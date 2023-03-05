package dz1;

public class Bread extends Products2 {
    private String flour_type;

    public Bread(String flour_type) {
        super("Bread", 12, 23, 34);
        this.flour_type = "millet";

    }

    public String toString() {
        return String.format("Name: %s, count: %d, measurment: %d, expiration: %s, flour type: %s",
                super.getName(), super.getCount(), super.getMeasurment(), super.getexpiration(), this.flour_type);
    }

}