package day18_ForLoop;

import java.util.Scanner;

/*
write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

 */
public class Revers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
               // avaJ==> ava,J;
        String s1 = str.substring(1); //"ava"

        String s2 = str.substring(0,1); // "J"
        char ch1 = str.charAt(0); // second method

        String result1 = s1+s2;
        System.out.println(result1);
        System.out.println(s1+ch1); // second method

        // programming == gnimmargorp




    }
}
