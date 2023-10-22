public class Expression {
     int firstNumber = 0;
     int secondNumber = 0;
     char operator;
     String expression;

     public Expression (String exp) {
          this.expression = exp;
     }

     public void buildExpression() {
          int dimension = expression.length();
          char[] charExpression = expression.toCharArray();
          boolean buildFirstNumber = true;
          boolean buildSecondNumber = false;

          for(int i = 0 ; i < dimension ; i++) {
               switch(charExpression[i]) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                         operator = charExpression[i];
                         buildFirstNumber = false;
                         buildSecondNumber = true;
                         break;

               }
               
               if(charExpression[i] >= '0' && charExpression[i] <= '9') {
                    if (buildFirstNumber == true) {
                         firstNumber = firstNumber * 10 + Integer.valueOf(charExpression[i]);
                    } else {
                         secondNumber = secondNumber * 10 + Integer.valueOf(charExpression[i]);
                    }
               }

          }
     }
}
