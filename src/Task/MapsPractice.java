package Task;

import java.util.*;

public class MapsPractice {
/*
    Warmup tasks:
    1. create 3 LinkedHashMaps that contains employee name and jobTitle
    2. create a List of Map and store all LinkedHashMaps objects into the list.
    3. Iterate each objects from the list and print out the name of the employee
    if the jobTitle of the employee is SDET
*/

    public static void main(String[] args) {

        LinkedHashMap<String, String> employeeList1 = new LinkedHashMap<>();

        employeeList1.put("Yonas","SDET");
        employeeList1.put("Sergi","QA");
        employeeList1.put("Talant","Developer");


        LinkedHashMap<String, String> employeeList2 = new LinkedHashMap<>();
        employeeList2.put("Muha","SDET");
        employeeList2.put("Sinvar", "QA");
        employeeList2.put("Nazmi", "Developer");


        LinkedHashMap<String, String> employeeList3 = new LinkedHashMap<>();
        employeeList3.put("Vesile", "SDET");
        employeeList3.put("Zeyeneb", "SDET");
        employeeList3.put("Anton", "QA");

        List<Map> ListMap = new ArrayList<>();
        ListMap.addAll(Arrays.asList(employeeList1,employeeList2,employeeList3));

        for (Map<String, String> eachTeam : ListMap) {// list of maps
            for (String name : eachTeam.keySet()) { //names of each team members
                if (eachTeam.get(name).equalsIgnoreCase("SDET")) { //name(values) == SDET
                    System.out.println(name);
                }
            }
        }
        //System.out.println(ListMap);






    }


}
