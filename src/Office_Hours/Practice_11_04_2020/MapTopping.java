package Office_Hours.Practice_11_04_2020;

import java.util.Map;

public class MapTopping {

    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread", "butter");
        // butter, bread they different
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }

        return map;
    }

}
