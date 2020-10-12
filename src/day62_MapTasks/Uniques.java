package day62_MapTasks;

import java.util.*;

public class Uniques {

    public static void main(String[] args) {

        String str ="abacbdeef";

        List<String> list = Arrays.asList(str.split(""));

        Map<String,Integer> charMap = new LinkedHashMap<>();
        for (String eachChar : list) {
            if(Collections.frequency(list,eachChar)==1){
                charMap.put(eachChar,Collections.frequency(list,eachChar));
            }
        }
        System.out.println(charMap);
    }

}

