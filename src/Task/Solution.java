package Task;

import Quiz4.count;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(countMoves(new ArrayList<>(Arrays.asList(3, 4, 6, 6, 3))));
        System.out.println(maxNum(new int[]{3, 5, 6, 2, 4, 11, 78, 98}));
    }

    public static int countMoves(List<Integer> numbers) {
        /**
         * Given an array of integers, determine the number of moves to make all elements equal. Each move consists of choosing all but 1 element and incrementing their values by 1.
         * Example
         * numbers = [3,4,6,6,3]
         * choose 4 of the 5 elements during each move and increment each of thier values by one. indexing at 1. it takes 7 moves as follows
         * unchanged
         *          Iteration                   Array
         *
         * element's index
         *     0                            [3,4,6,6,3]
         *     1                            [4,5,7,6,4]
         *     2                            [5,6,7,7,6]
         *     3                            [6,7,8,7,6]
         *     4                            [7,8,8,8,7]
         *     5                            [8,9,9,8,8]
         *     6                            [9,9,10,9,9]
         *     7                            [10,10,10,10,10]
         */
        int[] num = new int[numbers.size()];
        for(int i = 0; i< numbers.size(); i++){
            num[i] = numbers.get(i);
        }
        Arrays.sort(num);
        int total=0, least=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < least) {
                least = num[i];
            }
            total = total + num[i];
        }
        return total - least * num.length;

    }


    public static int maxNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
