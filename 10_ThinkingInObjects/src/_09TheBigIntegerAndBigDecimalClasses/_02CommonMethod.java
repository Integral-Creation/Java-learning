/*
Common Method
    | Method        | Description             |
    | ------------- | ----------------------- |
    | `add()`       | Addition                |
    | `subtract()`  | Subtraction             |
    | `multiply()`  | Multiplication          |
    | `divide()`    | Division                |
    | `remainder()` | Modulus                 |
    | `pow(int)`    | Power                   |
    | `gcd()`       | Greatest Common Divisor |
    | `abs()`       | Absolute value          |
    | `negate()`    | Negation                |
    | `compareTo()` | Compare two numbers     |
    | `equals()`    | Equality check          |
    | `max()`       | Larger value            |
    | `min()`       | Smaller value           |
    | `intValue()`  | Convert to int          |
    | `longValue()` | Convert to long         |
*/

import java.math.BigInteger;

public class _02CommonMethod{
    public static void main(String[] args){
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("98765432109876543210");

        System.out.println("Addition: " + (a.add(b)));
        System.out.println("Subtraction: " + b.subtract(a));
        System.out.println("Multiplication: " + a.multiply(b));
        System.out.println("Division: " + b.divide(a));
        System.out.println("Remainder: " + b.remainder(a));
    }

    /*
        Addition: 111111111011111111100
        Subtraction: 86419753208641975320
        Multiplication: 1219326311370217952237463801111263526900
        Division: 8
        Remainder: 900000000090
    */
}