package homework.AbstractModel;

public class Tyrannosaurus implements Species
{
    @Override
    public void name() {
        System.out.println("Species created is Tyrannosaurus");
    }

    @Override
    public void sound() {
        System.out.println("Sound of Tyrannosaurus is \"Roar\"");
    }

}
