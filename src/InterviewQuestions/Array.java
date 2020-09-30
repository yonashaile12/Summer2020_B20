package InterviewQuestions;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
           /*  Given an array of integers. how do you put
           zeros at the end of array without sorting an array?
         For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]*/

        int [] arr = {4,5,0,0,2,0,1,0};   //[4,5,2,1,0,0,0,0]

        int count =0;

        for(int i=0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while(count <arr.length){
            arr[count++]=0;
        }

        for(int k=0; k<arr.length; k++){
            // System.out.print(arr[k]+" ");
        }


        System.out.println(Arrays.toString(arr)); //[4, 5, 2, 1, 0, 0, 0, 0]

        System.out.println(missingChar("Yonas",4));

        String name = "yonas";
        System.out.println(name.length());

        System.out.println(frontBack("yonas"));

        System.out.println(frontTimes(name,4));

       String result  = stringSplosion("code");
        System.out.println(result);


    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);

        String back = str.substring(n+1, str.length());

        return front + back;
    }
        // reverse string method with the length of 5
    public static String frontBack(String str) {
            if (str.length() <= 1)
                return str;

            String mid = str.substring(1, str.length()-1);

            // last + mid + first
            return str.charAt(str.length()-1) + mid + str.charAt(0);
        }


    public static String frontTimes(String str, int n) {

        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;

    }

    public static String stringSplosion(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++){
            result += str.substring(0, i+1);
        }
        return result;
    }
}
