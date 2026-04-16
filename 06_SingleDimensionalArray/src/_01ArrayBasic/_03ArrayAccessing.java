package _01ArrayBasic;

public class _03ArrayAccessing {
    public static void main(String[] args) {
        /*
        to assign value to the array
        syntax:
            arrayRefVar[index] = value;
         */
        // array declaration
        int[] array;

        // array creation
        array = new int[5];

        // assign the values using the indices
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;

        /*

        contrast btw array creation in c vs java
            c               |               java
      int array[5]          |       int array = new int[5];
      create an actual array|       new int[5] create an object in the heap memory


        note:
        an array variable that appears to hold array actually contain a reference to that array.

        most of the time we ignore the distinction
        we say arr is an array
        but its arr that a variable that hold the reference of an array  of certain  datatype.

         */
    }
}
