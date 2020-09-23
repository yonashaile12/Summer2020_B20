package RepitTasks;

public class FrequencyOfChars {

    public static void main(String[] args) {
        String str = "AAABBBBCCCCCCDDDDDDDEEEEEEEEEEEEEE";
        String nonDup = "";

        // Remove duplicates:
        for(int i =0; i <= str.length()-1; i++ ){
            String s = ""+str.charAt(i);
            if( ! nonDup.contains(s)){
     // if the character is not already exist then we concat it to the nonDup
                nonDup += s;
            }
        }

        String result = "";

        /*
       char ch1 = nonDup.charAt(0);  // O
        int count1 = 0; //1+1=2
        for(int i = 0; i <= str.length()-1; i++){ // counting the frequnecy of ch
           char each = str.charAt(i);   // O  O  P  Q  Q
            if(each == ch1){
                count1 += 1;
            }
        }
        result +=  ""+ch1+count1;
        char ch2 = nonDup.charAt(1); // p
        int count2 = 0; //1
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);  //   O  O  P  Q  Q
            if(each == ch2){
                count2 +=1;
            }
        }
        result += ""+ch2+count2;
       char ch3 = nonDup.charAt(2); // Q
        int count3 = 0;
        for(int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);
            if(each == ch3){
                count3++;
            }
        }
        result += ""+ch3+count3;
*/

        for(int j = 0; j <= nonDup.length()-1; j++){ // looping through nonDup

            char ch1 = nonDup.charAt(j);  // nonDup chars to ch1
            int count1 = 0;
            for(int i = 0; i <= str.length()-1; i++){
           // looping through str
                char each = str.charAt(i); //and assign it to each
                if(each == ch1){
           //compares str with nonDup and count how many times it occurs
                    count1 += 1;
                }
            }
            result +=  ""+ch1+count1;

        }


        System.out.println(result); //A3B4C6D7E14



    }
}
