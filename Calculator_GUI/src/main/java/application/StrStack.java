package application;

/**
 * Is an altercation of the Stack class which it extends, used to handle stacks with Strings.
 * 
 * @author martinosmani
 */
public class StrStack {
  private Stack baseStack;

  public StrStack() {
    baseStack = new Stack();
  }

  /**
   * Pushes a new {@code String Entry} onto the baseStack.
   * 
   * @param str String to be pushed.
   */
  public void push(String str) {
    Entry e = new Entry(str);
    baseStack.push(e);
  }

  /**
   * Removes and returns the top {@code String Entry} from the baseStack.
   * 
   * @return the last {@code String Entry} at the top of the baseStack as a String
   */
  public String pop() {
    Entry popped = baseStack.pop();
    return popped.getString();
  }
}