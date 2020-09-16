package day38_JavaRecap;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Collection_Utility {
    public static void main(String[] args) {
        /*
        Collections.sort()
        Collections.swap()
        Collections.frequency()

        Collections.max()
        Collections.min()
        Collections.replaceAll()

         */
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','D','A','C','B'));
        System.out.println(chars);

        //Collections.sort()_____________________________________
        Collections.sort(chars);
        System.out.println(chars);

        System.out.println("=============================================================");

        ArrayList<String > students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan","Cristina","Zeliha","Iman","Fatima","Mohammad"));
        //                               0         1         2       3      4          5
        System.out.println(students);

        //Collections.swap()_____________________________________
        Collections.swap(students,1,4);
        System.out.println(students);
        Collections.swap(students,1,4);
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);

        System.out.println("=============================================================");

        //Collections.frequency()_____________________________________
        ArrayList<String > items = new ArrayList<>();
        items.addAll(Arrays.asList("Coffee","Coffee","Egg","Battery","Battery","Battery","Battery","Battery","Battery"));
        int count = Collections.frequency(items,"Battery");
        System.out.println(count);

        System.out.println("=============================================================");

        ArrayList<String > unique = new ArrayList<>();
        for (String each:items){
            int i = Collections.frequency(items,each);
            if (i==1){
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("=============================================================");

        ArrayList<String > unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p-> Collections.frequency(unique2,p)>1);
        System.out.println(unique2);

        System.out.println("=============================================================");

        //Collections.max()_____________________________________
        //Collections.min()_____________________________________
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,89,1000,2000,3000,30,40,-50));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("max: "+max);
        System.out.println("min: "+min);

        //Collections.replaceAll()_____________________________________

        Collections.replaceAll(list,1000,10000);
        System.out.println(list);






    }
}
