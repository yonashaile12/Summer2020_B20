package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getInteger(5);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Element "+ i +", typed value was "+myIntegers[i] );
        }
        System.out.println("The average is "+getAverage(myIntegers));
        System.out.println("The maximum number is "+maxNum(myIntegers));
        System.out.println("The minmum number is "+minNum(myIntegers));
        System.out.println("My sorted Array is "+Arrays.toString(sortIntegers(myIntegers)));
    }


    public static int[] getInteger(int number){
        System.out.println("Enter "+ number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;

        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }

        return (double)sum/(double)array.length;
    }

    public static int maxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int minNum(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

   public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.println("Element "+ i +" contents "+ array[i]);
        }
   }

   public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    //assigning the minimum value to temp
                    sortedArray[i] = sortedArray[i+1];
                    // assigning the max value to the first array
                    sortedArray[i+1] = temp;
                    //assigning back the temp to highest value
                    flag= true;
                }
            }
        }
      return sortedArray;
   }
}
