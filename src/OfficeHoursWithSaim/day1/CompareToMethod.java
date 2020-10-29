package OfficeHoursWithSaim.day1;

import day18_ForLoop.Reverse;

import java.util.*;

public class CompareToMethod {

    public static void main(String[] args) {
        String s1 = "gelila"; // s1 comes first s2 --> negative number -18
        String s2 = "yonas";

        System.out.println(s1.compareTo(s2));

        if(s1.compareTo(s2) > 0){
            System.out.println("s2 comes first!");
        }
        else if(s1.compareTo(s2) < 0){
            System.out.println("s1 comes first!");
        }
        System.out.println("======================================================");

        System.out.println(PassWordvalidation("Mussie@yoni12"));
        System.out.println("========================================================");
          /*
    Numbers -- Swap Numbers
    Swap two variable' values without using a third variable
    int  a = 10;      int  b  = 20;
    a = a +b (10+20==30);
    b = a - b (30-20 == 10);
    a = a - b(30-10==20);
    a=20
    b=10
   Second solution
    int  a = 10;      int  b  = 20;
    a = a^b;
    b = a^b;
    a = a^b;
     */
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+ b);

        int c = 10;
        int d = 20;
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;

        System.out.println(c+" "+d);
        System.out.println("==========================================");
    /*
    Numbers -- Divisible by 3, 5, 15
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
    if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
    if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in      DivisibelBy5' section
     */

        String divisibleBy15 ="";

        String divisibleBy5 ="";

        String divisibleBy3="";

        int[] arr = new int[100];

        for(int i=0; i < arr.length; i++)

            arr[i] = i+1;



        for(int each: arr) {

            if(each %15==0 && each %3==0)

                divisibleBy15+= each+" ";

            if(each %5==0 && each % 15!=0)

                divisibleBy5 += each+" ";

            if(each%3==0 && each %15!=0)

                divisibleBy3 += each+" ";

        }

        System.out.println("Divisible By 15: "+divisibleBy15);

        System.out.println("Divisible By 5: "+divisibleBy5);

        System.out.println("Divisible By 3: "+divisibleBy3);
        System.out.println("================================================");
        //factorial test
        System.out.println(factorialNumber(4));
        System.out.println("=================================================");


        // Map -- Unique character from String
        String str = "accabbcd";
        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }




    /*
    1. Write a return method that can verify if a password is valid or not.

    requirements:

    1. Password MUST be at least have 6 characters and should not contain space

    2. PassWord should at least contain one upper case letter

    3. PassWord should at least contain one lowercase letter

    4. Password should at least contain one special characters

    5. Password should at least contain a digit
     */

    public static boolean PassWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";
        //String lowerCase ="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";



        boolean  HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars),

                Valid = false;



        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }

    //Write a return method that can concate two arrays
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

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
    //Write a method that can find the maximum number from an int Array
    public static int maxValue( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }

    //Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }



        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }

/*
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */

    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMin(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }

    public static int findMin(ArrayList<Integer> a) {

        int min =Integer.MAX_VALUE;

        for(int each: a)

            min = Math.min(min, each);

        return min;

    }
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex:  int[] arr = {10,20,7, 8, 90};

    arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
    */

    public static int[] Sort1(int[] a){

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int each: a)

            list.add(each);



        for(int i=0; i < a.length; i++) {

            a[i] = findMax(list);

            list.remove(Integer.valueOf(a[i]));

        }

        return a;

    }


    public static int findMax(ArrayList<Integer> a) {

        int max=Integer.MIN_VALUE;

        for(int each: a)

            max = Math.max(max, each);

        return max;

    }

    /*
    Write a function: that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */

    public static int[] Solution(int N){

        int[] result = new int[N];

        int sum = 0;

        for(int i=0; i < N-1; i++) {

            result[i] =i;

            sum += i;

        }

        result[N-1] = -sum;

        return result;

    }
    /*
    Array -- permutation combinations
    Given an array of 3 characters print all permutation combinations from the given characters
     */
    public static void printPermutation(char[] ch) {

        for(String s: permutation(ch))

            System.out.println(Arrays.toString( s.toCharArray( ) )  );

    }

    public static Set<String> permutation(char[] ch) {

        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");

        Set<String> set = new LinkedHashSet<>();

        if (str.length() == 1)

            set.add(str);

        else

            for (int i=0; i<str.length(); i++){

                String a3 = str.substring(0, i)+ str.substring(i+1);

                char[] ch2 = a3.toCharArray();

                for (String permutation : permutation(ch2))

                    set.add(str.charAt(i) + permutation);

            }

        return set;

    }

    /*
    Write  a method which can identifies given number is even or odd
    EX:
    identify(5) ->  "Odd"
    identify(6) ->  "Even"
     */
    public  static  String  identifyOddEven( int  n ) {

        return  n%2==0 ? "Even" : "odd" ;

    }

    /*
    Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void FINRA() {

        String result = "";

        for(int i=1; i <= 30; i++) {

            if(i % 5==0 && i %3 ==0)

                result += "FINRA ";

            else if(i%5 == 0)

                result += "RA ";

            else if(i%3==0)

                result+="FIN ";

            else

                result += i+" ";

        }

        System.out.println(result);

    }

    /*
    Write a method that can divide two numbers without using division operator
     */
    public static void devides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");

            return;

        }

        System.out.print(num1 +" devid by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count+" and remainder is "+num1);

    }



    /*
    Numbers -- Factorial Number
Write a return method that returns the factorial number of any given number
     */

    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;

        }

        return result;

    }

    /*
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
     */
    public static void solution(int N) {

        String result = "";

        for (int i = 1; i <= N; i++) {

            if(i %2 ==0 && i%3 == 0 && i %5==0)

                result += "CodilityTestCoders\n";

            else if(i %2 ==0 && i%3 == 0)

                result += "CodilityTest\n";

            else if(i % 2==0 && i %5==0)

                result += "CodilityCoders\n";

            else if(i % 3 == 0 && i % 5 ==0)

                result +="TestCoders\n";

            else if(i % 2 ==0)

                result += "Codility\n";

            else if (i % 5 == 0)

                result += "Coders\n";

            else if (i % 3 == 0)

                result += "Test\n";

            else

                result += i + "\n";

        }
        System.out.println(result);
    }

        /*
        Numbers -- Prime Number
        Write a method that can check if a number is prime or not
         */

    public static boolean primeNumber(int num) {
        boolean result = false;
        if(num <= 1) {
            return result;
        }
        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {

                return true;
            }

        }
        return result;
    }

    /*
    Numbers -- Fibonacci numbers
    Write a return method that returns the  Fibonacci of any given number
     */

    public static int fib(int num){

        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;
            j=z;
            z=result;

        }

        return result;

    }

    /*
    Numbers -- Armstrong numbers
    Write a method that can check if a number is Armstrong  number
     */

    public  static  boolean ArmStrongNumber (int  num) {
        int a = 0,    b =0,    c= num;
        while(num>0){
            a=num%10;
            num/=10;
            b=b+(a*a*a);
        }
        if(c==b) {
            return true;
        }
        return false;
    }
/*
    Number -- Reverse negative number
    Write a return method that can reverse negative number and return it as int
    Solution:
*/
    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);

    }
        /*
        Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
        Write a java operation to remove all the names named Ahmed
         */
    public static void removeName(){
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            if(it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println( names );
    }
        /*
        ArrayList -- Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        Solution 1:
         */

    public static void removeNum(){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));

        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
            if(it.next()>100)
                it.remove();
        System.out.println(list);

    }
    /*
    ArrayList -- sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using the sort method
     */

    public static void SortingArrayListAsc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }


    /*
    ArrayList -- sorting in descending order
    Write a method that can sort the ArrayList in descending order without using the sort method
     */
    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }

    /*
    Map -- Frequency of Characters
    Write a method that prints the frequency of each character from a String
     */
    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
    /*
    Map -- Min value
    Write a method that can return the minimum value from ta map (DO NOT use sort method)
     */

    public  static  int  minValue( Map<String,Integer>    map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }

    /*
    Map -- Sort the map by values
    Write a method that can sort the Map by values
     */

    public static Map<String, Integer>  sortByValue(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();

        for(Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;

    }

}
