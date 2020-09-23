package RepitTasks;

import java.util.Arrays;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "AAABBBBCCCCCCDDDDDDDEEEEEEEEEEEEEE";
        String nonDup = "";

        // Remove duplicates:
        for(int i =0; i <= str.length()-1; i++ ){
            String s = ""+str.charAt(i);
            if( ! nonDup.contains(s)){
     // if the character is not already exist then we concat it to the nonDup
                nonDup += s;
            }
        }

        String result = "";

        /*
       char ch1 = nonDup.charAt(0);  // O
        int count1 = 0; //1+1=2
        for(int i = 0; i <= str.length()-1; i++){ // counting the frequnecy of ch
           char each = str.charAt(i);   // O  O  P  Q  Q
            if(each == ch1){
                count1 += 1;
            }
        }
        result +=  ""+ch1+count1;
        char ch2 = nonDup.charAt(1); // p
        int count2 = 0; //1
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);  //   O  O  P  Q  Q
            if(each == ch2){
                count2 +=1;
            }
        }
        result += ""+ch2+count2;
       char ch3 = nonDup.charAt(2); // Q
        int count3 = 0;
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);
            if(each == ch3){
                count3++;
            }
        }
        result += ""+ch3+count3;
*/

        for(int j = 0; j <= nonDup.length()-1; j++){ // looping through nonDup

            char ch1 = nonDup.charAt(j);  // nonDup chars to ch1
            int count1 = 0;
            for(int i = 0; i <= str.length()-1; i++){
           // looping through str
                char each = str.charAt(i); //and assign it to each
                if(each == ch1){
           //compares str with nonDup and count how many times it occurs
                    count1 += 1;
                }
            }
            result +=  ""+ch1+count1;

        }


        System.out.println(result); //A3B4C6D7E14

        System.out.println("same(abcd=dcba) " + same("abcd", "dcba"));

        System.out.println("the sum of the digits in number 129 is "+sumOfDigits(129));
    }

    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;


    }

    public static int sumOfDigits(int number){
        if(number < 10){
            return -1;
        }

        int sum = 0;

        while(number > 0){
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }


}
