package RepitTasks;

public class Uniques {

    public static void main(String[] args) {
                    //01234
        String str = "ABABC"; // unique is C
        String expectedResult = ""; // where we want to store C

      for(int j = 0; j < str.length(); j++){
          char ch = str.charAt(j); // "ABABC"

          int count = 0; // frequency
          for(int i = 0; i<= str.length()-1; i++){
          // to count how many duplicates are in the given string
              char each = str.charAt(i);// "ABABC"
              if(each == ch){ // "ABABC" ==  "ABABC"
                  count++; // count the chars A2B2C1
              }


          }
          if(count == 1){ // this means uniques A2B2C1
              expectedResult += ch;
          }

      }
        System.out.println(expectedResult);
    }
}
