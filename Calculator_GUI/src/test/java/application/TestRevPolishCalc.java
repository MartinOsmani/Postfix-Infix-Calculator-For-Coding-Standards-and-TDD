package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRevPolishCalc {
  private RevPolishCalc rvc;
  
  @BeforeEach
  public void initialize() {
    rvc = new RevPolishCalc();
  }

  @Test
  void testRevPolishCalc() {
    RevPolishCalc rvc = new RevPolishCalc(); // 1st Test fixed by adding RevPolishCalc Class
  }
  
  @Test
  void testEvaluateReturnsCorrectResultWithPlus() {
    assertEquals(15f, rvc.evaluate("8 3 4 + +"));
    assertEquals(20f, rvc.evaluate("5 10 5 + +"));
  }
  
  @Test
  void testEvaluateReturnsCorrectResultWithMinus() {
    assertEquals(-14.56f, rvc.evaluate("0 14 - 0.56 -"));
  }
  
  @Test 
  void testEvaluateReturnsCorrectResultWithMult() {
    assertEquals(44f, rvc.evaluate("11 4 *"));
  }
  
  @Test
  void testEvaluateReturnsCorrectResultWithDivide() {
    assertEquals(5f, rvc.evaluate("25 5 /"));
  }
  
  @Test
  void testEvaluateWithAllOps() {
    assertEquals(20f, rvc.evaluate("4.5 5.5 + 10 * 5 /"));
  }

}
