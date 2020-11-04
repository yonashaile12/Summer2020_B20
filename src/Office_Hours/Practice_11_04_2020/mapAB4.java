package Office_Hours.Practice_11_04_2020;

import java.util.Map;

public class mapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")){

            String aValue = map.get("a");
            String bValue = map.get("b");

            if(aValue.length() == bValue.length()){
                map.put("a", "");
                map.put("b", "");
            }else {
                // lengths have to be different in else block
                String cValue = aValue.length() > bValue.length() ? aValue: bValue;

                map.put("c", cValue);
            }

        }
        return map;
    }
}
