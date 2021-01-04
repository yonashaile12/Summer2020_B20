package bootCamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsPractice {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 5){ // this is will not help remove properly
//                list.remove(i);
//            }
//        }

        list.removeIf(p->p < 5); // [5, 6, 7, 8, 9, 10, 5, 6]
        System.out.println(list);
        System.out.println("========================================================");


        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));

        Iterator<Integer> it =  numbers.iterator();
        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(numbers);//[5, 6, 7, 8, 9, 10, 5, 6]



    }
}
