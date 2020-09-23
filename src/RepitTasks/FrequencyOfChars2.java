package RepitTasks;

import java.util.Scanner;

public class FrequencyOfChars2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scan.nextLine();

        String nonDup = "";

        for(int i = 0; i<= str.length()-1; i++){
            String s = ""+str.charAt(i);
            if(!nonDup.contains(s)){
                nonDup += s;
            }
        }



        for(int j = 0; j <= nonDup.length()-1; j++){
            char ch = nonDup.charAt(j);
            int count = 0;

            for(int i = 0; i <= str.length()-1; i++){
                char each =  str.charAt(i);
                if(each == ch){
                    count++;
                }

            }
            System.out.println("the character "+ch+" is present "+count+" times");
        }


    }
}
