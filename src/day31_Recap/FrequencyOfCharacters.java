package day31_Recap;

import Library.Util;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str ="AABBBCCC";//==>A2B3C3

        String expectedResult = ""; //A2B3C3

        String nonDup = Util.removeDup(str); //ABC

        for (char  i = 0; i<=nonDup.length()-1;i++) {
            char ch = nonDup.charAt(i);
            int count = Util.frequency(str, ch);
            expectedResult += "" + ch + count;
        }
        System.out.println(expectedResult);

        System.out.println("===============");

        String str2 = "wwwwwwwwwweeeeeeeegggggggssssskkkkkk";
        String expectedResult2= frequencyOfCharacter(str2);
        System.out.println(expectedResult2);


        /*
            for (char  each:nonDup.toCharArray()) {
                 int count = Util.frequency(str, each);
                    expectedResult += "" + each + count;
             }
             System.out.println(expectedResult);

         */

        /*
        char ch1 = nonDup.charAt(0);
        int count = Util.frequency(str, ch1);
        expectedResult += "" + ch1 + count;

        char ch2 = nonDup.charAt(1);
        int count2 = Util.frequency(str, ch2);
        expectedResult += "" + ch2 + count2;

        char ch3 = nonDup.charAt(2);
        int count3 = Util.frequency(str, ch3);
        expectedResult += "" + ch3 + count3;
        System.out.println(expectedResult);

 */
    }

public static String frequencyOfCharacter(String str){
    String expectedResult = "";
    String nonDup = Util.removeDup(str);
    for (char  each:nonDup.toCharArray()) {
        int count = Util.frequency(str, each);
        expectedResult += "" + each + count;
    }
    return expectedResult;
}


}