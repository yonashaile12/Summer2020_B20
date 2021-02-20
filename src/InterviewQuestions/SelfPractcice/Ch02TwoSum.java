package InterviewQuestions.SelfPractcice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ch02TwoSum {

    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,7,4,8};
        int target = 7;

        int[] result = getTwoSum(numbers, target);
        System.out.println(result[0]+" "+result[1]);

        System.out.println(isOdd(new int[]{-1,1}));

    }

    public static int[] getTwoSum(int[] numbers, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[]{i, visitedNumbers.get(delta)};
            }
            visitedNumbers.put(numbers[i], i);
        }
        return new int [] {-1, -1};
    }

    public static boolean isOdd(int[] num) {
        Map<Integer, Integer> odd = new HashMap<>();
        Map<Integer, Integer> even = new HashMap<>();
        boolean isEqual = false;
        for(int i = 0; i< num.length; i++){
            if(num[i] % 2 != 0){
               odd.put(i,1);
            }else if(num[i] % 2 == 0){
                even.put(i, 1);
            }
        }
        System.out.println(odd);
        System.out.println(even);
        if(odd.size() == even.size()){
            isEqual=true;
        }


        return isEqual;
    }

}
