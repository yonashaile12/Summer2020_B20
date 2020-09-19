package InterviewQuestions;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
           /*  Given an array of integers. how do you put
           zeros at the end of array without sorting an array?
         For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]*/

        int [] arr = {4,5,0,0,2,0,1,0};   //[4,5,2,1,0,0,0,0]

        int count =0;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while(count <arr.length){
            arr[count++]=0;
        }

        for(int k=0; k<arr.length; k++){
            // System.out.print(arr[k]+" ");
        }


        System.out.println(Arrays.toString(arr)); //[4, 5, 2, 1, 0, 0, 0, 0]


    }

}
