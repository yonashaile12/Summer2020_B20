package day47_Encapsulation;

public class MyCapitalOne {

    public static void main(String[] args) {

        CapitalOneEmployees employee1 = new CapitalOneEmployees("Yonas", 23,"SDET");

        employee1.setAddress("5533 N Winthrop Ave");
        employee1.setID(2345623);
        employee1.setSalary(130000);

        System.out.println(employee1.getAddress());
        System.out.println(employee1.companyName);
        System.out.println(employee1.getID());
        System.out.println(employee1.getSalary());
        System.out.println("====================================");

        System.out.println(employee1);


    }
}
