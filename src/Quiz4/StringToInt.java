package Quiz4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StringToInt {

    public static void main(String[] args) {

        int[] outer = {1,2,3,4};
        int[] inner = {2,3};
        //Collections.sort();
        String[] strArr = {"A","B","C","D","E", "F","G","H","I","K","L",
                "M","N","O","P","Q","R","S","S","A","G","B","B","B"};
        System.out.println(wordCount(strArr));


        System.out.println(linearInn(outer, inner));

        String str = "g2e4l7i8l7a1";
        System.out.println( sumOfDigits(str) );


    }

    public static boolean linearInn(int[] outer, int[] inner){
        int innerIndex = 0;
        int outerIndex = 0;

        while(innerIndex < inner.length && outerIndex < outer.length){

            if(inner[innerIndex] == outer[outerIndex]){
                innerIndex++;
            }
            outerIndex++;


        }
        return innerIndex == inner.length;

    }


    public static int sumOfDigits(String str){
        int sum = 0;
        for(int i = 0; i< str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                String temp = str.substring(i, i+1);
                sum += Integer.parseInt(temp);
            }

        }
        return sum;
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s:strings) {

            if (!map.containsKey(s)) {  // first time we've seen this string
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return map;
    }

}
