package Quiz4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "yonas");
        map.put("age", "28");
        map.put("address", "12344");

        for(Map.Entry<String, String> each:map.entrySet() ){
            System.out.println("Key is "+ each.getKey() +" Value is "+each.getValue());
        }

        int[] a = {1,2,3,4,5};
        int[] b = a.clone();
        System.out.println("b = " + Arrays.toString(b));
    }
}
