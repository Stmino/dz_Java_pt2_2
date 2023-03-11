package dz2;


public class Progr {
    public static void main(String[] args) {

Animals[] animals = {new Cat(null), new Dog(null), new Tiger(), 
                  new Wolf(false), new Chicken(), new Stork()};
        for(Animals animal :animals)
            PrintInfo(animal);     
    }

    private static void PrintInfo(Animals animals){
        System.out.println(animals);
        
        

}
}