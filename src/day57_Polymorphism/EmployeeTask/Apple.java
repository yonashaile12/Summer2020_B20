package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester1 = new Tester("Yonas",12345432,"SDET",120000,'M');
        Employee tester2 = new Tester("musa Moya",1232231,"SDET",12000,'M');
        Employee developer1 = new Developer("Gelila",1545927,"Developer",160000,'F');

        Employee  developer2 = new Developer("Hajar",1947964,"Developer",1345500,'M');

        Employee scrumMaster1 = new ScrumMaster("musa",78965,"Srum Master",12000,'M');

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,developer1,developer2,scrumMaster1));

        for(Employee each :scrumTeam){
            System.out.println(each);
        }

    }
}
