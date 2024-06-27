package homework.AbstractModel;

public class Cat implements Species {
    @Override
    public void name() {
        System.out.println("Species created is Cat");
    }
    @Override
    public void sound() {
        System.out.println("Sound of cat is \"Meow\"");
    }
}
