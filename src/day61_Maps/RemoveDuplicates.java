package day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {
/*
3. write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order
 */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6));

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        list.clear(); //[1, 2, 3, 4, 5, 6]

        list.addAll(set);
        System.out.println(list); //[1, 2, 3, 4, 5, 6]

        System.out.println("=========================================");


    }

}
