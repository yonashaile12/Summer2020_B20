package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class PenFed {

    public static void main(String[] args) {
        Tester tester1=new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"SDET",150000);
        //tester1.gender = 'F'; // can only read it, cannot modify it
        //tester1.DOfB = LocalDate.of(2000,11,20); Can only read it, cannot modify it
        Developer developer1 = new Developer("Virginia", 'F',LocalDate.of(1990,11,23),"SDET",120000);
        //developer1.gender = 'M'; can only read it, cannot modify it
        //developer1.DOfB = LocalDate.of(2000,11,12); can only read it, cannot modify it

        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);
    }
}
