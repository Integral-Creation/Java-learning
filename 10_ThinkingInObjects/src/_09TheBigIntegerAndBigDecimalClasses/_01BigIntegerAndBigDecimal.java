/*
The BigInteger and BigDecimal classes are part of the java.math package. They are used when the primitive data type are not sufficient.

    The BigInteger class
        The BigInteger represent the integer of unlimited size. It can store number much larger than the maximum value of long.

        the largest value long can store is:
            9223372036854775807

        • Instance of the BigInteger can represent an integer of any size.
        • It is used to work with factorial, cryptography or very larger number which exceeded the long's largest value.
        • It is also useful in lot of competitive programming

    Import Statement:
        import java.math.BigInteger;
*/

import java.math.BigInteger;

public class _01BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        // Creating BigInteger Objects
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");

        BigInteger c = a.multiply(b);
        System.out.println(c); 
        /*
        Output:
            18446744073709551614
        */
    }
}
