package h2;

public class CatFactory implements SpecieFactory {
    @Override
    public Mammal createMammal() {
        return new Cat();
    }

    @Override
    public Reptile createReptile() {
        return null;
    }
}
