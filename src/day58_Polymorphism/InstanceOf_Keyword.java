package day58_Polymorphism;


import day55_Abstraction.ShapeTask.*;
import day55_Abstraction.ShapeTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal1 = new Animal(10,'M');
        Animal animal2 = new Dog("Winston",4,'M');
        Animal animal3 = new Cat("Kiko",2,'M');

        //verify animal3 is the object of animal class
        boolean r1 = animal3 instanceof Animal; // IS A relation
        System.out.println(r1);

        // verify animal3 is the object of Cat clas
        boolean r2 = animal3 instanceof Cat;
        System.out.println(r2);

        //verify animal3 is the object of dog class
        boolean r3 = animal3 instanceof Dog; // there is no IS A relation ==> false
        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal;
        System.out.println(r4); // true

        System.out.println(animal2 instanceof Dog);

        System.out.println(animal1 instanceof Dog); // false
        //   parent class can't be referenced to child class

        System.out.println(animal2 instanceof Cat); //false

        System.out.println("=====================================");

        Shape shape1 = new Rectangle(4,5);

        identifyShape(shape1);
        System.out.println("======================================");
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        System.out.println(equalsShapes(c1,c2));

    }
    public static void identifyShape(Shape shape){
        if(shape instanceof Circle){
            System.out.println("The shape is circle");
        }else if(shape instanceof Cylinder){
            System.out.println("The shape is cylinder");
        }else{
            System.out.println("The shape is rectangle");
        }
    }


    public static boolean equalsShapes(Shape shape1, Shape shape2){
        boolean result = false;

        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;

        if(bothCircle){
            Circle c1 = (Circle)shape1;
            Circle c2 = (Circle)shape2;
            if(c1.radius == c2.radius){
                result = true;
            }
        }

        return result;
    }


}
