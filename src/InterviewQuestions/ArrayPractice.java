package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayPractice {

    public static int singleNumber(int[] nums) {
        List<Integer> no_dup_list = new ArrayList<>();
        for(int i: nums){
            if(!no_dup_list.contains(i)){
                no_dup_list.add(i);
            }else{
                no_dup_list.remove(new Integer(i));
            }
        }
        return no_dup_list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] {1,2,34,45,67,34}));
    }


}

