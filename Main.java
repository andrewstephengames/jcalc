import java.util.Scanner;

public class Main {
     public static void main (String[] arg) {
          try (Scanner scanner = new Scanner(System.in)) {
               String math = scanner.nextLine();
               Expression expression = new Expression(math);
               
               expression.buildExpression();
               double result = expression.computeExpression();
               
               System.out.println("The result is: " + result);
          }
     }
}
