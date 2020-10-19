package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {

        String[] friends = {"Merhaba","Rena","Gulyar","Arzugul","Rukiye"};
        LocalDate[] DOBFriends = {LocalDate.of(1989,8,23),
                LocalDate.of(1989,1,21),
                LocalDate.of(1991,12,21),
                LocalDate.of(1989,06,29),
                LocalDate.of(1985,10,13)};



        String[] classMates = {"Kalbinur","Ceren","Liza","Shakzod","Heydar"};
        LocalDate[] DOBClassMates = {LocalDate.of(1992,1,2),
                LocalDate.of(1993,3,2),
                LocalDate.of(1994,2,3),
                LocalDate.of(1992,4,5),
                LocalDate.of(1998,3,4)};

        String[] family = {"Marianna","Juan Carlos","Marissa","Javier","Cristina"};
        LocalDate[] DOBFamily = {LocalDate.of(1980,6,21),
                LocalDate.of(1977,12,8),
                LocalDate.of(1980,6,21),
                LocalDate.of(1981,2,8),
                LocalDate.of(1995,6,7)};
        List<Map<String, LocalDate>>list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));


        for(int i = 0; i < friends.length; i++){
            list.get(0).put(friends[i], DOBFriends[i]);
        }

        for(int i = 0; i <classMates.length; i++){
            list.get(1).put(classMates[i], DOBClassMates[i]);
        }

        for(int i=0; i < family.length; i++){
            list.get(2).put(family[i], DOBFamily[i]);
        }

        System.out.println(list);

    }
}
