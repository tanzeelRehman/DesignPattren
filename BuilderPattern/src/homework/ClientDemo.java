package homework;

public class ClientDemo {
  public static void main(String[] args) { // create a constructor object to start building
    Kid aKid = new Kid();
    aKid.setName("Salman Khan");
    System.out.println(
        "Welcome "
            + aKid.getName()
            + " \n\t\t\t<=======\t\tWelcome to Animal Mould Factory\t\t=======>");
    System.out.println("========================================================================");
    System.out.println("Start making Monkey.");
    AnimalBuilder builder = new MonkeyBuilder();
    aKid.makeAnimal(builder);
    builder.aAnimal.showMe();
    System.out.println("========================================================================");
    System.out.println("Start making Kitten.");
    builder = new KittenBuilder();
    aKid.makeAnimal(builder);
    builder.aAnimal.showMe();
  }
}
