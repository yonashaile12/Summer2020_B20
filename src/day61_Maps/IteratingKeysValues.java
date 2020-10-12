package day61_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String, LocalDate> students = new TreeMap<>();
        students.put("Hasan", LocalDate.of(1985,4,4));
        students.put("Jesus", LocalDate.of(1979,1,31));
        students.put("Muhtar",LocalDate.of(1976,5,19));
        students.put("Jesus", LocalDate.of(1979,2,28));
        students.put("Muhtar",LocalDate.of(1976,4,19));
        students.put("John",  LocalDate.of(1999,3,4));

        System.out.println(students);
        //{Hasan=1985-04-04, Jesus=1979-01-31, Muhtar=1976-05-19}
        //Set<String> keySet = students.keySet();
        for ( String each : students.keySet() ) {
            System.out.println(each); //Hasan Jesus Muhtar
        }

        for (LocalDate value : students.values()) {
            System.out.println(value);//1985-04-04, 1979-01-31, 1976-05-19
        }

        System.out.println(LocalDateTime.now());//2020-10-07 20:02:26.231

    }
}
