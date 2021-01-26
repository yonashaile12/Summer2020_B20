package UdemyWithTimbuchalka;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {4,2,3,5,8,9};
        reverse(array);

        System.out.println(Arrays.toString(array));

        System.out.println(reverse("Yonas"));

        StringBuffer sf = new StringBuffer();
        sf.append("Yonas");
        System.out.println(sf.reverse());

        specialChar("steu3293dhxsgv!@#,_+");

        System.out.println(reverseInt(12345));

        System.out.println(missingNumber(new int[]{1,2,3,4,5,7,8,9}));

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> lst = new ArrayList<>();
        for(int each:arr){
            lst.add(each);
        }
        System.out.println(lst.size());

        uniques("mussie");
    }


    private static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for(int i = 0; i< halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }

    private static String reverse(String str){
        String reverse = "";
        int len = str.length();

        for(int i = len-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void uniques(String str){
        String[] arr = str.split("");
        String uniques = "";

        for(int i = 0; i< arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]))
                    count++;
            }
            if (count == 1)
                uniques += arr[i];
        }
        System.out.println(uniques);

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";

    }

    private static void specialChar(String str){
     str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

     String result = str.replaceAll("[-+.^:,]","");
    }

    private static int reverseInt(int num){
        int reverse = 0;
        while(num != 0){
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }

    private static int missingNumber(int[] arr){
        int sum = 0;
        int sum1 = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int last = arr[arr.length-1] ;
        for(int j = 1; j <= last; j++){
            sum1 += j;
        }

        return sum1 - sum;
    }

    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }
}
