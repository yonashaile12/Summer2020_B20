package Office_Hours.Practice_11_04_2020;

import java.util.Map;

public class MapContains {

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }

}
