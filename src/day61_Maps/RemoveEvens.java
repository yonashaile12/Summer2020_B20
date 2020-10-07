package day61_Maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/*
2. write a program that can remove the even numbers from a Set of Integers
          DO NOT use Lambda expressions
 */
public class RemoveEvens {

    public static void main(String[] args) {

        Integer[] num = {111,113,100,900,90,80,76,120,55,22,23,45,65,6,9,9,9,9,9,9};

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll( Arrays.asList(num) );

        System.out.println(set);// does not accept duplicates

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            if(it.next() % 2 == 0){
                it.remove();
            }
        }

        System.out.println(set); //[111, 113, 55, 23, 45, 65, 9]






    }

}
