public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cardPin;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cardPin, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " Rupees paid with card by" + this);
    }

    @Override
    public String toString() {
        return "CreditCardStrategy{" +
                "name='" + name + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardPin='" + cardPin + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                '}';
    }
}
