package day60_Collection;

import java.util.*;

public class day02 {
    public static void main(String[] args) {
        //methodLinkedList();
       // methodArrayList();
       // methodVector();
        methodStack();
    }
    public static void methodArrayList(){

        List<Integer>list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(new Integer(3));
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7));
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list2);
        list2.remove(1);                // removed the element which is in index number 1
        System.out.println(list2);
        list2.remove(new Integer(7));   // removed the first matching Object (Wrapper 7)
        System.out.println("This is from List interface"+list2);


       // list2.toArray();
        System.out.println(Arrays.toString(list2.toArray()));


    }

    public static void methodLinkedList(){
        List<Integer>list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        // System.out.println(list1);
        // list1.add(2,0);
        // System.out.println(list1);
        list1.remove(new Integer(5)); //check the condition if true removes the element
        System.out.println(list1);
        list1.remove(new Integer(6)); //condition false
        System.out.println(list1);
        list1.removeIf(p->p>2);
        System.out.println(list1);

        List<String>list2 = new LinkedList<>();
        list2.addAll(Arrays.asList("a","a","b","b"));
        list2.addAll(Arrays.asList("a","a","b","b"));
        list2.add("v");
        list2.add(0,"t");
        System.out.println(list2);

        list2.removeIf(p->p.equals("a"));

        System.out.println(list2);

    }

    public static void methodVector(){
        int a = 5;
        List<Integer> list1 = new Vector<>();
        list1.addAll(Arrays.asList(9,8,7,6,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);
        list1.removeIf(p->p<6);  // checks the condition and if true removes the element
        System.out.println(list1);

    }

    public static void methodStack(){
        List list1 = new Stack<>();
        list1.addAll(Arrays.asList(9,8,7,6,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(1,Arrays.asList("a","a","b","b"));

        System.out.println(list1);
       // list1.removeIf(p->p<6);  // checks the condition and if true removes the element
        // System.out.println(list1);

        Iterator it =list1.iterator();
        while (it.hasNext()){
            if(it.next().equals("a")){
                it.remove();
            }
        }
        System.out.println(list1);

    }


}
