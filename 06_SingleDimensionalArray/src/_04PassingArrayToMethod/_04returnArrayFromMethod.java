package _04PassingArrayToMethod;

public class _04returnArrayFromMethod {
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i = 0, j = list.length - 1; i < list.length; i++, j--){
            result[j] = list[i];

        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] ans = reverse(arr);

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
