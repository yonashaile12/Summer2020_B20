package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {

    public static void main(String[] args) {
        Phone[] phone = {
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Samsung("S20", "7", 1100),
                new Iphone("12", "6.1", 1000),
                new Samsung("S20", "7", 1100)
        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));

        int countIphone = 0;
        int countSamsung = 0;
        int countHuawei = 0;

        /*
        for(int i = 0; i <= phoneShop.size()-1; i++){
            Phone each = phoneShop.get(i); // gets each object from array

           if(phoneShop.get(i) instanceof Iphone){ // checks if the objects is Iphone
                countIphone++;
            }else if(phoneShop.get(i) instanceof Samsung){ // checks if the objects is Samsung
                countSamsung++;
            }else{ // checks if the objects is huawei
                countHuawei++;
            }
        }
         */

        // for each loop without curl braces
        for(Phone each: phoneShop)
            if(each instanceof Iphone)
                countIphone++;
            else if (each instanceof Samsung)
                countSamsung++;
            else
                countHuawei++;


        System.out.println("Iphone "+countIphone);
        System.out.println("Samsung "+countSamsung);
        System.out.println("Huawei "+ countHuawei);

    }
}
