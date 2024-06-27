package homework;

public class MonkeyBuilder extends AnimalBuilder {

  public MonkeyBuilder() {
    aAnimal = new Monkey();
  }

  @Override
  public void buildAnimalHeader() {
    aAnimal.setHead("Monkey's Head has been built");
  }

  @Override
  public void buildAnimalBody() {
    aAnimal.setBody("Monkey's Body has been built");
  }

  @Override
  public void buildAnimalLeg() {
    aAnimal.setLeg("Monkey's Leg has been built");
  }

  @Override
  public void buildAnimalArm() {
    aAnimal.setArm("Monkey's Arm has been built");
  }

  @Override
  public void buildAnimalTail() {
    aAnimal.setTail("Monkey's Tail has been built");
  }
}
