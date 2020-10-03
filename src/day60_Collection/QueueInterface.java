package day60_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {

        Queue<Integer> q1 = new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        // does accepts duplicates and does not have index number
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(q1);

       int firstObject =  q1.poll();

        //System.out.println(firstObject); 1

        System.out.println(q1);

        q1.poll(); // it only removes the first object from the list

        System.out.println(q1);

        //q1.get(2); queue does not have index number




    }
}
