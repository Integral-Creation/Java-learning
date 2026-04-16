package _01ArrayBasic;

public class _02CreatingArray {
    public static void main(String[] args) {
        /*
        declaration of an array variable does not allocate any space in memory for the array.
        it creates only a storage location for the reference to an array.
        syntax:
            arrayRefVar = new elementType[sizeOfArray];
                1. it creates an array using new elementType[array-Size]
                2. new is the object/array creation operator.
                3. it assigns the reference of the newly created array to a variable arrayRefVar.
         */
        // array declaration
        int[] array;
        // array creation
        array = new int[5];

    }
}
