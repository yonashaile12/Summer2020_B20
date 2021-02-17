package OfficeHoursWithSaim.day1;

import java.util.*;

public class arrayPractice {

    public static void main(String[] args) {
        /*
        collection: a collection single data types
        List
               ArrayList  ordered List, index, store duplicate
                |____ get()
               LinkedList ordered list, index, store duplicate
                ^
                |___ Doubly Linked remove and add methods are fast
        Set  ---> SortedSet -->> TreeSet
                HashSet -- > set does not store duplcates
        Queue -->
                Deque

         dictionary
         Map -- key and value
            HashMap
         */


        List<Integer> col = new ArrayList<>();
        col.addAll(Arrays.asList(1,2,3,4,45,5,5,6));
        System.out.println(col);
        Collections.sort(col);
        System.out.println(col);


        Deque<Integer> dque = new ArrayDeque<>();

        dque.add(1);
        dque.add(3);
        dque.add(4);
        dque.add(6);
        dque.add(8);
        dque.add(10);
        dque.add(12);

        System.out.println(dque);

        System.out.println(dque.pop());

        System.out.println("dque.peek() = " + dque.peek());

        System.out.println(dque.pollLast());

        Map<String, Integer> map = new HashMap<>();
        map.put("Gelila", 33);
        map.put("Yonas", 35);
        map.put("Fitsum", 38);
        map.put("Abiy", 32);
        map.put("Danny", 35);
        map.put("Boni", 38);

        for(Map.Entry<String, Integer> each: map.entrySet()){
            if(each.getKey().contains("A")){
                each.setValue(null);
            }
        }
        System.out.println(map);

        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkPangram(str));
        System.out.println("The quick brown fox jumps over the lazy dog = " + reverse(str));
//        System.out.println("isPalindrome(\"Level\") = " + isPalindrome("Level"));

        System.out.println("isPalindrome3(\"level\") = " + isPalindrome2("Level"));

        System.out.println("isPalindrome4(\"Level\") = " + isPalindrome3("Level"));

        System.out.println("isPalindrome4(\"level\") = " + isPalindrome4("level"));
    }


    public static boolean checkPangram(String str) {
        //A pangram is a sentence containing every letter in the English Alphabet (a-z).
        //Pangram example: The quick brown fox jumps over the lazy dog
        boolean[] mark = new boolean[26];

        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A' to find index.
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';
            else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
                index = str.charAt(i) - 'a';
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return (false);
        return (true);
    }

    public static String reverse(String input) {
        if (input.isEmpty()) {
            return input;
        }
        String[] arr = input.split(" ", 2);
        String firstWord = arr[0];
        String remainingSentence;
        if (arr.length == 2)
            remainingSentence = arr[1];
        else
            remainingSentence = "";
        return reverse(remainingSentence) + firstWord + " ";
    }

    public static boolean isPalindrome1(String str){
        int first = 0;
        int last = str.length()-1;

        while(first < last){
            if(str.toLowerCase().charAt(first) != str.charAt(last) ){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static boolean isPalindrome2(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if ( input.toLowerCase().charAt(i) != input.toLowerCase().charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome3(String str){

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);

    }

    public static boolean isPalindrome4(String str){
        int first = 0;
        int last = str.length()-1;

        do {
                if(str.toLowerCase().charAt(first) != str.charAt(last)){
                    return false;
                }

        }while(last < first);

        return true;

    }
}


