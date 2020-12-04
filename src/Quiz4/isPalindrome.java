package Quiz4;

import java.util.Scanner;

public class isPalindrome {


 public static void main(String[] args) {

     String str = "Level";

     String result = "";

     for (int i = str.length()-1; i >= 0 ;i-- ) {

         result += str.charAt(i);
     }

       if(str.equalsIgnoreCase(result)){
          System.out.println(true);
       }else{
          System.out.println(false);
       }

       Scanner scan = new Scanner(System.in);
     System.out.printf("Enter Drink Type?\n");
      int drinkType = scan.nextInt();
      if (drinkType == 1 || drinkType == 2){
          if (drinkType == 1){
              System.out.println("Selected Hot Drink");
          }else{
              System.out.println("Selected Cold Drink");
          }

      }else {
          System.out.println("Invalid!!");
      }




  }

}

