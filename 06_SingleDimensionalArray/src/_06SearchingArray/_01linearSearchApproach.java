package _06SearchingArray;

public class _01linearSearchApproach {
    /*
    linear search approach compares the key element squentially with each element in the arrays.
    It continues to do so until the element is found or the array is exhausted without a match being found.
    If match is made it returns an index of the element.
    */

    // method for finding the a key in a list
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {1,2,4,6,8,10,12,24};
        int ans = linearSearch(list, 10);
        System.out.println(ans); // output: 5

    }
}
