package Office_Hours.Practice_12_30_2020;

import java.util.*;

public class PalinderomNumber {
    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(123));
        System.out.println(isNumberPalindrome(13531));
        System.out.println(isNumberPalindrome(1234321));
        System.out.println("isNumberPalindrome(-121) = " + isNumberPalindrome(-121));

        System.out.println(123 % 10); // 3 this is how you get the last digit
        System.out.println(45 % 10); // 5
        System.out.println("containsDuplicate(new int[]{3,2,1}) = " + containsDuplicate(new int[]{3, 3}));
        System.out.println(reverseWord("Let's take LeetCode contest"));
        System.out.println(numLess(1534236469));

        nonDuplicates("ggdgidald");

        System.out.println(nonDuplicatesStr("ggdgidald"));

        System.out.println(FrequencyOfChars("gelila"));

        String str1 = "Gelila";
        System.out.println(str1.substring(0));
        System.out.println(str1.substring(0, 1));
        System.out.println(str1.substring(1, 4));

        System.out.println(StrReverse("Yonas"));

        System.out.println(same("abc", "abb"));

        System.out.println(uniques("cincinnati"));

        System.out.println("sumOfDigits(\"ababa2012\") = " + sumOfDigits("ababa2012"));

        SortLettersAndNumbersFromString("DC501GCCCA098911");
        System.out.println(maximumNum(new int[]{2, 3, 4, 6, 78, 96, 34, 46}));
        System.out.println(minimumNum(new int[]{2, 3, 4, 6, 78, 96, 34, 46}));


//        System.out.println(Arrays.toString(combinTwoArrays(new int[]{2, 3, 4, 5, 6}, new int[]{7, 8, 9, 0, 1})));
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{2, 3, 4, 5, 6}, new int[]{7, 8, 9, 0, 1})));
        System.out.println( Arrays.toString(moveZeros (new int[]{3, 4, 0, 3, 2, 0, 7, 0, 5, 0})));

            int[] num = new int[4];
        System.out.println(Arrays.toString(num));
    }



    // 1234321
    public static boolean isNumberPalindrome(long number) {

        long reverse = 0;
        long temp = number;


        // using % 10  we can read the last digit

        while (temp != 0) {

            reverse = reverse * 10 + (temp % 10); // 0 + 1 = 1
            // 10 + 2= 12

            temp /= 10; //temp = =temp / 10
        }

        return reverse == number;

    }


    public static boolean containsDuplicate(int[] nums) {


        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

//    "Let's take LeetCode contest"
//    "s'teL ekat edoCteeL tsetnoc"

    public static String reverseWord(String s) {
        int i = 0, j = 0;
        int n = s.length();
        char[] chs = s.toCharArray();
        while (i < n && j < n) {
            while (i < n && chs[i] == ' ') {
                i++;
            }
            j = i;
            while (j < n && chs[j] != ' ') {
                j++;
            }
            reverse(chs, i, j - 1);
            i = j;
        }
        return new String(chs);
    }

    private static void reverse(char[] chs, int s, int t) {
        while (s < t) {
            char tmp = chs[s];
            chs[s] = chs[t];
            chs[t] = tmp;
            s++;
            t--;
        }


    }

    public static int numLess(int num) {
        if (num > Integer.MAX_VALUE) {
            return 0;
        }
        return num;
    }

    public static void nonDuplicates(String str) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey("" + str.charAt(i))) {
                map.put("" + str.charAt(i), 1);
            }
        }
        System.out.println(map);

    }

    public static String nonDuplicatesStr(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;

    }


    public static String FrequencyOfChars(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++)

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += "" + str.charAt(i);


        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult += nonDup.charAt(j) + "" + count;

        }

        return expectedResult;

    }


    public static String FrequencyOfChars2(String str) {

        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
//          ["g","e",]
        b = b.replace(", ", "").replace("[", "").replace("]", "");

        String result = "";

        for (int j = 0; j < b.length(); j++) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                //              (0, 1)
                if (str.substring(i, i + 1).equals("" + str.charAt(j)))

                    count++;

            }

            result += b.substring(j, j + 1) + count;

        }

        return result;

    }


    public static String linkedHashSet(String str) {

        String nonDup = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        nonDup = nonDup.replace(", ", "").replace("[", "")
                .replace(", ", "").replace("]", "");

        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (nonDup.substring(i, i + 1).equals(str.charAt(j))) {
                    count++;
                }
            }
            result += nonDup.substring(i, i + 1) + count;
        }
        return result;
    }

    public static String StrReverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)

            reverse += str.charAt(i);


        return reverse;

    }


    public static boolean same(String a, String b) {
        //"abc", "cab" -->> true
        // ch1 ['a','b','c']
        char[] ch1 = a.toCharArray();// ['a','b','c']
        char[] ch2 = b.toCharArray(); //['c','a','b']
        String str1 = "";
        String str2 = "";

        Arrays.sort(ch1);//['a','b','c']
        Arrays.sort(ch2);//['a','b', 'c']
            for (char each : ch1) {
                str1 += each;
            }

            for (char each : ch2) {
                str2 += each;
            }

            if (str1.equals(str2)) {
                return true;
            }

        return false;

    }

    public static String uniques(String str){
        String result = "";

        String[] arr = str.split(""); //"" {"c","n","t","i","c"}
        for(int i = 0; i < arr.length; i++){ // length() -->> string
            int count = 0;
            for(int j = 0; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

                if(count == 1){
                    result += arr[i];
                }

        }

        return result;
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        char[] ch = str.toCharArray(); //'2','''
        for(char each: ch){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);// 2,'4','6'
            }
        }
        return sum;

    }

    public static int sumOfDigits1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }


    public static void SortLettersAndNumbersFromString(String str) {

        String str2 = "";

        for(int i = 0; i < str.length(); i++) {

            str2 += ""+str.charAt(i);

            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {

                if(Character.isDigit(str.charAt(i+1)) ) {

                    str2 += ",";

                }

            }

            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {

                if(Character.isAlphabetic(str.charAt(i+1))) {

                    str2 +=",";

                }

            }

        }

        String[] arr = str2.split(",");

        str ="";

        for(String each: arr) {

            char[] chars=each.toCharArray();

            Arrays.sort(chars);

            for(char eachChar: chars){

                str +=""+eachChar;

            }

        }

        System.out.println(str);

    }

    public static boolean PassWordvalidation(String password) {
        /*
             1. Password MUST be at least have 6 characters and should not contain space

            2. PassWord should at least contain one upper case letter

            3. PassWord should at least contain one lowercase letter

            4. Password should at least contain one special characters

            5. Password should at least contain a digit
         */

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";



        boolean  HasLower = password.matches(lowercase);

        boolean  HasUppere = password.matches(uppercase);

        boolean  HasDigits = password.matches(numbers);

        boolean  HasSpecial = password.matches(specialchars);

        boolean  Valid = false;



        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }

    public static int maximumNum(int[] num){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++){ // 1,2,3,4,4,5,79,67
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static int minimumNum(int[] num){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];

        int i = 0; //[1,2,3,4,5] [6,7,8,9,0]

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }

    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero += (each==0)?1:0;

        }
        list.removeAll(Arrays.asList(0));
                        // 10
        arr = new int[arr.length]; // 10 -4 == 6
    //                              -4
        for(int i=0; i < arr.length-countZero; i++ ) {

            arr[i] = list.get(i); //

        }



        return arr;

    }
}