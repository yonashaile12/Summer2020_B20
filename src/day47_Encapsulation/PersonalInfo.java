package day47_Encapsulation;

import java.time.LocalDate;

public class PersonalInfo {

    public static void main(String[] args) {

        Person person1 = new Person("Yonas",34,'M',LocalDate.of(1986,7,27));
        Person person2 = new Person("Gelila",36,'F', LocalDate.of(1984,5,12));
        Person person3 = new Person("Daniel",38,'M', LocalDate.of(1984,2,12));

        System.out.println(person1);
        person1.setSSN(987654321);
        person1.setID(987);
        person1.setAddress("4550 N Clarendon Ave");

        System.out.println("Address: "+person1.getAddress());
        System.out.println("ID: "+person1.getID());
        System.out.println("SSN: "+person1.getSSN());
    }
}
