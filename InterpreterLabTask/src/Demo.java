import java.util.Scanner;
import java.util.Stack;


public class Demo {
    public static void main(String[] args) {
        System.out.print("Enter your  Prefix Expression: ");
//        * + 1 2 - 3 7
        Scanner scan = new Scanner(System.in);
        String exp = "";

        exp = scan.nextLine();
        System.out.println("Entered Expression : " + exp);
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(exp);

        // reverse StringBuilder input1
        input1.reverse();

        exp = input1.toString();
        System.out.println("Reversed Expression: "+exp);
//        String exp = "7 3 - 2 1 + *";

        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = exp.split(" ");
       try {
           for (String s : tokenArray) {
               if (InterpreterUtil.isOperator(s)) {
                   Expression rightExpression = stack.pop();
                   Expression leftExpression = stack.pop();
                   Expression expression = InterpreterUtil.getOperator(s, leftExpression, rightExpression);
                   int result = expression.interpret();

                   stack.push(new TerminalExpression(result));
               } else {
                   Expression terminalExpression = new TerminalExpression(Integer.parseInt(s));
                   stack.push(terminalExpression);
               }
           }
           System.out.println("(" + exp + ") = " + stack.pop().interpret());
       }catch (Exception e){
           System.out.println("Given Expression is not usable");
       }

    }
}
