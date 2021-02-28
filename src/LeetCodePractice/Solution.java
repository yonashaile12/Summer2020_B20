package LeetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {



    public int searchInsert(int[] nums, int target) {
        int i=0;               // 0
        int j=nums.length-1; // 3

        while(i<=j){  // (0 <= 3) true (0 <= 0) -->> true (0 <= 1)
            int mid = (i+j)/2;  // 1

            if(target > nums[mid]){ // 2 > 3 -->> false 2 > 3 -->> false
                i=mid+1;
            }else if(target < nums[mid]){  // 2 < 3 -->> true
                j=mid-1; // j = 1-1 == 0// 1-0 = j == 1
            }else{
                return mid;
            }
        }

        return i;
    }


    public int lengthOfLastWord(String s) {
        int len = 0;
        String x = s.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }
        return len;
    }

    public static int[] plusOne(int[] digits) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if (digits == null || digits.length == 0) {
            int[] temp = {1};
            return temp;
        }

        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                carry = carry + digits[i] + 1;
            } else {
                carry += digits[i];
            }
            result.add(0, carry % 10);
            carry /= 10;
        }

        if (carry == 1) {
            result.add(0, 1);
        }
        int resultArray[] = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
    public static String addBinary(String a, String b) {

        String result = "";
        int s = 0;

        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);

            result = (char) (s % 2 + '0') + result;

            s /= 2;

            i--;
            j--;
        }
        return result;
    }

        public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));

        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3, 4})) );

            System.out.println(addBinary("11", "1"));

            System.out.println(countEvenOdds(22333));

            //22333
            //22233
        }


    public static String countEvenOdds(int num){
        int count_even = 0;
        int count_odd = 0;
        if(num < 0) return "NO";
        while(num > 0){
            int last = num % 10; // 22333 last == 3, 3, 3, 2, 2
            if(last % 2 == 0){ //2
                count_even++;
            }else if(last % 3 == 0){
                count_odd++; //3
            }
            num /= 10;
        }

        if(count_even % 2 == 0 || count_odd % 3 == 0){
            return "YES";
        }
        return "NO";
    }

}
