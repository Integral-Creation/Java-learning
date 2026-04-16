package _04PassingArrayToMethod;

public class _03swapArrayValue {
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2};
        swap(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
