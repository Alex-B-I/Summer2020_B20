package day60_Collection;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        methodSet();
    }
    public static void methodSet(){
        Set set = new HashSet<>();


        set.addAll(Arrays.asList(1,2,3,4,5));
        set.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(set);


        Set set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add("Aras");
        set1.add("Tulpar");
        set1.add("Efe");
        set1.add("Efe");
        set1.add("Efe");
        set1.add("Efe");
        set1.add(null);
        set1.add(null);

        System.out.println(set1);

        set1.remove(1);
        System.out.println(set1);




        Set set2 = new TreeSet<>();
    }

}
