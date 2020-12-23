package Office_Hours.Practice_12_23_2020;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {

    /*
    Two Strings and if the strings are built up
    of the same characters they are anagram

    listen
    silent

    l = 0
    s = 0
    i = 0
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("Gelila", "alileg"));
    }


    public static boolean isAnagram(String one, String two){

        if(one.length() != two.length()) return false;
        one = one.toLowerCase();
        two = two.toLowerCase();

        int[] counter = new int[26];
        // a --> 0
        // b --> 1
        // z --> 25

        for(int i = 0; i< one.length();i++){

            char oneLetter = one.charAt(i);
            char twoLetter = two.charAt(i);

            //apple
            //counter[0] = counter[0] + 1;
            // a --> 97 ascii
            counter[oneLetter -97] = counter[oneLetter - 97]+ 1;
            counter[twoLetter-97] =  counter[twoLetter -97] -1;

        }
        return Arrays.equals(counter, new int[26]);

    }
}
