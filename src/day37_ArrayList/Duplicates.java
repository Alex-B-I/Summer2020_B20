package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8,9,9,9,9,9,9,10,10,11,11,11));
        System.out.println(list);

        list.removeIf(p-> Collections.frequency(list,p)==1);
        System.out.println(list);

        System.out.println("==============================");
        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Canada","Bob","David","Lan","Abida","Ebrahim","Farida"));
        names.removeIf(p->p.toLowerCase().charAt(0)!=p.charAt(p.length()-1));
        System.out.println(names);

        System.out.println("==============================");
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,85,75,55,45,73,73,35,47,60));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); //90~100
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p-> p<90);
        System.out.println("Students made 'A': " +gradeOfA.size());

        ArrayList<Integer> gradeOfB = new ArrayList<>(); //80~89
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p-> p<80 || p>89);
        System.out.println("Students made 'B': " +gradeOfB.size());

        ArrayList<Integer> gradeOfC = new ArrayList<>(); //70~79
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p-> p<70 || p>79);
        System.out.println("Students made 'C': " +gradeOfC.size());

        ArrayList<Integer> gradeOfD = new ArrayList<>(); //60~69
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p-> p<60 || p>69);
        System.out.println("Students made 'D': " +gradeOfD.size());

        ArrayList<Integer> gradeOfF = new ArrayList<>(); //0~59
        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p-> p>59);
        System.out.println("Students failed: " +gradeOfF.size());

        /*
        how many students made :
        A?
        B?
        C?
        D?
        now many failed?
        DO NOT use loop
        */




    }
}
