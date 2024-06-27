package homework.AbstractFactory;

import homework.AbstractModel.Cat;
import homework.AbstractModel.Dog;
import homework.AbstractModel.Species;

public class MammalFactory implements SpeciesFactory {


    @Override
    public Species createSpecies1() {
        return new Dog();
    }

    @Override
    public Species createSpecies2() {
        return new Cat();
    }
}
