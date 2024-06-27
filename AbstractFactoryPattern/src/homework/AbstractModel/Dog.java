package homework.AbstractModel;

public class Dog implements Species {
    @Override
    public void name() {
        System.out.println("Species created is Dog");
    }
    @Override
    public void sound() {
        System.out.println("Sound of dog is \"woof\"");
    }

}
