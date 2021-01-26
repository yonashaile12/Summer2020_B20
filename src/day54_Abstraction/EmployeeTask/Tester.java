package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public final class Tester extends Employee {

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name+" found a bug");
    }


}
