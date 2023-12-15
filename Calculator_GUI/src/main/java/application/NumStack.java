package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Is an altercation of the Stack class which it extends, used to handle stacks with floats.
 * 
 * @author martinosmani
 */
public class NumStack {
  private Stack baseStack;


  public NumStack() {
    baseStack = new Stack();
  }

  /**
   * Pushes a new {@code Entry} onto the baseStack.
   * 
   * @param number float to be pushed to the baseStack
   */
  public void push(float number) {
    Entry e = new Entry(number);
    baseStack.push(e);
  }

  /**
   * Removes and returns the top {@code Entry} from the baseStack.
   * 
   * @return the last {@code Entry} at the top of the baseStack as float
   */
  public float pop() {
    Entry popped = baseStack.pop();
    return popped.getValue();
  }

  /**
   * Retrieves the top() {@code Entry} from the baseStack but does not remove it.
   * 
   * @return the top {@code Entry} from the baseStack
   */
  public float top() {
    return baseStack.top().getValue();
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


