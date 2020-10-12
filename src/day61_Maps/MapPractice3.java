package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String, String> countries = new LinkedHashMap<>();

        countries.put("East Turkistan","Kashgar");
        countries.put("Uzbekistan","Tashkent");
        countries.put("Kyrgyzstan","Bishkek");
        countries.put("Spain","Madrid");
        countries.put("USA","Washington");
        countries.put("Ukraine","Kiev");
        countries.put("Azerbaijan","Karabagh");
        countries.put("Turkey","Ankara");
        countries.put("NH","Concord");
        countries.put("Eritrea","Asmara");
        countries.put("Ethiopia","Addis Ababa");

        for (String eachCountry : countries.keySet()) {
             String eachCity = countries.get(eachCountry);
            System.out.println( eachCountry+"'s Capital: "+eachCity);
        }
    }
}
