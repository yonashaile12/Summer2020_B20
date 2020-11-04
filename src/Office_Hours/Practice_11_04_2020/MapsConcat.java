package Office_Hours.Practice_11_04_2020;

import java.util.Map;

public class MapsConcat {

    public Map<String, String> mapAB(Map<String, String> map) {

        String aValue = map.get("a");
        String bValue = map.get("b");

        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", aValue + bValue);
        }
        return map;
    }
}
