package bootCamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public static void main(String[] args) {
        // Map: pairs of data. Key & Value
        // for question where do you use Map is on API when getting Json Payload
        /*
        Map:
            HashMap: can have a null key, order is not guaranteed
            LinkedHashMap: can have a null key, insertion order
            TreeMap: does not have a null key, keys are sorted
            HashTable: does not have a null key, Synchronized
            most asked interview question about Map is the difference between HashMap vs HashTable
         */
        Map<String, LocalDate> employee = new LinkedHashMap<>();

        employee.put("John", LocalDate.of(2019, 5, 24));
        employee.put(null, LocalDate.of(2018, 5, 24));
        employee.put("Daniel", LocalDate.of(2017, 5, 24));
        //employee.put("Gelila", LocalDate.of(2018, 5, 24));

        System.out.println(employee);

        System.out.println(employee.get("Daniel"));
        System.out.println("===============================================");

        for(String eachKey: employee.keySet()){
            System.out.println(eachKey);
        }

        System.out.println("===============================================");

        for(LocalDate eachDate: employee.values()){
            System.out.println(eachDate);
        }
        System.out.println("================================================");
        // common interview question in Map
        for(Map.Entry<String, LocalDate> each :employee.entrySet()){
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }
    }
}
