package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //            0123
        String result = "";

        /*
        for (int i =0; i<=str.length()-1; i++){
            String s = ""+str.charAt(i,i+1);
            if (!result.contains(s)){ // if the character is already contained in result, we will not..
                result += s;

            }
        }
        System.out.println(result);
          */
        for (int i =0; i<=str.length()-1; i++){
            String s = ""+str.charAt(i);
            if (result.contains(s)){ // if the character is already contained in result, we will not..
                continue;
            }
            result += s;
        }
        System.out.println(result);


    }
}
