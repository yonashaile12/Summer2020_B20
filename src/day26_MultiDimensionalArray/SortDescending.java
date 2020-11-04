package day26_MultiDimensionalArray;

import java.util.Arrays;

//  1. write a program that can sort the array in descending order
public class SortDescending {

    public static void main(String[] args) {

        int[] arr ={ 10, 11, 8, 9, 12, 5, 15};
        Arrays.sort(arr); //arr: {5, 8, 9, 10, 11, 15}
        System.out.println( Arrays.toString(arr));

        int[] desc = new int[arr.length];      // { 3, 2, 1}
            /* this is also a way to do it but it is not a good practice
            desc[0] =  arr[2];
             desc[1] =  arr[1];
             desc[2] =  arr[0];
            */

             int k = arr.length-1;
             for(int i =0; i <= desc.length-1; i++ ){ //i: 0, 1, 2
                 desc[i] =  arr[k];
                 k--; // k: 2, 1, 0
             }


        System.out.println(Arrays.toString(desc));


             int[] arr2 = {3,6,2,4,8,1,5,9};
             Arrays.sort(arr2);
             //declaring a new int array with the same length as the old one
             int[] descending = new int[arr2.length];

             int l = arr2.length-1;

             for(int j = 0; j < descending.length; j++){
                 descending[j] = arr2[l];

                 l--;
             }

        System.out.println(Arrays.toString(descending));

    }

}
