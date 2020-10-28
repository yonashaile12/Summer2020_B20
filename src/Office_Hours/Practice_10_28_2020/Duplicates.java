package Office_Hours.Practice_10_28_2020;



import java.util.*;

public class Duplicates {

    /**
     Create a method will take an Integer ArrayList
     and remove any duplicates values. Return an ArrayList of unique elements.
     * -> 1,2,3,2,2,1,4
     * -> 1,2,3,4
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,23,1,4,23,5,3,5,7));
        System.out.println(Duplicates.removeDup(list));
        //System.out.println(new LinkedHashSet<>(list));


    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> nums){

        ArrayList<Integer> uniqueValues = new ArrayList<>();
        for(Integer each : nums){

            if(!uniqueValues.contains(each)){
                uniqueValues.add(each);
            }
        }
        return uniqueValues;
    }

    public static ArrayList<Integer> removeDup2(ArrayList<Integer> nums){

        new HashSet<>(nums);

        return new ArrayList<>( new LinkedHashSet<>(nums) );
    }





}
