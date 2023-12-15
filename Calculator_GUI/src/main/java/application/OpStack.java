package application;

public class OpStack {
  private Stack baseStack;

  /**
   * Is an altercation of the Stack class which it extends, used to handle a stack with Symbols.
   * 
   * @author martinosmani
   */
  public OpStack() {
    baseStack = new Stack();
  }

  /**
   * Pushes a new {@code Symbol Entry} onto the baseStack.
   * 
   * @param Symbol to be pushed to the baseStack
   */
  public void push(Symbol symbol) {
    Entry e = new Entry(symbol);
    baseStack.push(e);
  }


}
