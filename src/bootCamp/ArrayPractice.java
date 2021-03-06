package bootCamp;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    /*
    Arrays: size is fixed
    primitives & objects both supported
    can be multi-dimensional

    Wrapper Class

     */

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int [] array = new int[5];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        System.out.println(Arrays.toString(array));

     //   array[5]=6;

        array = new int[3];

        System.out.println(Arrays.toString(array));
        System.out.println("==============================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.add(6);
    //    list.remove(4); // [1, 2, 3, 4, 5]
    //    list.remove(4); // [1, 2, 3, 4]

        list.removeAll(Arrays.asList(5,6)); //[1, 2, 3, 4]

        System.out.println("list = " + list);

        // list[2] =30;

        list.set(2,30);
        System.out.println("list = " + list);


        
    }
}
