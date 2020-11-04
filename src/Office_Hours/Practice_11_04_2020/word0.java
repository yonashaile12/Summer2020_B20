package Office_Hours.Practice_11_04_2020;

import java.util.HashMap;
import java.util.Map;

public class word0 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String each : strings){
            map.put(each, 0);
        }
        return map;

    }

}
