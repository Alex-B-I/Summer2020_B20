package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
swap:
sort:
max:
min:
frequency:

 */

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90));
        //                          0  1  2  3  4  5  6  7  8
        System.out.println(list1);

        Collections.swap(list1,0,1);
        System.out.println(list1);

        Collections.swap(list1,list1.size()-1,list1.size()-2);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Integer max = Collections.max(list1);
       // int max = Collections.max(list1); unboxing
        System.out.println("Maximum number: "+max);

        Integer min = Collections.min(list1);
        System.out.println("Minimum number: "+ min);

        System.out.println("=======================================================");

        String[] arr = {"Eggs", "Orange", "Milk","Milk","Toilet paper","Toilet paper","Toilet paper","Toilet paper","Avocado"};
        ArrayList <String> items = new ArrayList<>();
        items.addAll(Arrays.asList(arr));

        System.out.println(items);
        int count = Collections.frequency(items,"Toilet paper");
        System.out.println(count);

        items.removeIf(I->Collections.frequency(items,I)==1); // removes the unique items
        items.removeIf(I->Collections.frequency(items,I)!=1); // removes the non-unique items

        System.out.println(items);



    }
}
