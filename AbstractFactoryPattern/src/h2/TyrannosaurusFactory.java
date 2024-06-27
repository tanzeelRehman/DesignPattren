package h2;

public class TyrannosaurusFactory implements SpecieFactory {
    @Override
    public Mammal createMammal() {
        return null;
    }

    @Override
    public Reptile createReptile() {
        return new Tyrannosaurus();
    }
}
