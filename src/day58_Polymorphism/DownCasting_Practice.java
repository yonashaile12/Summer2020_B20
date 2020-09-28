package day58_Polymorphism;


import day57_Polymorphism.PhoneTask.Huawei;
import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new Iphone("11","6",1000);
        //phone1.faceTiming(12344); // the reference type decides what action can be excuted
        //                                                                     ^
        Iphone iphone = (Iphone)phone1; //downcasting from child class to parent class |
        System.out.println(phone1);//Iphone{brand='Iphone', model='11', size='6', price=1000.0}
        System.out.println(iphone);//Iphone{brand='Iphone', model='11', size='6', price=1000.0}

        //phone1.faceTiming(12345);
        iphone.faceTiming(12345); //reuseabilty

        //the second way to downcasting the difference is reuseability
        ((Iphone) phone1).faceTiming(12345);

        Phone phone2 = new Samsung("S20","7",1000);

        //phone2.freezing(); // because the reference type decide which action can be implemented
        ((Samsung)phone2).freezing();// if you don't to assigne to variable you can use it like this


        //ClassCastException //unchecked exception((Iphone)phone2).faceTiming(12345);
        // facetiming is the action of Iphone, there is not IS A relation

        System.out.println("============================================");

        Phone phone3 = new Huawei("spy","7",10);
        ( (Huawei)phone3 ).stealInfo();

        //ClassCastException  ( (Iphone) phone3).faceTiming(123334);



    }
}
