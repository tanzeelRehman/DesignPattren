package homework.AbstractFactory;

import homework.AbstractModel.Snake;
import homework.AbstractModel.Species;
import homework.AbstractModel.Tyrannosaurus;

public class ReptileFactory implements SpeciesFactory {


    @Override
    public Species createSpecies1() {
        return new Snake();
    }

    @Override
    public Species createSpecies2() {
        return new Tyrannosaurus();
    }
}
