package Office_Hours.Practice_12_30_2020;

import InterviewQuestions.Array;

import java.util.ArrayList;

public class PalinderomNumber {
    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(123));
        System.out.println(isNumberPalindrome(13531));
        System.out.println(isNumberPalindrome(1234321));
        System.out.println("isNumberPalindrome(-121) = " + isNumberPalindrome(-121));

        System.out.println(123 % 10); // 3 this is how you get the last digit
        System.out.println(45 % 10); // 5
        System.out.println("containsDuplicate(new int[]{3,2,1}) = " + containsDuplicate(new int[]{3, 3}));
        System.out.println(reverseWord("Let's take LeetCode contest"));
    }

    // 1234321
    public static boolean isNumberPalindrome(long number) {

        long reverse = 0;
        long temp = number;

        // using % 10  we can read the last digit

        while (temp != 0) {

            reverse = reverse * 10 + (temp % 10); // 0 + 1 = 1
            // 10 + 2= 12

            temp /= 10; //temp = =temp / 10
        }

        return reverse == number;

    }




    public static boolean containsDuplicate(int[] nums) {


        for (int i = 1; i < nums.length;  i++) {
            for (int j = 0; j < i; ++ j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

//    "Let's take LeetCode contest"
//    "s'teL ekat edoCteeL tsetnoc"

    public static String reverseWord(String s){
        int i = 0, j = 0;
        int n = s.length();
        char[] chs = s.toCharArray();
        while (i < n && j < n) {
            while (i < n && chs[i] == ' ') {
                i++;
            }
            j = i;
            while (j < n && chs[j] != ' ') {
                j++;
            }
            reverse(chs, i, j - 1);
            i = j;
        }
        return new String(chs);
    }

    private static void reverse(char[] chs, int s, int t) {
        while (s < t) {
            char tmp = chs[s];
            chs[s] = chs[t];
            chs[t] = tmp;
            s++;
            t--;
        }
    }


}
