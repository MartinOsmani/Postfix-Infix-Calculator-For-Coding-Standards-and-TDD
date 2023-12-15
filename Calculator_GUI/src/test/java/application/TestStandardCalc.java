package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStandardCalc {
  
  private StandardCalc calc;
  
  @BeforeEach
  public void initialize() {
    calc = new StandardCalc();
  }

  @Test
  void testStandardCalcClass() {
    StandardCalc sc = new StandardCalc();
  }
  
  @Test
  void TestEvaluateAddition() {
    assertEquals(11, calc.evaluate("5 + 6"));
    assertEquals(15.65, calc.evaluate("10 + 3 + 2.65"), 0.001);
  }
  
  @Test
  void TestEvaluateMixed() {
    assertEquals(11, calc.evaluate("100 / 20 + 3 * 2"));
  }
  
  @Test
  void TestEvaluateBrackets() {
    assertEquals(42, calc.evaluate("( 5 + 9 ) * 3"));
    assertEquals(60, calc.evaluate("100 / ( 10 - 8 ) + 5 * 2"));
  }

  @Test
  void TestEvaluateDivisionByZeroError() {
      assertThrows(InvalidExpression.class, () -> calc.evaluate("10 / 0"));
  }
  
  
}
