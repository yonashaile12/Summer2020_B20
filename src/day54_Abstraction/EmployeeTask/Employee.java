package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
    1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize lal those attributes
                        (even final variable you should initialize them within constructor)
            Action:

    2. create a sub class of Employee named Tester(meant to be subClass ONLY)
    3. create a sub class of Employee named Developer(meant to be subClass ONLY)
    4. create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees
     */
public class Employee {

    public String name;
    final public char gender;    //constant
    final public LocalDate DOfB; //constant
    public String jobTitle;
    public double salary;


    public Employee(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return  "Name: " + name +", gender: " + gender + ", DOfB=" + DOfB + ", jobTitle: " + jobTitle +  ", salary: $" + salary;
    }
}
