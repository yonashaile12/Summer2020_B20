package Office_Hours.Practice_10_11_2020;

import java.util.ArrayList;
import java.util.List;

public class DBMap {


    /*

    FIRST_NAME = James
    LAST_NAME  =  Bond
    BATCH_NUM  = 7

    FIRST_NAME = Sally
    LAST_NAME  = Rose
    BATCH_NUM  = 9

    Map<String, Object>
    map.get("FIRST_NAME") -> James
    map.get("LAST_NAME")  -> Bond


    List<Map<String, Object> > database

    list.get(index)
        list.get(0).get("FIRST_NAME") --> "James
        list.get(1).get("FIRST_NAME") --> Sally


     */

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("harry potter");
        books.add("The last Samurai");
        books.add("Game of thrones");
        books.add("the last day of Kelly");
        for(String each: books){

        }

        double pie = Math.PI;
    }

}
