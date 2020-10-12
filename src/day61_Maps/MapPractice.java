package day61_Maps;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Double> employees = new LinkedHashMap<>();
        //              key       value
        employees.put("Elvira", 150000.0);
        employees.put("Ziiadin", 120000.50);
        employees.put("Roman", 130000.0);
        employees.put("Cihan",140000.0);
        employees.put("Nurbiye",120000.0);

        //value can be duplicated but the key cannot be duplicated

            //                          key      value
        System.out.println(employees);//{Elvira=100000.0}
        System.out.println(employees.size()); //returns how many pairs of data that you have 1
        //  the get method returns the value of the key get(key)
        System.out.println("Salary of Ziiadin: "+employees.get("Ziiadin"));//Salary of Ziiadin: 120000.0

        employees.remove("Ziiadin");
        System.out.println(employees);

        System.out.println(employees.size());

        System.out.println(employees.containsKey("Roman"));
        System.out.println(employees);

        System.out.println(employees.containsValue(120000.0)); //

        System.out.println(employees.containsValue(150000.0));
        employees.clear();
        System.out.println(employees.size()); //0
        System.out.println(employees.isEmpty());//true

    }
}
