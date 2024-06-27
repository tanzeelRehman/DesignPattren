public class InterpreterUtil {
    static boolean isOperator(String exp) {
        return exp.equals("+") || exp.equals("-") || exp.equals("*");
    }

    static Expression getOperator(String operator, Expression left, Expression right) {
        return switch (operator) {
            case "+" -> new SumExpression(left, right);
            case "-" -> new DifferenceExpression(left, right);
            case "*" -> new ProductExpression(left, right);
            default -> null;
        };
    }
}
