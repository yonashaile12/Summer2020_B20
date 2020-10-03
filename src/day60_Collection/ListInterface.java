package day60_Collection;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(); //get, add, remove, set, removeAll, contains,size...
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println("Array List: "+list1);
        //Array List: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        System.out.println(list1.get(2));
        //this one is the fastest because it internally uses Array


        List<Integer> list2 = new LinkedList<>(); //get, add, remove, set, removeAll, contains,size...
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(Arrays.asList(1,2,3,4,5));

        list1.add(6);

        System.out.println("Linked List: "+list2);
        //Linked List: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        //doubly linked is faster when it comes to add/remove that is the unique characteristics of LinkedList

        list2.add(6);
        System.out.println(list2.get(2));


        List<Integer> list3 = new Vector<>(); //get, add, remove, set, removeAll, contains,size...
        list3.addAll(Arrays.asList(1,2,3,4,5));
        list3.addAll(Arrays.asList(1,2,3,4,5));

        list3.add(6);

        System.out.println("Vector List: "+list3);
        //Vector List: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        System.out.println(list3.get(2));
        //synchronized used for achieving thread safety
        //thread: process of the operating system scheduling the object
        //synchronized is the unique character of Vector
        List<Integer> list4 = new Stack<>(); //get, add, remove, set, removeAll, contains,size...
        list4.addAll(Arrays.asList(1,2,3,4,5));
        list4.addAll(Arrays.asList(1,2,3,4,5,6));
        //pop is the unique action in stock
        ((Stack)list4).pop();
        System.out.println(list4);

        list4.add(6);
        System.out.println("Stack List: "+list4);
        //Stack List: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]
        System.out.println(list4.get(2));

        System.out.println("=========================================");

        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("Stack List: "+list5);

        int lastObject = list5.pop();
        System.out.println("Stack List: "+list5);

        int lastObject2 = list5.pop();
        System.out.println("Stack List: "+list5);

        System.out.println(lastObject + ""+lastObject2); //76

        list5.removeAll(Arrays.asList(1,4,5));
        System.out.println(list5);
        list5.get(1);

        int lastObject3 = list5.pop();

        System.out.println("============================================");

        int [] arr1 = {1,2,3,4};
        int[][] arr2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //Multi Dimensional

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");

        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>(); //list of list
        //l2.add("A",);
        l2.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        l2.add(new ArrayList<>());
        l2.get(1).addAll(Arrays.asList(5,6,7,8));

        l2.get(0).removeAll(Arrays.asList(1,3));
        System.out.println("Size of the first array list: "+l2.get(0).size()  );
        System.out.println("Size of the second array list: "+l2.get(1).size() );
        System.out.println(l2);

        System.out.println("==============================================");
        /*
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        List<String> group5 = new ArrayList<>();
         */

        List<List<String>> groups = new ArrayList<>();
        //groups.addAll(Arrays.asList(group1,group2,group3,group4,group5));

        groups.addAll(Arrays.asList(
                new ArrayList<>(Arrays.asList("Yonas","Anton","Sergi","Muhammed")),
                new ArrayList<>(Arrays.asList("Ziidin","Zahara","Dawud","Ramazan")),
                new ArrayList<>(Arrays.asList("Gelila","Musa","Anna","Zeki")),
                new ArrayList<>(Arrays.asList("Muthar","Nadir","Saim","Gurham"))
        ));

        System.out.println(groups);

        for (List<String> each : groups) {

        }










    }


    public void method1(){

    }

    // vector method synchronized
    public synchronized void method2(){

    }
}
