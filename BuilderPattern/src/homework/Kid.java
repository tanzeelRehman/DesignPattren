package homework;

public class Kid {
  String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void makeAnimal(AnimalBuilder aAnimalBuilder) {
    aAnimalBuilder.buildAnimalHeader();
    aAnimalBuilder.buildAnimalBody();
    aAnimalBuilder.buildAnimalLeg();
    aAnimalBuilder.buildAnimalArm();
    aAnimalBuilder.buildAnimalTail();

  }
}
