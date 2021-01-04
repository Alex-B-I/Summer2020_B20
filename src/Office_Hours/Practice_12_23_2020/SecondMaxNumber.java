package Office_Hours.Practice_12_23_2020;

import java.util.Arrays;

public class SecondMaxNumber {
    /*
    [3,5,1,4,12,4,1,8,12]

    max: 12
    second max: 8

     */
    public static void main(String[] args) {


        System.out.println(getSecondMaxNumber(3,5,1,4,12,4,1,8,12));
    }

    public static int getSecondMaxNumber(int ... arr){   // var args - variable arguments

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int eachNum: arr) {

            if (eachNum>max){
                second = max;
                max = eachNum;
            }

            if (eachNum>second && eachNum<max){
                second = eachNum;

            }

        }

        return second;
    }
}
