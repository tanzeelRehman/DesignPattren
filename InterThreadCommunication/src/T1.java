
public class T1 implements Runnable {
    Chat m;
    String[] s1 = { "Hi", "Great?", "I am also doing fine!" };

    public T1(Chat m1) {
        this.m = m1;
        new Thread(this, "Question").start();
    }

    public void run() {

        for (int i = 0; i < s1.length; i++) {
            m.question(s1[i]);
        }
    }
}