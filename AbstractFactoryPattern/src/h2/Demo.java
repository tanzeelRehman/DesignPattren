package h2;

public class Demo {
    public static void main(String[] args) {
        SpecieFactory factory;
        SpecieFactory factory1;
        Mammal mammal;
        Reptile reptile;
        factory = new DogFactory();
        factory1 = new TyrannosaurusFactory();
        mammal = factory.createMammal();
        mammal.makeSound();
        reptile = factory1.createReptile();
        reptile.makeSound();
    }
}
