package day43_Static;

import day42_Static.Tester;

public class StaticBlock2 {

    static int a;
    static String b;
    static Tester tester1;
    static Tester tester2;



    static {
        a = 100;
        b = "Cybertek";
        tester1 = new Tester();
        tester1.setInfo("Alex",'M',123,"SDET",120_000 );
        tester2 = new Tester();
        tester2.setInfo("Ahmet",'M',124,"SDET",10000);
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }

}
