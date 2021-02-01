package InterviewQuestions.codingBat;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
           /*  Given an array of integers. how do you put
           zeros at the end of array without sorting an array?
         For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]*/

        for(int i = 0; i<3; i++) { //0,1,2
            for (int j = 3; j >= 0; j--) { //3,2,1
                if (i == j)
                    continue;

                System.out.print(i + "" + j);

            }
        }
        int[] arr1 = {4,5,6};
        System.out.println(maxEnd3(arr1));


            int[] arr = {4, 5, 0, 0, 2, 0, 1, 0};   //[4,5,2,1,0,0,0,0]

            int count = 0;
/*
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

        System.out.println(everyNth("gelila",2));

        System.out.println(reverStr("gelila"));

        System.out.println("remoDub(\"gelila\") = " + remoDub("aaaaaabbabbabababdudusx"));


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
    /*
    Given a non-empty string and an int N, return the string made starting
    with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ...
     and so on. N is 1 or more.
        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg"
     */
        }

    public static String everyNth(String str, int n) {

        String result = "";
        for(int i = 0; i < str.length(); i+= n){
            result+=str.charAt(i);
        }
        return result;
    }
    public static String reverStr(String str){
        //gelila --> alileg

        String result = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            result += str.charAt(i);
        }

        return result;
    }

    public static String remoDub(String str){
        String nonDup = "";
        String[] result = str.split("");//[g,e,l,i,l,a]

        for(String each: result){
            if(!nonDup.contains(each)){
                nonDup += each;
            }
        }
        return nonDup;

    }

    public static int[] maxEnd3(int[] nums) {

        int max = Integer.MIN_VALUE;
        for(int each: nums){
            if(each > max){
               max = each;
            }
        }
        int[] arr = {max, max, max};

        return arr;
    }


}
