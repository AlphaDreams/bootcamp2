import java.math.BigDecimal;
import java.time.LocalDate;

public class week2 {
  public static void main(String[] args) {
    // 8 Primitives, String  
    // BigDecimal
    // LocalDate

    // Store a set of same type of values > array
    LocalDate[] dates = new LocalDate[3];
    BigDecimal[] numbers = new BigDecimal[4];

    // Wrapper Class
    // Integer, Short, Long, Byte
    // Double, Float
    // Character
    // Boolean
    // autobox (from primitive to Wrapper), unbox (from Wrapper Class to Primitive)

    // Primitives - Upcast, Downcast
    // byte > short > int > long > float > double
    // char > int
    int k = 3;
    long x = k; // upcast

    // During compile time, "unsafe" on type conversion > Explicit Conversion
    // During runtime, 4L is safe for this conversion
    int h = (int) 4L;

    // overflow
    byte b = (byte) 138L;
    System.out.println(b); // -118

  }
}
