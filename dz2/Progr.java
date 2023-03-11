package dz2;


public class Progr {
    public static void main(String[] args) {
    Cat cat=  new Cat(null);
    cat.roar();

Animals[] animals = {new Cat(null), new Dog(null), new Tiger(), 
                  new Wolf(false), new Chicken(), new Stork()};
        for(Animals animal :animals)
                PrintInfo(animal);
        for(Animals animal :animals)
                animal.roar();            
    }

    private static void PrintInfo(Animals animal){
        System.out.println(animal);            

}
}