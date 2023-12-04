package application;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an altered version of a stack data structure which is used to hold {@code Entry}
 * objects by using an implementation of the {@link ArrayList} to manage the entries.
 * 
 * @author martinosmani
 */
public class Stack {
  private List<Entry> entries = new ArrayList<Entry>(); // List to hold the stack of entries
  private int size = 0; // Keeps track of number of entries in a stack and used as a pointer

  /**
   * Pushes a new {@code Entry} onto the stack.
   * 
   * @param e {@code Entry} to be pushed to the stack
   */
  public void push(Entry e) {
    size += 1; // Adds 1 to size as push(Entry) increases it by one.
    entries.add(e); // Adds the entry to the list
  }

  /**
   * Retrieves the number of entries in the stack.
   * 
   * @return the number of entries in the stack
   */
  public int size() {
    return size;
  }

  /**
   * Removes and returns the top {@code Entry} from the stack.
   * 
   * @return the last {@code Entry} at the top of the stack
   * @throws EmptyStackException if the stack is empty
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException("Can not pop from empty Stack!"); // Ensures Stack is not empty
    }
    Entry popped = entries.get(size - 1); // Uses (size - 1) as the index as index starts from 0
    entries.remove(size - 1); // Removes the last entry from the list using (size - 1) as the index.
    size -= 1;
    return popped;
  }

  /**
   * Retrieves the top() {@code Entry} from the stack but does not remove it.
   * 
   * @return the top {@code Entry} from the stack
   * @throws EmptyStackException if the stack is empty
   */
  public Entry top() {
    if (size == 0) {
      throw new EmptyStackException("Can not top from empty Stack!"); // Ensures Stack is not empty
    }
    return entries.get(size - 1);
  }

}
