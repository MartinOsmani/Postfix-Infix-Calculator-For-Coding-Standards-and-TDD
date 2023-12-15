package application;

import java.util.Scanner;

/**
 * This class provides the functionality to evaluate arithmetic expressions written in standard
 * infix notation. It supports basic arithmetic operations and the use of parentheses to dictate
 * operation precedence.
 */
public class StandardCalc {

  private OpStack opStack;
  private NumStack numStack;

  /**
   * Constructor for StandardCalc which initialises the OpStack and the NumStack.
   */
  public StandardCalc() {
    opStack = new OpStack();
    numStack = new NumStack();
  }


  /**
   * Evaluates an arithmetic expression given in infix notation.
   *
   * @param expr The arithmetic expression in standard infix notation
   * @return The result of the evaluated expression
   * @throws InvalidExpression if the expression is in incorrect syntax, contains invalid tokens, or
   *         attempts a division by zero
   */
  public float evaluate(String expr) throws InvalidExpression {
    Scanner scanner = new Scanner(expr);

    try {
      while (scanner.hasNext()) {
        if (scanner.hasNextFloat()) {
          numStack.push(scanner.nextFloat());
        } else {
          String token = scanner.next();
          Symbol op = getSymbol(token);
          if (op == null) {
            throw new InvalidExpression("Invalid token encountered: " + token);
          }
          if (op == Symbol.LEFT_BRACKET) {
            opStack.push(op);
          } else if (op == Symbol.RIGHT_BRACKET) {
            while (opStack.size() != 0 && opStack.top() != Symbol.LEFT_BRACKET) {
              doOperation();
            }
            if (opStack.size() == 0) {
              throw new InvalidExpression("Mismatched parentheses in expression.");
            }
            opStack.pop();
          } else {
            while (opStack.size() != 0 && presedence(opStack.top()) >= presedence(op)) {
              doOperation();
            }
            opStack.push(op);
          }
        }
      }

      while (opStack.size() != 0) {
        doOperation();
      }

      if (numStack.size() != 1) {
        throw new InvalidExpression("Invalid exprettion.");
      }

      return numStack.pop();
    } finally {
      scanner.close();
    }
  }


  /**
   * Performs the arithmetic operation at the top of the operator stack on the two top two numbers
   * of the NumStack.
   *
   * @throws InvalidExpression if there are not enough values on the number stack to perform an
   *         operation, or if an attempt is made to divide by zero.
   */
  private void doOperation() throws InvalidExpression {
    if (numStack.size() < 2) {
      throw new InvalidExpression("Inssuficient numbers in stack for the Standard Calculator.");
    }

    float secondOperand = numStack.pop();
    float firstOperand = numStack.pop();
    Symbol operator = opStack.pop();

    switch (operator) {
      case PLUS:
        numStack.push(firstOperand + secondOperand);
        break;
      case MINUS:
        numStack.push(firstOperand - secondOperand);
        break;
      case TIME:
        numStack.push(firstOperand * secondOperand);
        break;
      case DIVIDE:
        if (secondOperand == 0) {
          throw new InvalidExpression("Division by zero.");
        }
        numStack.push(firstOperand / secondOperand);
        break;
      default:
        throw new InvalidExpression("Invalid operator: " + operator);
    }
  }


  /**
   * Retrieves the corresponding Symbol from the Symbol enum for a given token.
   *
   * @param token is the token representing an operator or a bracket
   * @return the corresponding Symbol from the Symbol enum, or null if the token is not a valid
   *         operator or parenthesis
   */
  private Symbol getSymbol(String token) {
    switch (token) {
      case "+":
        return Symbol.PLUS;
      case "-":
        return Symbol.MINUS;
      case "*":
        return Symbol.TIME;
      case "/":
        return Symbol.DIVIDE;
      case "(":
        return Symbol.LEFT_BRACKET;
      case ")":
        return Symbol.RIGHT_BRACKET;
      default:
        return null;
    }
  }

  /**
   * Determines the precedence level of an operator. Higher values indicate higher precedence.
   *
   * @param op the operator symbol
   * @return an integer value representing the operator's precedence
   */
  private int presedence(Symbol op) {
    switch (op) {
      case PLUS:
      case MINUS:
        return 1;
      case TIME:
      case DIVIDE:
        return 2;
      default:
        return -1;
    }
  }

}
