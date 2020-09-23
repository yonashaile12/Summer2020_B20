package RepitTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FrequencyOfWords {

    public static void main(String[] args) {

        String str = "dog dog dog cat cat cat cat cat cat Dog Dog Dog";
        str = str.toLowerCase();

        int countOfDog = 0; // 1+1+1

        while (str.contains("dog")) {//: true true true false

            str = str.replaceFirst("dog", "");
            //"dog dog"
            //"dog"
            //""
            countOfDog++;
        }

        int countOfCat = 0;

        while (str.contains("cat")) {
            str = str.replaceFirst("cat", "");
            countOfCat++;
        }


        System.out.println("Dog: " + countOfDog);
        System.out.println("Cat: " + countOfCat);

        System.out.println(countOfCat == countOfDog);


    }
    
}
