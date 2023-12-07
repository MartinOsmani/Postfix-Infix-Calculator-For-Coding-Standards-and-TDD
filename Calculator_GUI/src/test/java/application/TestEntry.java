package application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEntry {
  private static Entry e1;
  private static Entry e2;
  private static Entry e3;

  @BeforeEach
  void createEntries() {
    e1 = new Entry(10.0f);
    e2 = new Entry(Symbol.PLUS);
    e3 = new Entry("A");
  }

  @Test
  void testValueConstrucor() {
    Entry e = new Entry(10.0f); // 1st test fixed by creating entry class and Entry(float value)
                                // constructor.
  }

  @Test
  void testGetValue() {
    assertEquals(10.0f, e1.getValue()); // 2nd test fixed by creating getValue() method returning
                                        // 10.0f.
    Entry e2 = new Entry(5.0f);
    assertEquals(5.0f, e2.getValue()); // 3rd test fixed by getValue() returning number instead of
                                       // 10.0f.
  }

  @Test
  void testSymbolConstructor() {
    Entry e = new Entry(Symbol.PLUS); // 4th test fixed by creating Symbol Enum and its'
                                      // constructor.
  }

  @Test
  void testStringConstructor() {
    Entry e = new Entry("A"); // 5th test fixed by creating Entry(String) constructor.
  }

  @Test
  void testGetType() {
    assertEquals(Type.NUMBER, e1.getType()); // 6th test fixed by creating Type enum and getType()
                                             // method returning Type.NUMBER.
    assertEquals(Type.SYMBOL, e2.getType()); // 7th test fixed by adding the type to constructors
                                             // and getType returning type instead of Type.NUMER.
    assertEquals(Type.STRING, e3.getType());
  }

  @Test
  void testGetSymbol() {
    assertEquals(Symbol.PLUS, e2.getSymbol()); // 8th test fixed by creating getSymbol() method
                                               // which returns Symbol.PLUS.
    Entry e = new Entry(Symbol.DIVIDE);
    assertEquals(Symbol.DIVIDE, e.getSymbol()); // 9th test fixed by getSymbol() returning symbol
                                                // instead of Symbol.PLUS.
  }

  @Test
  void testGetString() {
    assertEquals("A", e3.getString()); // 10th test fixed by creating getString() method that
                                       // returns "A".
    Entry e = new Entry("B");
    assertEquals("B", e.getString()); // 11th test fixed by getString() returning str instead of
                                      // "A".
  }

  @Test
  void testBadType() {
    assertThrows(BadTypeException.class, () -> e1.getSymbol()); // 12th test fixed by
                                                                // BadTypeException being created
                                                                // and thrown on getSymbol().
    assertThrows(BadTypeException.class, () -> e1.getString()); // 13th test fixed by getString()
                                                                // throwing BadTypeException.
    assertThrows(BadTypeException.class, () -> e2.getValue()); // 14th test fixed by getValue()
                                                               // throwing BadTypeException.
  }

  @Test
  void testEntryEquals() {
    Entry e1 = new Entry("B");
    Entry e2 = new Entry("B");
    Entry e4 = new Entry(5.0f);
    Entry e5 = new Entry(Symbol.MINUS);
    assertEquals(true, e2.equals(e1)); // 14th test, fixed by overriding equals in entry class.
                                       // Which returns true.
    assertEquals(false, e1.equals(e3));// 15th test, fixed by equals method returning true only if
                                       // its same type and value.
    assertEquals(false, e4.equals(e5));
  }

  @Test
  void testEntryEqualsWithDifferentNumbers() {
      Entry e1 = new Entry(5.0f);
      Entry e2 = new Entry(6.0f);
      assertEquals(false, e1.equals(e2));
  }

  @Test
  void testEntryEqualsWithStringAndNull() {
      Entry e1 = new Entry((String) null);
      Entry e2 = new Entry("A");
      assertEquals(false, e1.equals(e2));
  }

  @Test
  void testEntryEqualsWithNullStrings() {
      Entry e1 = new Entry((String) null);
      Entry e2 = new Entry((String) null);
      assertEquals(true, e1.equals(e2));
  }

  @Test
  void testEntryEqualsWithDifferentSymbols() {
      Entry e1 = new Entry(Symbol.PLUS);
      Entry e2 = new Entry(Symbol.MINUS);
      assertEquals(false, e1.equals(e2));
  }
  
 


}
