package day18_ForLoop;
/*
write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

 */
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();

        firstName.substring(0,1);
        lastName.substring(0,1);
        String initial = firstName.substring(0,1)+"."+ lastName.substring(0,1);
        initial = initial.toUpperCase();
        System.out.println(initial);

        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);
        String initial2 = ""+ch1+ch2;
               initial2 = initial2.toUpperCase();
        System.out.println(initial2);



    }
}
