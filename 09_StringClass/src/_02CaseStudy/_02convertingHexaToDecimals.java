package _02CaseStudy;

import java.util.Scanner;

/* 
Program to convert the hex to decimal.

hexadecimal:
    ex- AB8C
        10 * 16^3 + 11 * 16^2 + 8 * 16^1 + 12 * 16^0 = 43916

    General method to solve decimal:
        h(n) * 16^(n) + h(n-1) * 16^(n-1) + h(n-2) * 16^(n-2) + . . . + h1 * 16^1 + h0 * 16^0

    Horner's algorithm:
        efficient technique for evaluating polynomials by reducing the number of multiplications and additions required, typically requiring only n of each for an n-th degree polynomial.
        (. . . ( (h(n) * 16 + h(n-1)) * 16 + h(n-2) ) * 16 + . . . + h1 ) * 16 + h0


        ex -  ax³ + bx² + c = (((ax + b)x + c)x + b) -> takes x common 
*/
public class _02convertingHexaToDecimals {
    public static int hextodecimal(String hex){
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F'){
            return 10 + ch - 'A';
        }else{
            return ch - '0';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        
        String str = scanner.next();
        System.out.println(hextodecimal(str.toUpperCase()));
        scanner.close();
    }
    
}
