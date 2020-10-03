package day60_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        String str = "dddeeeebbbcccaaaadddeeeaaa"; //acde

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr));//[d, d, d, e, e, e, e, b, b, b, c, c, c, a, a, a, a, d, d, d, e, e, e, a, a, a]

        // a,b,c,d,e after moving the duplicates

        Set<String> s1 = new LinkedHashSet<>();
        s1.addAll(Arrays.asList(arr));

        System.out.println(s1);

        System.out.println("==============================================");
        String str2 = "zzzzzyyyxxxxxx";

        str2 = new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();
        //                                     to convert it to String .toString();

        System.out.println(str2);
        str2 = str2.replace("[","").replace(",","").replace("]","");

        System.out.println(str2); //[z, y, x]

        String str3 = "abcabc";
        String str4 = "cab";

        String r1 = new HashSet<>(Arrays.asList(str3.split(""))).toString().replace("[","").replace("]","").replace(",","");
        String[] r2 = str4.split("");
        str4 = new HashSet<>(Arrays.asList(r2)).toString().replace("[","").replace("]","").replace(",","");

        System.out.println(r1);
        System.out.println(str4.equals(r1));
        System.out.println("=========================================");

        String str1 = "abcabc"; //a b c
        String str5 = "cab"; //a b c

        str1 = new HashSet<>(Arrays.asList(str1.split(""))).toString().replace("[","").replace("]","").replace(",","");
        str5 = new HashSet<>(Arrays.asList(str5.split(""))).toString().replace("[","").replace("]","").replace(",","");

        System.out.println(str1.equals(str5));

        System.out.println("==========================================");
        // if the requirment does not allow temporary variables
        String x1 = "cacacabb";
        String x2 = "bbcaaaa";
        x1 = new TreeSet<>(Arrays.asList(x1.split(""))).toString();
        x2 = new TreeSet<>(Arrays.asList(x2.split(""))).toString();

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x1.equals(x2));

        System.out.println("===========================================");

        String[] names = {"Alalia","Mustafa","Elkem","Alalia","Alalia","Virginia"};
        LinkedHashSet<String> set1 = new LinkedHashSet<>(Arrays.asList(names));
        // in order to convert any collection type to an array
        names = set1.toArray(new String[0]); // converting collection typw to array toArray(new String[random number]);
        System.out.println(Arrays.toString(names));

        System.out.println("===========================================");

        String[] names2 = {"Roman","Abzal","Nurbiye","Roman","Roman","Roman","Roman", "Roman"};
        //LinkedHashSet will allow you to remove duplicates without changing the insertion
        names2 = new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String[0]);
        System.out.println(Arrays.toString(names2));

        System.out.println("===========================================");

        Integer[] numbers = {1,1,2,1,1,2,2,2,0,0,0,0,1,1,1,1,2,3,4,5,6,7,8,9};

        numbers =  new TreeSet<>( Arrays.asList(numbers) ).toArray(new Integer[0]);

        System.out.println( Arrays.toString(numbers));








    }
}
