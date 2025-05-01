public class week1 {
  public static void main(String[] args) {
    // Data Type: Primitives
    byte b1 = -128;
    byte b2 = 127;
    //byte b3 = 128;
    
    // short s1 = 33000;
    short s2 = 32000;
    short s3 = -32000;

    int i1 = 2100000000;
    int i2 = -2100000000;

    // int to long (auto-convert)
    long l1 = 10L;
    
    //
    float f1 = 3.3f;
    double d1 = 1.9;

    char c1 = 'a';
    //int - int
    System.out.println('a' - 'a'); // 0
    System.out.println('a' - 'b'); // -1

    boolean isEldery = false;
    // isEldery > formula / definition
    int age = 65;
    isEldery = age >= 65;

    if(!isEldery) {
      System.out.println("I am no an elderly.");
    }
    if (age < 65) {
      System.out.println("I am no an elderly.");
    }

    int b = 3;
    boolean result = b > 1 || b > 10;
    boolean result2 = true || false;

    System.out.println(result2);
    System.out.println(true && false); // false

    //true && true
    //true && false > false
    //true || false > true

    // +, -, *, /, %
    int x = 10;
    boolean isOdd = x % 2 == 1;

    int a = 0;
    a++;
    ++a;
    System.out.println(a++); // 2
    System.out.println(a); // 3

    // System.out.println(10 /0 ); system error
    System.out.println(0 / 3); // 0
    System.out.println(10 / 3); // 3

    // if, else if, else
    int y = 4;
    int u = 3;
    if(y >2 && u < 1 ) {
    
    } else if (y > 2 && u >= 1) {

    } else if (y <= 2 && u < 1) {

    } else { // y <=2 && u >=1 
      
    }

    if (y > 8) {
      System.out.println("Java");
    } else if ( y > 1 && y <= 8) {
      System.out.println("Python");
    } else if ( y > -3 && y <= 1) {
      System.out.println("Javascript");
    } else if ( y <= -3) {
      System.out.println("C++");
    }




  }
}
