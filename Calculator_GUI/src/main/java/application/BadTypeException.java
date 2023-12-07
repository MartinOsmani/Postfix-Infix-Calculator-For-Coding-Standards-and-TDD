package application;

/**
 * Represents an exception that is thrown when the {@code Entry} type is not the same as the getter
 * method. This Exception extends {@link RunTimeException}.
 * 
 * @author martinosmani
 */

public class BadTypeException extends RuntimeException {

  /**
   * Constructs a new {@code BadTypeException} that displays a specified message when thrown.
   * 
   * @param msg the specified message to be displayed
   */
  public BadTypeException(String msg) {
    super(msg);
  }

}
