package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumStack {
  private NumStack ns;
  private Entry numberE;
  private Entry symbolE;

  @BeforeEach
  public void initialize() {
    ns = new NumStack();
    numberE = new Entry(5.0f);
    symbolE = new Entry(Symbol.PLUS);
  }

  @Test
  void testNumStackClass() {
    NumStack ns = new NumStack(); // 1st Test fixed by creating NumStack Class.
  }

  @Test
  void testPushFloat() {
    ns.push(5.0f); // 2nd Test fixed by creating push method.
  }

  @Test
  void testPopFloat() {
    ns.push(5.0f);
    assertEquals(5.0f, ns.pop()); // 3rd Test fixed by creating top method that returns the last
                                  // pushed in float type. NumStack no longer extends class.
  }
}
