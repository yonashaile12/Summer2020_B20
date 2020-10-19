package day62_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class SetEntryForMap {

    public static void main(String[] args) {

        //username & passwords

        Map<String, String> VyTrackCredentials = new LinkedHashMap<>();
        VyTrackCredentials.put("username1","password1");
        VyTrackCredentials.put("username2","password2");
        VyTrackCredentials.put("username3","password3");
        VyTrackCredentials.put("username4","password4");
        VyTrackCredentials.put("username5","password5");
        VyTrackCredentials.put("username6","password6");
        VyTrackCredentials.put("username7","password7");
        VyTrackCredentials.put("username8","password8");
        VyTrackCredentials.put("username9","password9");
        VyTrackCredentials.put("username10","password10");

        for(Map.Entry<String, String> each :VyTrackCredentials.entrySet() ){
            String userName = each.getKey();
            String passWord = each.getValue();

            System.out.println("Credentials Entered: "+ userName+" : "+passWord);
        }
    }
}
