package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfChars2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String nonDup="";

        for (int i=0; i<=str.length()-1;i++){
            String ch = ""+str.charAt(i);

            if (nonDup.contains(ch)){
                continue;
            }else {
                nonDup +=ch;
            }
        }

        String expectedResult = ""; //"B2C2D2"

        System.out.println(nonDup);

        //str = "BBCCDD"  nonDup = "BCD" ==>"B2C2D2"

        for (int j=0; j<=nonDup.length()-1;j++) { // iterates the string nonDup


            char ch = nonDup.charAt(j); //B,C,D
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) { //returns thr frequency of each ch from string str

                if (str.charAt(i) == ch) {
                    count++;
                }


            }
            expectedResult += "" + ch + count;
        }

        /*
        char ch1 = nonDup.charAt(0); //B
            int count1 = 0;
            for (int i = 0; i <= str.length() - 1; i++) {

                if (str.charAt(i) == ch1) {
                    count1++;
                }


            }
            expectedResult += "" + ch1 + count1;

        char ch2=nonDup.charAt(1);
        int count2=0;
        for (int i = 0; i <=str.length()-1;i++){

            if (str.charAt(i)==ch2){
                count2++;
            }

        }
        expectedResult += ""+ch2+count2;
        char ch3=nonDup.charAt(2);
        int count3=0;
        for (int i = 0; i <=str.length()-1;i++){

            if (str.charAt(i)==ch3){
                count3++;
            }

        }
        expectedResult += ""+ch3+count3;

         */

        System.out.println(expectedResult);


    }
}
