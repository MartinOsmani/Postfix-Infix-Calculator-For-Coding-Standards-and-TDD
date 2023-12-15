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
}