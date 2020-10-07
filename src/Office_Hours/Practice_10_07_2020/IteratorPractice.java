package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        Set<Integer> st = new LinkedHashSet<>();
        st.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> it =  st.iterator();

        while( it.hasNext() ){
      // you pass boolean condition to check if there is object could be accessed

            Integer each = it.next(); //get access to the object during iteration

            if(each < 5){
                //System.out.println(each); //1234
                it.remove();
            }
        }
        System.out.println(st); //[5, 6, 7, 8, 9, 10]
        System.out.println("===============================================");


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5));


        /*
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) < 5){
                list.remove(i);
            }
        }
         */
        //list.removeIf(p->p < 5); //lamda expression internally uses iterable
       Iterator<Integer> it2 = list.iterator();
       while(it2.hasNext()){
           if(it2.next() < 7){ //[7, 8, 9]
               it2.remove();
           }
       }

        System.out.println(list);

        System.out.println("======================================================");

        String[] names = {"Gokhan","Hakki","Hakki","Hakki","Ziiadin","Ramazan","Beslan","Meerim","Ayse","Hakki"};

        Set<String> registration = new LinkedHashSet<>();
        registration.addAll(Arrays.asList(names));

        System.out.println(registration); //[Gokhan, Hakki, Ziiadin, Ramazan, Beslan, Meerim, Ayse]

        Iterator<String> it3 = registration.iterator();
        while(it3.hasNext()){
           String each = it3.next();
           if(each.contains("i")){ //[Gokhan, Ramazan, Beslan, Ayse]
               it3.remove();
           }
        }

        System.out.println(registration);


    }

}
