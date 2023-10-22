public class Expression {
     private double firstNumber;
     private double secondNumber;
     private char operator;
     private String expression;

     public Expression (String exp) {
          this.expression = exp;
          this.firstNumber = 0.0;
          this.secondNumber = 0.0;
     }

     public void buildExpression() {
          char[] charExpression = expression.toCharArray();
          int dimension = charExpression.length;

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
                         firstNumber = firstNumber * 10 + Character.getNumericValue(charExpression[i]);
                    } else {
                         secondNumber = secondNumber * 10 + Character.getNumericValue(charExpression[i]);
                    }
               }

          }
     }
     public double computeExpression () {
          double result = 0;

          switch (operator) {
               case '+':
                    result = firstNumber + secondNumber;
                    break;
               case '-':
                    result = firstNumber - secondNumber;
                    break;
               case '/':
                    result = firstNumber / secondNumber;
                    break;
               case '*':
                    result = firstNumber * secondNumber;
                    break;
          }

          return result;
     }

}
