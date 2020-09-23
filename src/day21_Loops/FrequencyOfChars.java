package day21_Loops;

import java.util.Scanner;

public class FrequencyOfChars {


    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for(int i=0; i < str.length(); i++)

            if(!nonDup.contains(""+str.charAt(i)))

                nonDup+= ""+str.charAt(i); // chars
        // if the char is not contained in nonDup it will be add to the nonDup


        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult +=nonDup.charAt(j)+"" + count;

        }

        return expectedResult;

    }

    public static void main(String[] args) {

        System.out.println(FrequencyOfChars("hdbicbib"));

        String s = "abaababcdelkm";
        char[] c = s.toCharArray();
        int sz = c.length;
        int i = 0, j = 0, counter = 0;

        for(i = 0; i < sz; ++i){
            counter = 0;

            for(j = 0; j < sz; ++j){
                if(j < i && c[i] == c[j]){
                    break;
                }
                if(c[j] == c[i]){
                    counter++;
                }

                if(j == sz-1){
                    System.out.println("the character "+c[i]+" is present "+counter+" times");
                }
            }
        }


    }


}

