package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for (int i = 10; i <=100; i+=10) {

            System.out.println("Enter a number:");
            int num = scan.nextInt(); // 10, 20, 30, 40, 50
            sum +=num;
        }
        System.out.println(sum);

    }
}
