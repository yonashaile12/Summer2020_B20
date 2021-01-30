package LeetCodePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumeral {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("romanToInt IV = " + romanToInt("IV"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please a number to reverse\n");
        int x = scanner.nextInt();
        int rev_num = 0;
        while (x != 0) {
            rev_num = rev_num * 10 + x % 10;
            x = x / 10;

        }
        System.out.println(rev_num);

        System.out.println(Arrays.toString(isNumber(3456789)));
        System.out.println(isPrefix(new String[]{"dog", "racecar", "car"}));
        String[] str3 = new String[]{"dog", "racecar", "car"};
        String str1 = str3[0].substring(0, 1);
        System.out.println(str1);

        String[] arr = {"a"};
        System.out.println(arr.length);

        System.out.println(removeElement(new int[]{1, 2, 3, 2, 4}, 2));

    }

    public static int[] isNumber(int num) {
        String temp = Integer.toString(num);
        int[] newArr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newArr[i] = temp.charAt(i) - '0';
        }

        return newArr;

    }

    public static boolean isPrefix(String[] str) {
        String s = "";
        boolean result = false;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].startsWith(str[i + 1])) {
                result = true;
            }

        }
        return result;
    }

    public static int removeElement(int[] nums, int val) {
        int len=nums.length;
        int index=0;
        int flag=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                nums[index++]=nums[i];
                flag=1;
            }
            if(nums[i]==val)
                flag=1;
        }
        if(flag==1)  return index;

        else
            return nums.length;
    }
}