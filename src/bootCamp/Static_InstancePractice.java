package bootCamp;

class Person{
    /*
    instance: name, age, gender
    static  : common features for ex: numberOfHands
     */

    public String name;
    public int age;
    public char gender;
    // instance block
    {
        name = "gelila";
        age = 25;
        gender = 'F';
    }

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static boolean isHuman ;
    public static int numberOfEyes;

    static {
        isHuman = true;
        numberOfEyes = 2;
    }

    public  void printName(){
       System.out.println(name); //you can not use instance inside a static method
        System.out.println(Person.isHuman);

    }


 }


public class Static_InstancePractice {
    public static void main(String[] args) {
        Person person1 = new Person("Gelila", 23,'F');
        Person person2 = new Person("Yonas", 22, 'M');
        System.out.println(person1.name);
        System.out.println(person2.name);

//        System.out.println(person1.numberOfEyes);
//        System.out.println(person2.numberOfEyes);
        System.out.println(Person.numberOfEyes); // you have to call them through the class name



    }
}
