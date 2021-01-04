package InterviewQuestions.LeetCode;

import java.util.Arrays;

public class Solution1 {

    public static void rotate(int[] nums, int k) {
        int j = 0;

        while(k > 0){
            int temp = nums[nums.length-1];
            for(j = nums.length-1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[j] = temp;
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortedArray(int[] arr){
        int[] sortArr = new int[arr.length];
        for(int i =0 ; i< arr.length; i++){
            sortArr[i] = arr[i];
        }

        boolean flag = true;
        int temp;
        while(flag){
            for(int i = 0; i < sortArr.length-1; i++){
                flag = false;
                if(sortArr[i] < sortArr[i+1]){
                    temp = sortArr[i];
                    sortArr[i] = sortArr[i+1];
                    sortArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortArr;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        //rotate(nums, 3);
        int[] numbers = {50, 160, 40, 23, 200};

        System.out.println(Arrays.toString(sortedArray(numbers)));
    }

}
