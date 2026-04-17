package _06SearchingArray;

public class _02binarySearchApproach {
    /*
    Binary Search approch
    Binary search is a searching technique used to find an element in a sorted array by repeatedly dividing the search space into two halves.

        It is the other common search approach for a list of values in an array.
        It repeatedly dividing into half to find the target or optimal answer in logarithmic time O(log N).

        condition: 
            • array must be sorted.
        
        Algorithm:
            • Binary search divide the search space into two half by finding the middle index 'mid'.
                mid = (low + high) / 2
            • compares 'mid' with the key element.
                -> if found process terminated
                -> if not found then choose which half will be used to serach
                    + if key > arr[mid] then right half
                    + if key < arr[mid] then left half

        suppose that the array has n element.
            - after 1st comparison, n/2 elements are left for futher search;
            - after 2nd comparison, (n/2)/2 elements are left
            - for kth comparison, n/2^k elements are left
            when k = log2(n) then only one element is left in the array
            
            for worst case when using binary search approach:
                    log2(n)+1 comparison is needed to find an element
                    ex- 1024(2^10)
                        log2(2^10)+1 = 10 + 1 = 11
                    we need only 11 comparison whereas in linear search we need 1024 comparison

     */

    // method for binary search
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;

        while(high >= low){
            int mid = (low + high)/2;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key > list[mid]){
                low = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        System.out.println(binarySearch(arr, 66)); // output: 9

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr2, 7)); // output: 6

    }
    
}
