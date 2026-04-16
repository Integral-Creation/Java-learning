package _04PassingArrayToMethod;

public class _01passingArrayToMethod {
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        /*
        Passing an array to method, the reference is passed to a method
        */
       int[] arr = {1,2,3,4,5};
       printArray(arr);

       
    }
}
