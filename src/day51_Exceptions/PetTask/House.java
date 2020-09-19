package day51_Exceptions.PetTask;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston","Scotty Terrier",'M',4, "Black",200);

        System.out.println(dog1.name);
        System.out.println(dog1);

        Cat cat1 = new Cat("suzy","persian",'F',6,"Brown");
        System.out.println(cat1.name);
        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Zara","caspian",'M',12,"Brown");
        System.out.println(tiger1.name);
        System.out.println(tiger1);

        tiger1.eat();
        tiger1.drink();


    }
}
