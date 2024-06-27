public class CD implements Element {
    private String title;
    private double price;

    public CD(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCD(this);
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
