package Quiz4;

import java.util.Scanner;

public class isPalindrome {


 public static void main(String[] args) {

     System.out.println(isPalindrome("Level"));

//       Scanner scan = new Scanner(System.in);
//     System.out.printf("Enter Drink Type?\n");
//      int drinkType = scan.nextInt();
//      if (drinkType == 1 || drinkType == 2){
//          if (drinkType == 1){
//              System.out.println("Selected Hot Drink");
//          }else{
//              System.out.println("Selected Cold Drink");
//          }
//
//      }else {
//          System.out.println("Invalid!!");
//      }

    }

    public static boolean isPalindrome(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0 ;i-- ) {

            result += str.charAt(i);
        }

        if(str.equalsIgnoreCase(result)){
            return true;
        }

        return false;
    }

}

