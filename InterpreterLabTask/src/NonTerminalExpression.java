public class NonTerminalExpression implements Expression {
    protected Expression leftExpression;
    protected Expression rightExpression;

    public NonTerminalExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return 0;
    }
}
