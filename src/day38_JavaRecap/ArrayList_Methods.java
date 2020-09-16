package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

    // add,remove,size,set,get,equals,contains,clear
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        //add(element)________________________________________________
        cars.add("BMW");

    //addAll()________________________________________________________
        cars.addAll(Arrays.asList("Mercedes","Infinity","Tesla","WV","Skoda",
                "Lamborghini","Lexus","Skoda","Skoda","Mazda"));

        System.out.println(cars);

        //remove(index or element)____________________________________
        cars.remove(3); // only element with index 3
        cars.remove("Skoda"); //only first element
        System.out.println(cars);

    //removeAll( Arrays.asList() )____________________________________
        cars.removeAll(Arrays.asList("Skoda")); //all element
        System.out.println(cars);

        // removeIf(p->....)___________________________________________
        cars.removeIf(p->p.toLowerCase().contains("m"));
        System.out.println(cars);

        cars.addAll(Arrays.asList("Mercedes","Infinity","Tesla","WV","Skoda",
                "Lamborghini","Lexus","Skoda","Skoda","Mazda"));
        System.out.println(cars);

    // retainAll( Arrays.asList() )____________________________________
        cars.retainAll(Arrays.asList("Tesla"));
        System.out.println(cars);

        System.out.println("===========================================================");

       //boolean
        ArrayList<String>groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towels","Toilet Paper","Mango","Orange","Avocado","Dragon Fruit"));

        // contains()__________________________________________________
        boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);

    // containsAll( Arrays.asList() )__________________________________
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk"));
        System.out.println(r2);
        boolean r22 = groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk","Water"));
        System.out.println(r22);

        //size()_______________________________________________________
        System.out.println("Total Number of Items: "+groceryList.size());

        //set(index,element)________________________________________________________
        groceryList.set(groceryList.size()-1,"Apple"); //change element
        System.out.println(groceryList);
        groceryList.set(groceryList.indexOf("Paper Towels"),"Dish Washer");//change element used search method  indexOf
        System.out.println(groceryList);

        //clear()_______________________________________________
        groceryList.clear();
        System.out.println(groceryList);

        System.out.println("===========================");

        //equals()
        ArrayList<String> list1 =new ArrayList<>();
        list1.add("Cybertek Shool");

        ArrayList<String> list2 =new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.equals(list2));

        System.out.println("=============================");



    }
}
