public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public void modify(float difference) {
        balance += difference;
    }

    public float getBalance() {
        return balance;
    }
}
