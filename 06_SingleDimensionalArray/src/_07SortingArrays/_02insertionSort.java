package _07SortingArrays;

public class _02insertionSort {
    /*
    Insertion sort:
    Insertion sort is a simple sorting algorithm that works iteratively inserting each element of an unsorted array to 
    correct position in a sorted array.

    algorithm:
        • start with second element (assume that first element is sorted)
        • compare it with the element in left
        • shift the larger element to a right
        • insert the current element in its correct spot
        • repeat for all remaining element.

    example:
        Start:  [2 | 9  5  4  8  1  6]   sorted=1 element

        i=1, key=9   → 9 > 2, no shift needed
                [2  9 | 5  4  8  1  6]

        i=2, key=5   → 9 > 5, shift 9 right
                    → 2 < 5, stop. Insert 5
                [2  5  9 | 4  8  1  6]

        i=3, key=4   → 9 > 4, shift 9
                    → 5 > 4, shift 5
                    → 2 < 4, stop. Insert 4
                [2  4  5  9 | 8  1  6]

        i=4, key=8   → 9 > 8, shift 9
                    → 5 < 8, stop. Insert 8
                [2  4  5  8  9 | 1  6]

        i=5, key=1   → shift 9,8,5,4,2 all right
                    → Insert 1 at index 0
                [1  2  4  5  8  9 | 6]

        i=6, key=6   → shift 9,8 right
                    → 5 < 6, stop. Insert 6
                [1  2  4  5  6  8  9]  ✓
    */

    // method for sorting array
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int key = list[i]; // pick the element
            int j = i - 1; // comparining the element to the left

            for( ; j >= 0 && list[j] > key; j--){
                list[j + 1] = list[j]; // shift the larger element to the right
            }

            list[j + 1] = key; // insert the element
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,9,5,4,8,1,6};
        insertionSort(arr);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
