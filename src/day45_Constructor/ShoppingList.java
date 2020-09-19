package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list

 */
public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Apple", 1,5);
        Item item2 = new Item("Orange", 2,8);
        Item item3 = new Item("Banana", 0.5,10);
        Item item4 = new Item("Lamb",5,10);
        Item item5 = new Item("IceCream",10,1);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll( Arrays.asList(item1,item2,item3, item4, item5) );

        System.out.println("Items: "+list.size());

        double totalCost = 0;

        for(Item each:list){
            totalCost += each.calcCost();
        }

        System.out.println("Total Price: "+totalCost);

        System.out.println("=========================================================");

        Item[] items = {item1, item2, item3, item4, item5};
        double totalCost2 = 0;

        for(int i = 0; i<= items.length-1; i++){
          totalCost2 += items[i].calcCost();
        }

        System.out.println("Total cost: "+totalCost2);
    }
}
