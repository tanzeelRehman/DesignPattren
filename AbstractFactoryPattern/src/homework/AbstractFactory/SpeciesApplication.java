package homework.AbstractFactory;

import homework.AbstractModel.Species;

public class SpeciesApplication {
    Species num1;
    Species num2;

    public SpeciesApplication(SpeciesFactory factory) {
        num1 = factory.createSpecies1();
        num2 = factory.createSpecies2();
    }

    private void printSpeciesInfo(Species species) {
        species.name();
        species.sound();
    }

    public void speciesInfo() {
        printSpeciesInfo(num1);
        printSpeciesInfo(num2);
    }
}
