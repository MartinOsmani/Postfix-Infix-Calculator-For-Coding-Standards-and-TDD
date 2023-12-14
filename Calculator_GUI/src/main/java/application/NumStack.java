package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Is an altercation of the Stack class which it extends, used to handle stacks with floats. 
 * 
 * @author martinosmani
 */
public class NumStack{
  
  private List<Entry> entries = new ArrayList<Entry>();
  private Stack baseStack;
  private int size = 0;

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
    entries.add(e);
    size += 1;
  }
  
  /**
   * Removes and returns the top {@code Entry} from the stack.
   * 
   * @return the last {@code Entry} at the top of the stack as float.
   */
  public float pop() {
    Entry popped = entries.remove(size - 1);
    float f = popped.getValue();
    size -= 1;
    return f;
  }
}

  
  

