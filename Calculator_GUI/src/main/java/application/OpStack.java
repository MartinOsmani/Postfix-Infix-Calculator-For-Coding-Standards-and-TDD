package application;

/**
 * Is an altercation of the Stack class which it extends, used to handle stacks with Symbols.
 * 
 * @author martinosmani
 */
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
   * @param symbol to be pushed to the baseStack
   */
  public void push(Symbol symbol) {
    Entry e = new Entry(symbol);
    baseStack.push(e);
  }

  /**
   * Removes and returns the top {@code SYMBOL Entry} from the baseStack.
   * 
   * @return the last {@code Symbol Entry} at the top of the baseStack as a Symbol
   */
  public Symbol pop() {
    Entry popped = baseStack.pop();
    return popped.getSymbol();
  }

  /**
   * Retrieves the top() {@code Symbol Entry} from the baseStack but does not remove it.
   * 
   * @return the top {@code Symbol Entry} from the baseStack as a Symbol
   */
  public Symbol top() {
    return baseStack.top().getSymbol();
  }

  /**
   * Retrieves the number of entries in the baseStack.
   * 
   * @return the number of entries in the baseStack
   */
  public int size() {
    return baseStack.size();
  }
  
  


}
