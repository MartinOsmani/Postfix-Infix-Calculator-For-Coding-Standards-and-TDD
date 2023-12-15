package application;

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
    StrStack ss = new StrStack(); //1st Test fixed by creating the StrStack class.
  }
  
  @Test 
  void testPushString() {
    ss.push("A"); // 2nd Test fixed by creating the push() method.
  }
}
