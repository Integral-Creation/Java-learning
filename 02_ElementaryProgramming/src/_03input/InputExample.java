package _03input;

import java.util.Scanner; // Scanner is in the java.util package
public class InputExample {
    public static void main(){
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // nextByte() -reads an integer
        System.out.print("enter value (byte 1 bytes)");
        byte byteValue = input.nextByte();
        System.out.println("byte value is: "+byteValue);

        // nextShort() - reads an integer of the short type
        System.out.print("enter value (short 2 bytes)");
        short shortValue = input.nextShort();
        System.out.println("short value is: "+shortValue);

        // nextInt() -reads an integer of int type
        System.out.print("enter int (int 4 bytes)");
        int intValue = input.nextInt();
        System.out.println("int value is: "+intValue);

        // nextLong() -reads an integer of long type
        System.out.print("enter Long value (long 8 bytes)");
        long longValue = input.nextLong();
        System.out.println("Long value is: "+longValue);

        // nextFloat() -reads a number of float type
        System.out.print("enter float value (Float 4 bytes)");
        float floatValue =  input.nextFloat();
        System.out.println("Float value is"+floatValue);

        // nextDouble() -reads a string that ends before whitespaces
        System.out.print("entre double value (Double 8 bytes)");
        double doubleValue = input.nextDouble();
        System.out.println("double value is: "+doubleValue);

        input.nextLine(); // clear the input buffer

        // nextLine() -reads a line that ends when enter key is pressed
        System.out.print("enter the message:");
        String str = input.nextLine();
        System.out.println("message: "+str);


        input.close();
    }
}
