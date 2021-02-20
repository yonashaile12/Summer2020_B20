package InterviewQuestions.SelfPractcice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] num1 = {1, 1, 1, 2, 1};
        int[] num2 = {2, 1, 1, 2, 1};
        int[] num3 = {10, 0, 1, -1, 10};
        int[] num4 = {1, 1, 1, 1, 4};
        int[] num5 = {2, 1, 1, 1, 4};
        int[] num6 = {2, 3, 4, 1, 2};
        System.out.println(canBalance(num1));
        System.out.println(canBalance(num2));
        System.out.println(canBalance(num3));
        System.out.println(canBalance(num4));
        System.out.println(canBalance(num5));

        System.out.println(Arrays.toString(combineTwoArrays(num2,num4)));
        System.out.println(combineTwoArrays2(num2,num4));
        System.out.println(Arrays.toString(combineTwoArrays3(num2,num4)));

    }
    public static boolean canBalance(int[] nums) {
        int left = 0;
        int right=0;
        for(int k=0;k<nums.length; k++) {
            right+=nums[k];
        }
        for(int i=0; i<nums.length-1; i++) {
            if(left!=right) {
                left+=nums[i];
                right-=nums[i];
            }
        }
        return left==right;
    }

    public static int[] combineTwoArrays(int[] num1, int[] num2){
        int[] arr = new int[num1.length + num2.length];
        int index = 0;
        for(int i = 0; i < num1.length; i++){
            arr[index] = num1[i];
            index++;
        }
        for(int j = 0; j < num2.length; j++){
            arr[index] = num2[j];
            index++;
        }
        return arr;
    }

    public static ArrayList<Integer> combineTwoArrays2(int[] num1, int[] num2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            list.add(num1[i]);
        }
        for (int j = 0; j < num2.length; j++) {
            list.add(num2[j]);
        }
        return list;
    }

    public static int[] combineTwoArrays3(int[] num1, int[] num2){
        int[] arr = new int[num1.length + num2.length];
        int index= 0;
        int i = 0;
        int j = 0;
        while(i < num1.length){
            arr[index] = num1[i];
            i++;
            index++;
        }
        while(j < num2.length){
            arr[index] = num2[j];
            j++;
            index++;
        }
        return arr;
    }
}
