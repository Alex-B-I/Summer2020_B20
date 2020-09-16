package day20_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 1; // 5*4*3*2*1=120

        for (int i = scan.nextInt(); i>=1;i--){//i: 5, 4, 3, 2, 1
            result *= i;

        }
        System.out.println(result);
    }
}
