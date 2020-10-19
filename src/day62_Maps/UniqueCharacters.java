package day62_Maps;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abacbdeefgghijklmmnn";
        Map<String,Integer> map = new LinkedHashMap<>(); //{c=1, d=1, f=1}

        List<String>list = Arrays.asList(str.split(""));

        for(String each : list){
            if(Collections.frequency(list,each) == 1){ //each "abacbdeef"
                map.put(each, 1);

            }
        }

        System.out.println(map);

        //verify that j is unique
        System.out.println(map.containsKey("j")); //true
        //containsValue == to check the value is unique or not



    }
}

/*
2. write a program that stores the unique characters from a string into a map

        Ex:
            str = "abacbdeef";
            output:
                {c=1, d=1, f=1}

 */
