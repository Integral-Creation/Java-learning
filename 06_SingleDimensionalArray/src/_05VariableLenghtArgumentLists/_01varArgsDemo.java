package _05VariableLenghtArgumentLists;

public class _01varArgsDemo {
    /*
    Variable-lenghts argument in java allows method to accept multiple number of argument of same data type,
    using syntax ellipis(...)
        Syntax:
            dataTypeName... paramerterName

    java treats varargs as an array.
    */
    public static void printMax(int... num){
        if(num.length == 0){
            System.out.println("No argument is passed");
            return;
        }
        int result = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > result){
                result =  num[i];
            }
        }
        System.out.println("the max value is: "+result);

    }
    public static void main(String[] args){
        printMax(32,2,13,45,67,85,1,45,64);
        printMax(new int[]{1,2,3,4,5,6,7,8,9});  
   }

   /*
   varargs must be last parameter
        // ✅ Valid
        static void log(String level, String... messages) { ... }

        // ❌ Invalid — varargs must be last
        static void log(String... messages, String level) { ... }
   */
}
