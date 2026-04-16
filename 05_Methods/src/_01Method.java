public class _01Method {
    public static int max(int num1, int num2){
        // method body
        int result;
        if(num1 > num2){
            result = num1;
        } else{
            result = num2;
        }
        return result;
    }
    public static void main(String[] args) {
        /*
           a method in a java is a block of code that perform specific task.
           a method definition consists of its method name, parameter, return value type and body.
           syntax:
                    modifier returnValueType methodName(ListOfParameter){
                        // method body
                       }

            example:
            public static int max(int a, int b){
                //statement
            }
            1. public static    ------> method header
            2. int              ------> return type
            3. max              ------> method name
            4. (int a, int b)   ------> parameter

            // calling a method
                calling a method executes the code in method
        */

        // calling method
        int z = max(4 , 6);

        System.out.println(z);
    }
}
