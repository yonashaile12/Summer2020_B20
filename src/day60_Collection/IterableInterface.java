package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterableInterface {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));

        for(int i = 0; i < list1.size(); i++){
            if(list1.get(i) < 5){
                list1.remove(i);
            }
        }
        System.out.println(list1);

        System.out.println("============================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));
        /*
        for(Integer each :list2){
            if(each < 5){
                list2.remove(each);
            }
        }
        System.out.println(list2);//ConcurrentModificationException
 */


        System.out.println("============================================");

        list2.removeIf(p->p < 5); // internally uses the iterator
        System.out.println(list2);
        System.out.println("=============================================");


        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));
        Iterator<Integer> it = list4.iterator();

        while( it.hasNext() ){
            if(it.next() < 5){
                it.remove();
            }
        }

        System.out.println(list4);

        System.out.println("=======================================");

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,2,3,3,4));

        for(Iterator<Integer> i = list5.iterator(); i.hasNext(); ){
            if(i.next() < 5){
                i.remove();
            }
        }

        System.out.println(list5);




    }
}
