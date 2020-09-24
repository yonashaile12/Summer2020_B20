package RepitTasks;

import java.util.Arrays;
import java.util.Scanner;

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


        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11}};
        int max = arr2D[0][0];

        for(int i = 0; i <= arr2D.length-1; i++){
            int[] eachArray = arr2D[i];

            for(int j = 0; j <= eachArray.length-1; j++){
                int eachElement = eachArray[j];

                if(eachElement > max){
                    max = eachElement;
                }
            }
        }
        System.out.println(max);

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

    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                if(number == 0);
                System.out.println("ZERO");
            case 1:
                if(number == 1);
                System.out.println("ONE");
            case 2:
                if(number == 2);
                System.out.println("TWO");

            case 3:
                if(number == 3);
                System.out.println("THREE");
            case 4:
                if(number == 4);
                System.out.println("FOUR");
            case 5:
                if(number == 5);
                System.out.println("FIVE");
            case 6:
                if(number == 6);
                System.out.println("SIX");
            case 7:
                if(number == 7);
                System.out.println("SEVEN");
            case 8:
                if(number == 8);
                System.out.println("EIGHT");
            case 9:
                if(number == 9);
                System.out.println("NINE");
            case 10:
                if(number < 0);
                System.out.println("OTHER");
                break;
        }
    }

    public void isLeapYear(){
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++) {
            temp=num%i;
            if(temp==0) {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime) {
            System.out.println(num + " is a Prime Number");
        }else {
            System.out.println(num + " is not a Prime Number");
        }

    }

}
