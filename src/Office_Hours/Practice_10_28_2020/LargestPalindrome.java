package Office_Hours.Practice_10_28_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestPalindrome {

    /**
    * Create a method that will accept a String ArrayList and return the largest Palindrome String from it
    => Assume there is no Strings with the same length and there  will be at least one element
    *  --> "dad" "abcab", "racecar","cat"
    *
    *
    *
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("racecar","dad","abcab","cat","level","Kayak"));
        System.out.println(largestPalindrome(list));
    }
    public static String largestPalindrome(ArrayList<String> words){

        String largestStr =""; // dad

        for(String word : words){

            if( word.length() > largestStr.length() ){
                if(isPalindrome(word)) {
                    largestStr = word;
                }
            }

        }


        return largestStr;
    }

    private static boolean isPalindrome(String str){

        for(int i= 0; i< str.length()/2; i++){

            if(str.charAt(i) != str.charAt(str.length()-1-i) ){
                return false;
            }
        }
        return true;
    }
}
