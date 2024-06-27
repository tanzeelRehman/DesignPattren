package homework.AbstractModel;

public class Snake implements Species {
    @Override
    public void name() {
        System.out.println("Species created is snake");
    }

    @Override
    public void sound() {
        System.out.println("The sound of snake is 'HISS'");
    }
}
