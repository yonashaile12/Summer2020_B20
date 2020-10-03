package day60_Collection;

import java.util.*;

public class SetInterface {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();
        // you can not create a class from Set interface
        s1.addAll(Arrays.asList(7,2,5,1,8,3,9,9,3,null)); // does not keep the insertion order
        System.out.println("HashSet: "+s1); //[1, 2, 3, 5, 7, 8, 9] sort it the insertion
        // set does not accepts duplicates


        Set<Integer> s2  = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(7,2,5,1,8,3,9,9,3,null));
        s2.addAll(Arrays.asList(8,8,8));

        System.out.println("Linked HashSet: "+s2);//[7, 2, 5, 1, 8, 3, 9] it keeps the insertion order

        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(Arrays.asList(7,1,8,9,2,6,3,5,4,1,5)); //does not accept duplicates
        //,null it does not accepts null.
        System.out.println("TreeSet: "+s3);//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        /*HashSet vs TreeSet:
         hashSet accepts null, treeSet does not accept null
        null keyword is a default value of all reference type (class/interface)
        does not refer to any objects, not an instance of anything
         */



    }
}
