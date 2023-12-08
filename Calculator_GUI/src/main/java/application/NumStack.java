package application;

/**
 * Is an altercation of the Stack class which it extends, used to handle stacks with floats. 
 * 
 * @author martinosmani
 */
public class NumStack extends Stack{

  private Stack baseStack;

  public NumStack() {
    baseStack = new Stack();
  }
  
  /**
   * Pushes a new {@code Entry} onto the stack.
   * 
   * @param number float to be pushed to the stack
   */
  public void push(float number) {
    Entry e = new Entry(number);
    baseStack.push(e);
  }


}
