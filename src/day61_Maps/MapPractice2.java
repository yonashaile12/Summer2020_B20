package day61_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MapPractice2 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Shakhzod", 89);
        students.put("Ceren", 95);
        students.put("Fatime", 85);
        students.put("Kalbinur", 98);
        students.put("Hanna",94);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Ali",92);
        students.put("Mikri",95);
        students.put("Ali", 95 );
        students.put("Adam", 93 );
        students.put("Murat", 79 );
        students.put("Cihan", 100);
        students.put("John", 71);

       // LinkedHashMap<String, Integer> earlyBirds = new LinkedHashMap<>();
        //LinkedHashMap<String, Integer> angryBirds = new LinkedHashMap<>();

        List<String> earlyBirdsList = new ArrayList<>(); // score >= 90

        for( String  eachKey    : students.keySet()){
            Integer eachValue = students.get(eachKey);
/*
            if(eachValue >= 95){
                earlyBirds.put(eachKey, eachValue );
            }else{
                angryBirds.put(eachKey, eachValue);
            }
 */
            if(eachValue >= 90){
                earlyBirdsList.add(eachKey);
            }

        }

        System.out.println(earlyBirdsList);








    }
}
