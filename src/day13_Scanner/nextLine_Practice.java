package day13_Scanner;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//7925Enter
        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt(); //7925

        scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println(buildingNumber+" "+streetName);
        scan.close();
    }
}
