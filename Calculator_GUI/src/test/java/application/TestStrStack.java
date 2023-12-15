package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestStrStack {
  private StrStack ss;

  @BeforeEach
  public void initialize() {
    ss = new StrStack();
  }


  @Test
  void testStrStackClass() {
    StrStack ss = new StrStack(); // 1st Test fixed by creating the StrStack class.
  }

  @Test
  void testPushString() {
    ss.push("A"); // 2nd Test fixed by creating the push() method.
  }

  @Test
  void testPopString() {
    ss.push("A");
    assertEquals("A", ss.pop()); // 3rd Test fixed by creating the pop() method.
  }

  @Test
  void testTopString() {
    ss.push("A");
    ss.push("B");
    ss.push("C");
    ss.pop();
    assertEquals("B", ss.top()); // 4th Test fixed by creating the top() method.
  }

  @Test
  void testSize() {
    assertEquals(0, ss.size());
    ss.push("C");
    assertEquals(1, ss.size());
    ss.push("B");
    ss.push("A");
    ss.pop();
    assertEquals(2, ss.size()); // 5th Test fixed by adding size method that returns size of stack.
  }
}
