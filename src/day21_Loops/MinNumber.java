package day21_Loops;

import java.util.Scanner;
// 2. write a program that asks user to enter 5 numbers and returns the minimum number
public class MinNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE; //3

        for(int i =1; i <= 10; i++){

            System.out.println("Enter a number");
            int num = scan.nextInt(); // 50, 10, 5, 20, 3

            if(num < min){
                min = num;
            }

        }

        System.out.println("Minimum number: "+min);



    }



}
