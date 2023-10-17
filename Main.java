import java.util.Scanner;
public class Main {
     public static void main (String[] args) {
          for (String i: args) {
               if (i.equals ("help")) {
                    System.err.println ("Available flags: ");
                    System.err.println ("expr: Expression mode");
                    System.err.println ("silent: Silent mode");
               }
               if (i.equals ("silent")) {
                    System.err.println ("Not implemented.");
               }
          }
          Scanner scanner = new Scanner();
          String readExpr = scanner.nextLine();
          Expression expr = new Expression (readExpr);
          expr.finalExpr = expr.doOperation();
          System.out.println (expr.finalExpr);
     }
}
