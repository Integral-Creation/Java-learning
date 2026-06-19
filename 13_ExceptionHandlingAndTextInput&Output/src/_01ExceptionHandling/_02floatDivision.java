package _01ExceptionHandling;

public class _02floatDivision {
    public static void main(String[] args) {
        float a = 1;
        float b = 0;

        System.out.println(a/b); // Output: Infinity

        /*
        here, a and b are float and java follows IEEE 754 floating points standard for float and double division.
        thus
            1.0f / 0.0f = Infinity
            -1.0f / 0.0f = -Infinity
            0.0f / 0.0f = NaN (Not a Number)

        */
    }
}
