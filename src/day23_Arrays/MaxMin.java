package day23_Arrays;

public class MaxMin {

    public static void main(String[] args) {
        int[] arr = {5,5,4,6,4,1, -100, 100, 200, 3000, -3000};
        int max = arr[0]; // 6
        int min = arr[0]; // 1

        for(int i = 1; i <= arr.length-1; i++){

            if(arr[i] > max){ // compares the array' elements, and assign the maximum number to variable max
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }

        }


        System.out.println("Max Number: "+max);
        System.out.println("Min Number: "+min);






    }


}
