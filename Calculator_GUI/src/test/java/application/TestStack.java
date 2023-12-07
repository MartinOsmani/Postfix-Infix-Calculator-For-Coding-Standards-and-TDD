package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {
  private Stack s;
  private Entry number;
  private Entry symbol;
  private Entry string;

  @BeforeEach
  public void initialize() {
    s = new Stack();
    number = new Entry(14.5f);
    symbol = new Entry(Symbol.MINUS);
    string = new Entry("A");
  }

  @Test
  void testStackClass() {
    Stack s = new Stack(); // 1st test fixed by creating Stack class
  }


  @Test
  void testPushEntryValue() {
    s.push(number); // 3rd test fixed by entries stack being created and method push() being
                    // created.
  }

  @Test
  void testPushAllEntryTypes() { // 4th test that lead to no errors.
    s.push(number);
    s.push(string);
    s.push(symbol);
  }

  @Test
  void testSize() {
    s.size(); // 5th test that lead to size method and field being created.
    s.push(number);
    assertEquals(1, s.size()); // 6th test fixed by push() adding 1 to the size().
    s.pop();
    assertEquals(0, s.size()); // 8th test fixed by pop() method removing 1 from size.
  }

  @Test
  void testPop() {
    s.push(number);
    s.pop(); // 7th test fixed by adding pop() method.
    s.push(number);
    assertEquals(number.getValue(), s.pop().getValue()); // 9th test fixed by pop() returning the
                                                         // entry popped instead of void.
  }

  @Test
  void testTop() {
    s.push(number);
    s.top(); // 10th test fixed by top() void method being created.
    assertEquals(14.5f, s.top().getValue()); // 11th test fixed by top() returning value at current
                                             // size instead of void.
  }

  @Test
  void testPopEmptyStack() {
    EmptyStackException e = assertThrows(EmptyStackException.class, () -> s.pop()); // 12th test
                                                                                    // lead to
                                                                                    // EmptyStackException
                                                                                    // class being
                                                                                    // created and
                                                                                    // being thrown
                                                                                    // on pop
                                                                                    // method when
                                                                                    // size == 1.
    assertEquals("Can not pop from empty Stack!", e.getMessage()); // 13th test fixed by
                                                                   // EmptyStackException including
                                                                   // message.
  }

  @Test
  void testTopEmptyStack() {
    EmptyStackException e = assertThrows(EmptyStackException.class, () -> s.top()); // 13th test
                                                                                    // fixed by
                                                                                    // top()
                                                                                    // throwing
                                                                                    // EmptyStack
                                                                                    // Exception
                                                                                    // with message
                                                                                    // when size ==
                                                                                    // 1.
  }
  @Test
  void testPushAndPop() {
    s.push(number);
    s.push(string);
    s.push(symbol);
    s.pop();
    s.push(number);
    assertEquals(s.pop().getValue(), number.getValue());
    assertEquals(2, s.size());
  }

}


