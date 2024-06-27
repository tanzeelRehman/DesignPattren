public class PayableVisitor implements Visitor {
    private double totalPayableForCart;


    @Override
    public void visitBook(Book book) {
        totalPayableForCart += book.getPrice();
    }

    @Override
    public void visitCD(CD cd) {
        totalPayableForCart += cd.getPrice();
    }

    public double getTotalPayableForCart() {
        return totalPayableForCart;
    }
}
