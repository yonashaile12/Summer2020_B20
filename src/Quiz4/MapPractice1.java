package Quiz4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "yonas");
        map.put("age", "28");
        map.put("address", "12344");

        for(Map.Entry<String, String> each:map.entrySet() ){
            System.out.println("Key is "+ each.getKey() +" Value is "+each.getValue());
        }

        int[] a = {1,2,3,4,5};
        int[] b = a.clone();
        System.out.println("b = " + Arrays.toString(b));

        int[] nums = {1, 2, 3, 8, 9, 3, 2, 1};
        System.out.println(maxMirror(nums));
    }

    public static int maxMirror(int[] nums) {
        /*
        maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
        maxMirror([1, 2, 1, 4]) → 3
        maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2
         */
            int max = 0;

     for(int i = 0; i < nums.length; i++) {
         int count = 0;
       for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
          if(nums[i + count] == nums[j]) {
               count++;
          } else {
          max = Math.max(max, count);
          count = 0;
          }
       }

          max = Math.max(max, count);
       }

        return max;
    }
}
