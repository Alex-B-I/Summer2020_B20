package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {


        ArrayList <Integer> scores = new ArrayList<>();
        scores.add(95); // autoBoxing // index 0
        scores.add(100);              // index 2
        scores.add(85);               // index 3
        scores.add(75);               // index 4
        scores.add(1,65);// index 1
        //scores.add(5,55);

        System.out.println(scores);
        //100:
        System.out.println(scores.get(2));
        System.out.println(scores.size());



    }






}
