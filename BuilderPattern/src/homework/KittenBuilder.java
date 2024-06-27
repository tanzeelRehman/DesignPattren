package homework;

public class KittenBuilder extends AnimalBuilder {
  public KittenBuilder() {
    aAnimal = new Kitten();
  }
  @Override
  public void buildAnimalHeader() {
    aAnimal.setHead("Kitten's Head has been built");
  }

  @Override
  public void buildAnimalBody() {
    aAnimal.setBody("Kitten's Body has been built");
  }

  @Override
  public void buildAnimalLeg() {
    aAnimal.setLeg("Kitten's Leg has been built");
  }

  @Override
  public void buildAnimalArm() {
    aAnimal.setArm("Kitten's Arm has been built");
  }

  @Override
  public void buildAnimalTail() {
    aAnimal.setTail("Kitten's Tail has been built");
  }
}
