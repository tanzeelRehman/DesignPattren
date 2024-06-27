import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Element> items = new ArrayList<>();


    void addItem(Element element) {
        items.add(element);
    }

    double calculatePayable() {

        PayableVisitor payableVisitor = new PayableVisitor();
        for (Element item : items) {
            item.accept(payableVisitor);
        }
        double payable = payableVisitor.getTotalPayableForCart();
        return payable;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "items= \n" + items +
                "\n}";
    }
}
