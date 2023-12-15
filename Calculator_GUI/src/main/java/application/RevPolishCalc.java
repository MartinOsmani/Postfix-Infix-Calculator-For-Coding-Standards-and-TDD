package application;

import java.util.Scanner;

/**
 * A calculator for evaluating arithmetic expressions written in Reverse Polish Notation.
 */
public class RevPolishCalc {
  private NumStack ns;

  /**
   * Constructs a new Reverse Polish Notation calculator with an empty {@code NumStack}.
   */
  public RevPolishCalc() {
    ns = new NumStack();
  }

  /**
   * Evaluates the given string expression in Reverse Polish Notation.
   * 
   * @param expr The RPN expression to be evaluated
   * @return The result of the evaluated expression as a float
   * @throws InvalidExpression if the expression is not in valid Reverse Polish Notation, if there
   *         are insufficient operands for an operation, or if division by zero occurs
   */
  public float evaluate(String expr) {

    Scanner scanner = new Scanner(expr);

    try {
      while (scanner.hasNext()) {
        if (scanner.hasNextFloat()) {
          // If the next token is a number, push it to the stack
          ns.push(scanner.nextFloat());
        } else {
          // Otherwise, it should be an operator
          String token = scanner.next();
          if (ns.size() < 2) {
            throw new InvalidExpression("Insufficient operands for the operator: " + token);
          }
          float secondOperand = ns.pop();
          float firstOperand = ns.pop();
          switch (token) {
            case "+":
              ns.push(firstOperand + secondOperand);
              break;
            case "-":
              ns.push(firstOperand - secondOperand);
              break;
            case "*":
              ns.push(firstOperand * secondOperand);
              break;
            case "/":
              if (secondOperand == 0) {
                throw new InvalidExpression("Division by zero error.");
              }
              ns.push(firstOperand / secondOperand);
              break;
            default:
              throw new InvalidExpression("Invalid operator: " + token);
          }
        }
      }
      if (ns.size() != 1) {
        throw new InvalidExpression("Expression is not in Inverse Polish Notation: " + expr);
      }

      return ns.pop();


    } finally {
      scanner.close();
    }
  }
}


