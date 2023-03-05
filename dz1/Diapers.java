package dz1;

public class Diapers extends Hygiene {
    private int size;
    private int min_size;
    private int max_size;
    private String type;

    public Diapers(int size, int max_size, int min_size, String type) {
        super("Diapers", 12, 12, 12);
        this.size = 12;
        this.max_size = 111;
        this.min_size = 1;
        this.type = "Large";
    }

    public String toString() {
        return String.format(
                "Name: %s, count: %d, measurment: %d, count_1: %s, size: %s, max size: %s,min size: %s, type: %s ",
                super.getName(), super.getCount(), super.getMeasurment(), super.getcount_1(), this.size, this.max_size,
                this.min_size, this.type);
    }

}
