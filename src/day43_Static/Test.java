package day43_Static;

import java.util.Arrays;

import static Library.Resources.a; // only import static variable a
import static Library.Resources.*; // imports all class members from Resources class

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticBlock3.a);
        System.out.println(StaticBlock3.b);
        System.out.println(StaticBlock3.c);


        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);
        System.out.println("=====================================");

        System.out.println(a);

    }
}
