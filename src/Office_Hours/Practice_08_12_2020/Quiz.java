package Office_Hours.Practice_08_12_2020;

import com.sun.corba.se.impl.legacy.connection.USLPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));
        //                         0 1 2

        //int a = 1;   // index //[1, 3]
        Integer a= 1;  // Object //[2, 3]
        boolean r1 = list1.remove(a);

        System.out.println(list1); //[2, 3]
        System.out.println(r1);

        String[] names ={"Rob","Bran","Rick","Bran"};
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));

        if (namesList.remove("Bran")){
            namesList.remove("John");
        }

        System.out.println(namesList);
        System.out.println("===============================");

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("Green","Red","Blue","Yellow"));
        colors.add(3,"Cyan");

        System.out.println(colors);

        System.out.println("==========================================");

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5));
        //                         0 1 2 3 4
        /*
        list2.set(0,list2.get(4));
        list2.set(4,list2.get(0)); //[5, 2, 3, 4, 5]

         */
        Collections.swap(list2,0,list2.size()-1); //[5, 2, 3, 4, 1]

        System.out.println(list2);

        System.out.println("==========================================");

        ArrayList<Character>list = new ArrayList<>();
        for(char i='a';i<='z';i++){
            list.add(i);
        }
        System.out.println(list);

        // a,c,D
        boolean result =list.containsAll(Arrays.asList('c','d','a'));
        System.out.println(result);
        list.removeAll(Arrays.asList('g','l','r','s','t'));
        System.out.println(list);

    }
}
