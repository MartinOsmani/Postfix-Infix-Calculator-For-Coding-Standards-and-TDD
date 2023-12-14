package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Is an altercation of the Stack class which it extends, used to handle stacks with floats.
 * 
 * @author martinosmani
 */
public class NumStack {

  private List<Entry> entries = new ArrayList<Entry>();
  private Stack baseStack;
  private int size = 0;

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
    entries.add(e);
    size += 1;
  }

  /**
   * Removes and returns the top {@code Entry} from the baseStack.
   * 
   * @return the last {@code Entry} at the top of the baseStack as float.
   */
  public float pop() {
    Entry popped = entries.remove(size - 1);
    float f = popped.getValue();
    size -= 1;
    return f;
  }

  /**
   * Retrieves the top() {@code Entry} from the baseStack but does not remove it.
   * 
   * @return the top {@code Entry} from the baseStack
   */
  public float top() {
    return entries.get(size - 1).getValue();
  }
  
  /**
   * Retrieves the number of entries in the baseStack.
   * 
   * @return the number of entries in the baseStack
   */
  public int size() {
    return size;
  }
  
  
}


