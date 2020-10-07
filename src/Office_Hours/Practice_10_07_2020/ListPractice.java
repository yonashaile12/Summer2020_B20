package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Stack<>();
        List<String> list4 = new Vector<>();
        list4.addAll(Arrays.asList("Nurbiye","Emine","Dawud","Emine","Emine"));
       // you don't have to use arrays.tostring method to print out
        System.out.println(list4);

        System.out.println(list4.get(2));

        Stack<String> stack = new Stack<>();
        stack.addAll(list4);

        System.out.println(stack);//[Nurbiye, Emine, Dawud, Emine, Emine]
        stack.pop();
       // last in first out means the last string will be out whenever you call pop()
        System.out.println(stack); //[Nurbiye, Emine, Dawud, Emine]

        stack.pop();

        System.out.println(stack); //[Nurbiye, Emine, Dawud]

        stack.pop();
        System.out.println(stack);//[Nurbiye, Emine]

        stack.pop();
        System.out.println(stack);//[Nurbiye]

        stack.pop();
        System.out.println(stack);//[]
    }
}
