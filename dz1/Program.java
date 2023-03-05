package dz1;

public class Program {
    public static void main(String[] args) {
        Milk milk = new Milk(0);
        Bread bread = new Bread(null);
        Limonade limonade = new Limonade();
        Eggs eggs = new Eggs();
        Mask mask = new Mask();
        Toilet_paper toilet_paper = new Toilet_paper(0);
        Diapers diapers = new Diapers(0, 0, 0, null);
        Nipple nipple = new Nipple();
        Print(nipple);
        Print(diapers);
        Print(toilet_paper);
        Print(mask);
        Print(eggs);
        Print(bread);
        Print(limonade);
        Print(milk);
    }

    public static void Print(Object i) {
        System.out.println(i);
    }

}
