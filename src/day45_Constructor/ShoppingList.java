package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {


    public static void main(String[] args) {
        Item item1 = new Item("Eggs",2.86,2);
        Item item2 = new Item("Milk",2.65,5);
        Item item3 = new Item("Avocado",1.05,4);
        Item item4 = new Item("Orange",1.63,2);
        Item item5 = new Item("Water",0.99,1);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        System.out.println("Items:"+list.size());
        double totalCost = 0;

        for (Item each:list){
            totalCost+=each.calcCost();
        }

        System.out.println("Total cost: $"+totalCost);
        System.out.println("===============================================");

        Item[] items = {item1,item2,item3,item4,item5};
        double totalCost2=0;

        for (int i = 0; i<= items.length-1;i++){
            totalCost2 +=items[i].calcCost();
        }

        System.out.println("Total cost: $"+totalCost2);

/*
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item5);

 */





    }

}
