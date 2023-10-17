public class Expression {
     // 2222 + 2
     // ^
     // Expression expr = new Expression ("2 + 2");
     // num[0] = 2
     // num[1] = 2
     // op = '+'
     int[] number = new int[127]; // imposed limit on the number of operations
     int n = 0;
     char operator;
     int finalExpr = 0;
     public Expression (String expr) {
          String trimmedExpr = expr.trim();
          int firstNum = 0;
          for (int i = 0; i < trimmedExpr.length(); ++i) {
               if (trimmedExpr.charAt(i) >= '0' && trimmedExpr.charAt(i) <= '9') {
                    firstNum = i;
                    break;
               }
               if (trimmedExpr.charAt(i) == '+')
                    this.operator = '+';
          }
          for (int i = 0; i < trimmedExpr.length(); ++i) {
               if (!(trimmedExpr.charAt(i) >= '0' && trimmedExpr.charAt(i) <= '9')) {
                    this.number[n++] = Integer.parseInt (trimmedExpr.substring(firstNum, i-1));
               }
          }
     }
     public int doOperation () {
          int expr = this.finalExpr;
          for (int i = 0; i < n; ++i) {
          switch (this.operator) {
               // TODO: order of operations not supported
               case '+':
                    expr += this.number[i];
                    break;
               case '-':
                    expr -= this.number[i];
                    break;
               case '*':
                    expr *= this.number[i];
                    break;
               case '/':
                    expr /= this.number[i];
                    break;
               case '^':
                    //expr = Math.pow ((double) expr, (double)this.number[i]);
                    //TODO: not implemented
                    break;
               default:
                    System.err.println ("Invalid operation.");
          }
          }
          return expr;
     }
}
