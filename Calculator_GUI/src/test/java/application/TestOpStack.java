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

}
