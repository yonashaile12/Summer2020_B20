package Quiz4;

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


  }

}

