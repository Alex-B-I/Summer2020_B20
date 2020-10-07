package Office_Hours.Practice_10_07_2020;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Nurbiye", "Emine", "Dawud", "Emine", "Emine"));
        System.out.println(list);

        List<String> list1 = new Vector<>();
        list1.addAll(Arrays.asList("Nurbiye", "Emine", "Dawud", "Emine", "Emine"));
        System.out.println(list1);

        List<String> list2 = new Stack<>();
        list2.addAll(Arrays.asList("Nurbiye", "Emine", "Dawud", "Emine", "Emine"));
        System.out.println(list2);


    }

}
