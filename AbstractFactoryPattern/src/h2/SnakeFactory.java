package h2;

public class SnakeFactory implements SpecieFactory{
    @Override
    public Mammal createMammal() {
        return null;
    }

    @Override
    public Reptile createReptile() {
        return new Snake();
    }
}
