package day62_MapTasks;

import java.util.*;
import java.util.stream.Collectors;

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
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);
        System.out.println("number = " + number);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("square = " + square);

        // create a list of String
        List<String> names = Arrays.asList("Reflection","Collection","Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println("result = " + result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println("show = " + show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println("squareSet = " + squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println("even = " + even);


    }


}
