public class PayPalStrategy implements PaymentStrategy {
    private String emailID;
    private String password;

    public PayPalStrategy(String emailID, String password) {
        this.emailID = emailID;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Rupees paid using PayPal "+ this);
    }

    @Override
    public String toString() {
        return "PayPalStrategy{" +
                "emailID='" + emailID + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
