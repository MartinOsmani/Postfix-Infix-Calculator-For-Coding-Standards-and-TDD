package application;

/**
 * Represents an entry which can be of type Number, Symbol or String.
 * 
 * @author martinosmani
 */

public class Entry {
  private float number; // Store number values
  private String str; // Store string values
  private Symbol symbol; // Store symbol values from Symbol enum
  private Type type; // Indicates the type of current entry (Number, Symbol or String)

  /**
   * Initialises a new instance of Entry class with a float value.
   * 
   * @param value the float value to be stored
   */
  public Entry(float value) {
    this.number = value;
    this.type = Type.NUMBER; // Set type to number for value Entry
  }

  /**
   * Initialises a new instance of the Entry class with a Symbol value from the Symbol enum.
   * 
   * @param which the Symbol value to be stored.
   */
  public Entry(Symbol which) {
    this.symbol = which;
    this.type = Type.SYMBOL; // Set type to SYMBOL for the Symbol entry
  }

  /**
   * Initialises a new instance of the Entry class with a String value.
   * 
   * @param string the String value to be stored
   */
  public Entry(String string) {
    this.str = string;
    this.type = Type.STRING; // Set type to STRING for the string entry
  }

  /**
   * Retrieves the float value stored from the Entry.
   * 
   * @return the float value stored
   * @throws BadTypeException if the current type of Entry is not NUMBER
   */
  public float getValue() {
    if (type != Type.NUMBER) {
      // Ensures correct type of entry is retrieved
      throw new BadTypeException("Bad Type, Expected: Type.NUMBER.");

    }
    return number;
  }

  /**
   * Retrieves the type of this Entry.
   * 
   * @return the type of the entry
   */
  public Type getType() {
    return type; // Returns the entry type
  }

  /**
   * Retrieves the Symbol value stored in the Entry.
   * 
   * @return the Symbol value stored
   * @throws BadTypeException if the current type of the Entry is not SYMBOL
   */
  public Symbol getSymbol() {
    // Ensures correct type of entry is retrieved
    if (type != Type.SYMBOL) {
      throw new BadTypeException("Bad Type, Expected: Type.SYMBOL.");

    }
    return symbol;
  }

  /**
   * Retrieves the String value stored in the Entry.
   * 
   * @return the String value stored
   * @throws BadTypeException if the current type of Entry is not STRING
   */
  public String getString() {
    // Ensure correct type of entry is retrieved
    if (type != Type.STRING) {
      throw new BadTypeException("Bad Type, Expected: Type.STRING.");

    }
    return str;
  }

  /**
   * Compares this Entry object with another Entry object for equality. Two entries are considered
   * equal if they have the same type and equivalent value.
   * 
   * @param other the Entry object to be compared to this entry
   * @return true if both entries are of the same type and have the same value, false otherwise.
   */
  public boolean equals(Entry other) {

    if (this.type != other.type) {
      return false;
    }
    if (this == null & other == null) {
      return true;
    }

    switch (this.type) {
      case NUMBER:
        return Float.compare(this.number, other.number) == 0;
      case STRING:
        return this.str != null ? this.str.equals(other.str) : other.str == null;
      case SYMBOL:
        return this.symbol == other.symbol;
      default:
        return false;
    }
  }

}
