package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.*;

public class TypeCastings {

    public static void main(String[] args) {
        int a = 10;
        double b = a; // implicit casting

        Dog dog1 = new Dog("A",2,'F');
        Cat cat1 = new Cat("A",3,'F');
        //upCasting
        Animal animal = dog1; // done implicity, upcasting

        Animal animal2 = cat1;  // converting sub type to super type, implicity
        //Animal animal2 = (Animal)cat1; manually

        //WebDriver driver = new ChromeDriver();
        //driver = new FireFoxDriver();
        //ChromeDriver driver1 = new ChromeDriver();
        //WebDriver driver2 = driver1; // upcasting, implicitly done
        // there must be IS A relation

        System.out.println("=====================================");
        int x = 100;
        byte y = (byte)x; // expilict casting MUST be done Manually

        //polymorphism
        Animal animal3 = new Dog("A",3,'F');
        //casting from super type to subtype done expliclty
       //downCasting
       // animal3.bark();

        Dog dog2 =(Dog)animal3; // has to be Done Manually
        dog2.bark();

        Animal animal4 = new Cat("A",3,'F');
        //Dog dog3 = (Dog) animal4; //ClassCastException there is no IS A relation

        System.out.println("========================================");

        Iphone phone1 = new Iphone("12","6",1200);
        Phone phone2 = phone1; //upcasting, implicitly done parent class to sub class

        Phone phone3 = new Samsung("S20","9",1100);
        Samsung phone4 =(Samsung)phone3; //phone 3 is super class a parent can not never be a child manually downcasting

        phone4.freezing();

        Iphone phone5 =(Iphone)phone3; // it won't give you compile error but it will throw an exception
        // there is no IS A relation the pre-condition of casting is there must be IS A relation
        //ClassCastException

        //WebDriver driver = new ChromeDriver();
        //TakeScreenShot ts =(TakeScreenShot)driver; it will

    }
}
