package LeetCodePractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class twoDArray {

    public static void main(String[] args) {
        int[][] grades = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11},
                {12,13,14}
        };
        for(int row = 0; row < grades.length; row++){
            for(int col = 0; col < grades[row].length; col++){
                System.out.print(grades[row][col] + " ");
            }
        }
        System.out.println();
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList("gelila", "qako", "Amedo", "Fartawe", "Dumbass"));

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +", ");
        }
    }
}
