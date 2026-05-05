package _04StringBuilderAndStringBufferClasses;

public class _01ModifyingString{
    public static void main(String[] args) {
        /*
        StringBuilder provide several overload methods to append boolean, char, char[], double, float, int, long and String into String StringBuilder.

        following StringBuilder methods for modification:
            • append(data: char[]): StringBuilder
            • append(data: char[], offset: int, len: int): StringBuilder
            • append(v: aPrimitiveDataType); StringBuilder 
            • append(s: String): StringBuilder
            
            • delete(StartIndex: int, endIndex: int); StringBuilder
            • deleteCharAt(index: int): StringBuilder
        
            • insert(index: int, data: char[], offset: int, len: int): StringBuilder
            • insert(offset: int, b: aPrimitiveDataType): StringBuilder
            • insert(offset: int, s: String): StringBuilder
            
            • replace(StartIndex: int, endIndex: int, s: String): StringBuilder
            • reverse(): StringBuilder

            • setCharAt(index: int, ch: char): void
        */
        StringBuilder sb = new StringBuilder("Hello");

/* append()*/
        // append(char[])
        char[] arr = {' ', 'W', 'o', 'r', 'l', 'd'}; 
        sb.append(arr);
        System.out.println(sb); // Hello World
        
        // append(char[], offset, len)
        sb.append(arr,1,3);
        System.out.println(sb); // Hello WorldWor

        // append(primitive)
        sb.append(100);
        System.out.println(sb); // Hello WorldWor100

        // append(String)
        sb.append("Java");
        System.out.println(sb); // Hello WorldWor100Java

/*delete*/
        // delete(StartIndex, endIndex);
        sb.delete(5, 10 );
        System.out.println(sb); // HellodWor100Java

        // deleteCharAt(index)
        sb.deleteCharAt(5);
        System.out.println(sb); // HelloWor100Java

/*insert*/
        // insert(index, char[], offset, len)
        sb.insert(5,arr,1,4);
        System.out.println(sb); // HelloWorlWor100Java

        // insert(offset, primitive)
        sb.insert(16, 16);
        System.out.println(sb); // HelloWorlWor100J16ava

        // insert(offset, string)
        sb.insert(3, "fun");
        System.out.println(sb); // HelfunloWorlWor100J16ava
/*replace*/
        // replace(start, end, string)
        sb.replace(6, 11, " do it "); // Helfun do it lWor100J16ava
        System.out.println(sb);

/*reverse*/
        // reverse()
        sb.reverse();
        System.out.println(sb); // ava61J001roWlroWolnufleH

/*setCharAt*/
        sb.setCharAt(2, 'a');
        System.out.println(sb); // ava61J001roWl ti od nufleH

    }
}