package InterviewQuestions.codingBat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {


    public static void main(String[] args) {
        String[] strings = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(firstSwap(strings)));
        //char[] s1 = {'h','e','l','l','o'};
//        reverseString(s1);

        int a = 1234567890;
        System.out.println(reverseInt(a));
        swap(3, 4);
        System.out.println(reverseNo(345));

        System.out.println(factorialWithRecursion(13));
        swap(123, 453);

    }

    public static String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap();

        for (int i = 0; i < strings.length; i++) {

            String string = String.valueOf(strings[i].substring(0, 1));

            if (map.containsKey(string)) {
                int value = map.get(string);
                if (value == -1)
                    continue;
                int pos = map.get(string);
                String temp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = temp ;
                map.put(string, -1);
            } else
                map.put(string, i);
        }
        return strings;

    }

    public static int reverseInt(int x) {

        int ret = 0;
        boolean zero = false;
        while (!zero) {
            ret = ret * 10 + (x % 10); //1234567890 == 0 + 0 == 0,
            x /= 10;
            if(x == 0){
                zero = true;
            }
        }
        return ret;

    }

    private static void swap(int x, int y) {
        System.out.println("values before swap: " + x + " and " + y);
        // swap logic x = 123 y = 453
        x = x + y; // 123  +  453 = 576  ==  x
        y = x - y; // 576  -  453 = 123  ==  y
        x = x - y; // 576  -  123 = 453  ==  x

        System.out.println("values after swap: " + x + " and " + y);
    }

    public static int reverseNo(int number) {
        int reversed = 0;

        while(number != 0) { // 34 != 0 true -- 3 != 0 true
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return  reversed;
    }
    // with loop
    public static long factorialWithLoop(int n) {
        if(n < 0) {
            System.out.println("Negative numbers can't have factorial");
            return -9999;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    // Factorial numbers with recursive calling method inside a method
    public static long factorialWithRecursion(int n) {
        if(n < 0) {
            System.out.println("Negative nos can't have factorial");
            return -9999;
        }

        if (n <= 2) {
            return n;
        }
        return n * factorialWithRecursion(n - 1);
    }

}
