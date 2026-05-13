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
        return elements[size - 1];
    }

    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop(){
        return elements[--size];
    }

    public int getSize(){
        return size;
    }
}
public class testStacks {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for(int i = 0; i < 10; i++){
            stack.push(i);
        }

        while(!stack.empty()){
            System.out.println(stack.pop() + " ");
        }
    }
}
