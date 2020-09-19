package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {
        Dog dog1 = new Dog("macha","small",3,'M',"Scottie Terrier",12);
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        Cat cat1 = new Cat("Altunhan","small",1,'F',"Angora",6);
        System.out.println(dog1);
        System.out.println(cat1);


    }
}
