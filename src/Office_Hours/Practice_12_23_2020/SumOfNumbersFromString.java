package Office_Hours.Practice_12_23_2020;

import java.util.Arrays;

public class SumOfNumbersFromString {

    public static void main(String[] args) {
//        System.out.println(getSumOfNumbers("jav45ai15sgre100at82"));
//        System.out.println(getSumOfNumbers("abc12sd400sa9dhd83"));

        System.out.println(twoSum(new int[]{2,7,11,15},9));
    }

    public static int getSumOfNumbers(String str){
        // jav45ai15sgre100at82
        int sum = 0;
        String num = "";



        for(int i = 0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
               if(i == str.length()-1 || !Character.isDigit(str.charAt(i +1))){
                sum += Integer.parseInt(num);
                num = "";
               }
            }
        }
        return sum;
    }

    public static int[] twoSum(int[] nums, int target) {

        /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.
    Example 1:
        Input: nums = [2,7,11,15], target = 9
            Output: [0,1]
            Output: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        for(int i = 0; i< nums.length-1; i++){
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[i] == target){
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public int removeDuplicates(int[] nums) {
        //Given a sorted array nums, remove the duplicates
        // in-place such that each element appears only once and returns the new length.
        //Do not allocate extra space for another array, you must do
        // this by modifying the input array in-place with O(1) extra memory.
        int length = nums.length;

        if(length == 0)
            return 0;


        int targetIndex = 1;
        int OG = nums[0];

        for(int i = 1; i < length; i++){

            if(nums[i] != OG){

                OG = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }
        }

        return targetIndex;
    }

    
}
