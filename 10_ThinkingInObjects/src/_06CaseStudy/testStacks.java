/*
-------------------------------------------------
|               StackOfIntegers                |
-------------------------------------------------
| - elements : int[]                           |
| - size     : int                             |
-------------------------------------------------
| + StackOfIntegers()                          |
| + StackOfIntegers(capacity: int)             |
| + empty()              : boolean             |
| + peek()               : int                 |
| + push(value: int)     : void                |
| + pop()                : int                 |
| + getSize()            : int                 |
-------------------------------------------------
*/

class Stack{
    private int[] elements;
    private int size;

    public static final int DEFAULT_CAPACITY = 16;

    // Constructing a Stack with default capacity 16
    public Stack(){
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity){
        elements = new int[capacity];
    }

    public boolean empty(){
        return size == 0;
    }

    public int peek(){
        return size - 1;
    }

    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
    }
}
public class testStacks {
    
}
