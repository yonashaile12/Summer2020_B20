package bootCamp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] array  = new int[5];
        //Arrays : size is fixed
        //Arrays : primitive and Objects are supported

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        //ArrayIndexOutOfBoundsException
        //array[5] = 6;
        System.out.println(Arrays.toString(array));

        array = new int[3];
        // [0, 0, 0] it is a new Array
        // Arrays.toString is Arrays utility class
        System.out.println(Arrays.toString(array));

        System.out.println("===========================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.add(6);
        int[] arr = new int[5];

//        list.remove(4);
//        list.remove(4);
        list.removeAll(Arrays.asList(5,6));
        System.out.println(list);
        list.set(2, 30);
        System.out.println(list);

        System.out.println(Arrays.toString(list.toArray())); // to convert arraylist to array
    }
}
