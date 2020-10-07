package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {
        String str = null; // it does not refer to any object
        //System.out.println(str.toUpperCase()); //NullPointerException
        String[] names = {"Dawud","Selman","Aslan","Aslan","Aslan","Aslan","Aslan","Aslan"};
        // none of them accepts duplicates and does not have index number
        Set<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(names));
        System.out.println("hash Set: " + hashSet); //[null, Selman, Dawud, Aslan]
        //System.out.println(hashSet.get(2)); set does not have index number

        System.out.println("======================================================");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(names)); //keeps the assertion order as it is
        System.out.println("linked Hash Set: " + linkedHashSet);//[null, Dawud, Selman, Aslan]


        System.out.println("=======================================================");
        Set<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(names)); //NullPointerException the null keyWord gives you this exception
        System.out.println("tree Set: " + treeSet);
        //after removing the null keyWord from names [Aslan, Dawud, Selman] it sorted as ascending order


    }

}
