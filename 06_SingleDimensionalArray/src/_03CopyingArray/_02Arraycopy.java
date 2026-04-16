package _03CopyingArray;

public class _02Arraycopy {
    public static void main(String[] args){
        /*
        another method to copy array is to use arratcopy method in java
        syntax:
            arraycopy(sourceArray, src_pos, targetArray, tar_pos, lenght);

            parameter: 
                src_pos and tar_pos indicate the starting positions in source array and target array, respectively.
                no of element copied by from the source array to target array is indicated by lenght.
        */
       int[] arrSrc = {1,2,3,4,5};
       int[] arrTar = new int[arrSrc.length];

       System.arraycopy(arrSrc, 0, arrTar, 0, arrSrc.length);

       System.out.print("target array: ");
       for(int i = 0; i < arrTar.length; i++){
        System.out.print(arrSrc[i]+" ");
       }

    }
}
