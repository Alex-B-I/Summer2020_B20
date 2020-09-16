package Office_Hours.Practice_07_28_2020;

import java.util.ArrayList;

public class Methods_Practice {
    //Access-modifier Specifier Return-type Name(Parameter){Statements}
    public static void main(String[] args) {
        String name ="Alex";
        String reversedName =reverseStr(name);
        System.out.println(reversedName);
        System.out.println(reverseStr(name));
        System.out.println(reversedName.toUpperCase());
        palindrome(name);
        palindrome("Level");
        System.out.println("==================================");

        String [] names = {"Aslan","Ramazan","Alex","Erfan","Aalia","Ayhan","Bob","Anna","Layla"};
        ArrayList<String>nameList = new ArrayList<>();

        for (String each: names){
            // System.out.println(reverseStr(each));
           // palindrome(each);
            nameList.add(reverseStr(each));
        }
        System.out.println(nameList);
    }

    public static String reverseStr (String str){ //"ABC"
        String result = "";
        for (int i = str.length()-1; i>=0;i-- ){
            result +=str.charAt(i);
        }

        return result;
    }

    public static void palindrome(String str){
        String reversedStr = reverseStr(str);
        boolean palindrome = str.equalsIgnoreCase(reversedStr);
       // System.out.println(palindrome);
        System.out.println( (palindrome)? str+" Is Palindrome":str+" Is not Palindrome");

    }



}
