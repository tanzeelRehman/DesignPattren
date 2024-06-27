package h2;

public class DogFactory implements SpecieFactory {
    @Override
    public Mammal createMammal() {
        return new Dog();
    }

    @Override
    public Reptile createReptile() {
        return null;
    }
}
