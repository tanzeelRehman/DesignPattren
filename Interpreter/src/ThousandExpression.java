public class ThousandExpression extends Expression{
    @Override
    String one() {
        return "M";
    }

    @Override
    String four() {
        return " ";
    }

    @Override
    String five() {
        return " ";
    }

    @Override
    String nine() {
        return " ";
    }

    @Override
    int multiplier() {
        return 1000;
    }
}
