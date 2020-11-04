package Office_Hours.Practice_11_04_2020;

import java.util.HashMap;
import java.util.Map;

public class wordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String each : strings) {
            map.put(each, each.length());
        }
        return map;
    }
}