package _02Stack;
/*
    Stack
        stack is a linear data structure that follows LIFO principle (Last IN, First OUT)

    example:
            ┌─────┐
            │  C  │ ← Top
            ├─────┤
            │  B  │
            ├─────┤
            │  A  │
            └─────┘
    Stack basic operations
        | Operation   | Description                                 |
        | ----------- | ------------------------------------------- |
        | `push()`    | Adds an element to the top                  |
        | `pop()`     | Removes and returns the top element         |
        | `peek()`    | Returns the top element without removing it |
        | `isEmpty()` | Checks whether the stack is empty           |
        | `size()`    | Returns the number of elements              |

*/
import java.util.Stack;

public class _01Stack {
    public static void main(String[] args) {
        /* Creating a Instance of Stack */
        Stack<String> stack = new Stack<>();
        
        /**  Stack Operations*/
    /** push() */
        stack.push("Nier: Automata");
        stack.push("Witcher");
        stack.push("GTA V");
        stack.push("Call of duty");

        System.out.println(stack); // [Nier: Automata, Witcher, GTA V, Call of duty]

    /** pop() */
        stack.pop();
        System.out.println(stack); // [Nier: Automata, Witcher, GTA V]

        String game = stack.pop();
        System.out.println(game); // GTA V

    /** peek() */
        System.out.println(stack.peek()); // Witcher

    /** search() */
        System.out.println(stack.search("Nier: Automata")); // 2

    /** isempty() */
        System.out.println(stack.isEmpty()); // false

    /** size() */
        System.out.println(stack.size()); // 2
    }
}
