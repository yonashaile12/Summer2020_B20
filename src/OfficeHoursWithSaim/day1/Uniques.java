package OfficeHoursWithSaim.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Uniques {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,3,3,2,1,2,3,1));
        Set<Integer> list2 = new LinkedHashSet<>();
        list2.addAll(list1);

        System.out.println(list2);






    }
}
