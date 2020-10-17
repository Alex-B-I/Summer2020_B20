package day09_IfStatment;

import java.sql.SQLOutput;

public class Odd_Even {
    public static void main(String[] args) {

        int number = 101;

        if(number%2!=0){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

        String str1 = "Java";
        String str2 [] = {"J","a","v","a"};
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            str3 =str3+str2[i];
        }
        System.out.println(str3);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));



    }
}
