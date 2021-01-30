package InterviewQuestions.LeetCode;

import java.util.Scanner;

public class FrequencyOfChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word!\t");
        String s = scan.nextLine();
        char[] c = s.toCharArray();
        int len  = c.length;
//        int i = 0, j = 0, counter = 0;
        for(int i = 0; i < len; ++i){
            int counter = 0;
            for(int j = 0; j < len; ++j){
                if(j < 0 && c[i] == c[j]){
                    break;
                }
                if(c[j] == c[i]){
                    counter++;
                }

                if(j == len-1){
                    System.out.println("the character "+c[i]+" is present "+counter+" times");
                }
            }
        }
    }


}
