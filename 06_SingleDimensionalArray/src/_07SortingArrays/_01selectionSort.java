package _07SortingArrays;

public class _01selectionSort {
    /*
    Selecton sort
    Selection sort is a comparison based sorting algorithm. It sort by repeatedly selecting the smallest element from
    unsorted array and swap it with the first element of the unsorted element.

    Algorithm:
        • finds the smallest number in the list and swaps it with the first element
        • it then find the second smallest number and swaps it with the second element and so on.

    ex-                             +         +
                                    2 9 5 4 8 1 6
        select 1(smallest number) 
        and swaps it the 2(first) 
        in the list
                                      +       +
                                    1 9 5 4 8 2 6
        select 2 (smallest in remaining)
        and swaps it with 9
                                        + +  
                                    1 2 5 4 8 9 6
        select 4 (smallest in remaining)
        and swaps it with 5

                                    1 2 4 5 8 9 6
        select 5 (already smallest)
        no change
                                            +   +
                                    1 2 4 5 8 9 6
        select 6 (smallest in remaining)
        and swaps it with 8
                                              + +
                                    1 2 4 5 6 9 8
        select 8 (smallest in remaining)
        and swaps it with 9

                                    1 2 4 5 6 8 9
    */
    // method for selection sort
    public static void selectionSort(int[] list){
        for(int i = 0; i < list.length - 1; i++){
            int currentMin = list[i];
            int currentIndex = i;

            for(int j = i + 1; j < list.length; j++){
                if(list[j] < currentMin){
                    currentMin = list[j];
                    currentIndex = j;
                }
            }

            if(currentIndex != i){
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
        for(int i : list){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        selectionSort(arr);
    }
}
