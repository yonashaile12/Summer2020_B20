package Office_Hours.Practice_12_23_2020;

import java.util.HashMap;
import java.util.Map;

public class Armstrong {

    /*

      153 -->> 1^3 5^3 3^3
      1 + 125+ 27 == 153

     */

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(370));
        System.out.println(isArmstrong(371)); // 3^ 3 + 7^3 + 1^ 1 -->27 +343+1
        System.out.println(isArmstrong(54748));
        System.out.println(isArmstrong(8208));

        StringBuffer sb = new StringBuffer();
        StringBuilder sl = new StringBuilder();
        String str = new String();
        System.out.println("twoStrings(Hello,world) = " + twoStrings("Hello", "world"));
        System.out.println("twoStrings(Hello,world) = " + twoStrings1("Hello", "why"));
    }


    public static boolean isArmstrong(int num){
        String value = String.valueOf(num);
       // String value1 = num+"";
        int power = value.length();
        int sum = 0;

        for(int i = 0; i< value.length(); i++){
            int digit = Integer.parseInt(""+value.charAt(i));
            sum += Math.pow(digit, power); // number raised to power == 1 ^3

        }
        return num == sum;
    }

//    public static vo ()  {
//        int newNumber=0;
//        int a=0;
//        int tempNumber=0;
//        int realNumber=407;
//        tempNumber=realNumber;
//        while(realNumber>0)
//        {
//            a=realNumber%10;
//            realNumber=realNumber/10;
//            newNumber=newNumber+(a*a*a);
//        }
//        if(tempNumber==newNumber)
//            System.out.println("armstrong number");
//        else
//            System.out.println("Not armstrong number");
//    }
   public static String twoStrings(String s1, String s2) {
       boolean s = false;
       String w = "";
       Map < Character , Integer > Ma = new HashMap<>();
       Map< Character, Integer> Ma1 = new HashMap<>();

       for (int i = 0 ; i < s1.length(); i++){
           Ma.put(s1.charAt(i) , 1);
       }
       for (int j = 0 ; j < s2.length(); j++){
           Ma1.put(s2.charAt(j) , 1);
       }

       for (Map.Entry<Character , Integer > entry : Ma.entrySet()){

           if (Ma1.get(entry.getKey()) != null ){
               s = true;
               break;
           }

       }
       if (s){
           w = "YES";
       }
       else {
           w = "NO";
       }
       return w;

    }

    public static String twoStrings1(String s1, String s2) {

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        for(char c : ch1){
            for(char c1: ch2){
                if(c == c1){
                    return "YES";
                }
            }
        }

        return "NO";

    }

}
