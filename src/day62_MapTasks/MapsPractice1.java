package day62_MapTasks;

import java.util.*;

/*
1. Write a program that stores the the character and frequency of
        each character from a String in to a Map

    Ex: "aaabbbccb"
    output:
        {a=3, b=4, c=2}
 */
public class MapsPractice1 {

    public static void main(String[] args) {

        String str = "aaabbbccb";

        List<String> list = Arrays.asList(str.split(""));

        Set<String> unique = new LinkedHashSet<>(list);

        Map<String,Integer> charMap = new LinkedHashMap<>();

        for (String eachChar : unique) {
            charMap.put(eachChar,Collections.frequency(list,eachChar));
        }
        System.out.println(charMap);

    }
}
