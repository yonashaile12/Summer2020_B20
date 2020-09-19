package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Cristina");
        System.out.println(employee1);
        System.out.println("========================================");

        Employee employee2 = new Employee("Selman", "QA");
        System.out.println(employee2);
        System.out.println("=========================================");

        Employee employee3 = new Employee("Liliia", "SDET", 123456);
        System.out.println(employee3);
        System.out.println("==========================================");

        Employee employee4 = new Employee("Alex", "SDET", 123456, 135000.5);
        System.out.println(employee4);
        System.out.println("===========================================");

        ArrayList<Integer> list = new ArrayList<>(); // this one is a default constructor

        ArrayList<Integer> list2 = new ArrayList<>(list); // this one is a constructor with parameter

        ArrayList<Integer> list3 = new ArrayList<>( Arrays.asList(1,2,3,4,5) );
    }
}
