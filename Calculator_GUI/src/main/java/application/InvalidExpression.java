package application;

/**
 * An expression was passed to a method that could not be evaluated.
 */

public class InvalidExpression extends RuntimeException {
  
  public InvalidExpression(String msg) {
    super(msg);
  }

}
