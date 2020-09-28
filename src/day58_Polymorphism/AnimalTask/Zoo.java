package day58_Polymorphism.AnimalTask;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston",4,'M');
        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        System.out.println("========================================");
        Animal animal1 = new Dog("Gizzly",4,'M');
        // parent class is reference type
        animal1.eat();
        animal1.sleep(); // always the overridden will be executed
        //animal.bark(); this method is not in this reference type

        //System.out.println(animal1.dogName);
        //parent class does not have the reference type means parent class
        //object type is child class
        System.out.println(animal1.age);
        System.out.println(animal1.gender);

        System.out.println(animal1);


    }
}
