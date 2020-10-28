package Office_Hours.Practice_10_28_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountDupForAmazon {

    /*
    [ Amazon 1st round question]
     * Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their  frequency.
     *
     * -> input: "java is java language is useful java"
     * -> output:
     *   java: 3
     *   is: 2
     *   language: 1
     *   useful: 1
     */

    public static void main(String[] args) {
        countDups("java is java language is useful java");
    }
    public static void countDups(String s){

        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        //converting string to arraylist of strings

        String checked = "";

        for(String word : words) {
            if (!checked.contains(word)) {
                int frequencyOfEach = Collections.frequency(words, word); //Ready Method

                System.out.println(word + " : " + frequencyOfEach); //java : 3 is : 2 language : 1 useful : 1

                checked += word + " ";
            }
        }

    }
}
