package application;

/**
 * Represents an exception that is thrown when a {@code pop()} or {@code top()} is performed on an
 * empty stack. This exception extends {@link RunTimeExcepion}.
 * 
 * @author martinosmani
 */
public class EmptyStackException extends RuntimeException {

  /**
   * Constructs a new {@code EmptyStackException} along with its' message.
   * 
   * @param msg the message that displays for the intended method
   */
  public EmptyStackException(String msg) {
    super(msg);
  }
}
