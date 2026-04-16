package _03CopyingArray;

public class _01CopyingArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = new int[arr1.length];

        for(int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        for(int i: arr2){
            System.out.println(i+" ");
        }

        /*
        Note:
            list1 = list2;
            using the above statement is wrong because
            after this statement list1 and list2 reference the same array,
            it doesn't copy the content of array refer by list1.
         */
    }
}
