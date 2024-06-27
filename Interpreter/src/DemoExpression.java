import java.util.ArrayList;
import java.util.Iterator;

public class DemoExpression {
    public static void main(String[] args) {
        String roman="TMCMXXVIII";
        Context context = new Context(roman);

        // Build the 'parse tree' /AST
        ArrayList<Expression> tree = new ArrayList<>();
        tree.add(new TenThousandExpression());
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new UnitExpression());

        // Interpret
        for (Expression expression :tree)
        {

            expression.interpret(context);
        }

        System.out.println(roman + " = " + (context.getOutput()));
    }
}
