package day34_WrapperClasses;

import java.util.Scanner;
import java.util.SortedMap;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);

        int a2=Integer.MIN_VALUE;
        System.out.println(a2);

        byte b2 = Byte.MIN_VALUE;
        System.out.println(b2);

        System.out.println("====================");

        Scanner scan = new Scanner(System.in);
        int max = Integer.MIN_VALUE;//-2147483648
        int min = Integer.MAX_VALUE;
        for (int i=1;i<=5;i++){
            System.out.println("Enter number");
            int n = scan.nextInt(); //10,15,5,12,0
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }

        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);




    }





}
