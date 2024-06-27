package homework;

import homework.AbstractFactory.MammalFactory;
import homework.AbstractFactory.ReptileFactory;
import homework.AbstractFactory.SpeciesApplication;
import homework.AbstractFactory.SpeciesFactory;

import java.util.Scanner;


public class SpeciesFactoryDemo {
    private static SpeciesApplication configureSpecies() {
        SpeciesApplication application;
        SpeciesFactory factory;
        int speciesMenu;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter 1 or 2  For Mammal or Reptile Species respectively.");
            speciesMenu = Math.abs(input.nextInt());
        } while (speciesMenu > 2 || speciesMenu < 1);
        if (speciesMenu == 1) {
            factory = new MammalFactory();
        } else {
            factory = new ReptileFactory();
        }
        application = new SpeciesApplication(factory);
        return application;
    }

    public static void main(String[] args) {
        SpeciesApplication app = configureSpecies();
        app.speciesInfo();

    }
}
