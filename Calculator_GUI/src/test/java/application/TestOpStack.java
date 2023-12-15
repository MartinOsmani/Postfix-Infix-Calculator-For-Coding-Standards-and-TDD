package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestOpStack {

  private OpStack ops;


  @BeforeEach
  public void initialize() {
    ops = new OpStack();
  }

  @Test
  void testOpStackClass() {
    OpStack ops = new OpStack(); // 1st Test fixed by creating OpStack Class.
  }

  @Test
  void testPushSymbol() {
    ops.push(Symbol.PLUS); // 2nd Test fixed by creating push method that pushes symbols only.
  }

  @Test
  void testPopSymbol() {
    ops.push(Symbol.PLUS);
    ops.pop();
    ops.push(Symbol.MINUS);
    ops.push(Symbol.DIVIDE);
    assertEquals(Symbol.DIVIDE, ops.pop());// 3rd Test fixed by creating pop method that pops the
                                           // last symbol pushed to the stack.
  }

  @Test
  void testTopFloat() {
    ops.push(Symbol.PLUS);
    ops.push(Symbol.LEFT_BRACKET);
    assertEquals(Symbol.LEFT_BRACKET, ops.top()); // 4th Test fixed by creating top method that returns the last symbol.
  }
  
  @Test
  void testSize() {
    assertEquals(0, ops.size());
    ops.push(Symbol.DIVIDE);
    assertEquals(1, ops.size());
    ops.push(Symbol.TIME);
    ops.push(Symbol.RIGHT_BRACKET);
    ops.pop();
    assertEquals(2, ops.size()); // 5th Test fixed by adding size method that returns size of stack.
  }
  

}
