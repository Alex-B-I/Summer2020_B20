package day15_String;

import java.util.Scanner;

public class Practice1_charAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();

        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName=input.next();

        char ch2 = lastName.charAt(0);

        System.out.println("Yor initial is: "+ch1+ch2);


    }
}
