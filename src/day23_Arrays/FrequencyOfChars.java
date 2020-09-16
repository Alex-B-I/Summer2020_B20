package day23_Arrays;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABAB"; // "A2B2"
                             //"AB"
        String nonDup = ""; //"AB"
        String result = "";//"A2B2"

        for (int i = 0; i<=str.length()-1;i++ ){ //removing duplicates from str
            String ch =""+ str.charAt(i); //A,B,A,B

            if (!nonDup.contains(ch)){
                nonDup +=ch;
            }


        }
        System.out.println(nonDup);
        //str = "ABAB"  nonDup ="AB"

       for (int j =0; j<=nonDup.length()-1;j++) {
           char ch = nonDup.charAt(0);
           int count = 0;
           for (int i = 0; i <= str.length() - 1; i++) {
               if (str.charAt(i) == ch) {
                   count++;
               }

           }
           result += "" + ch + count;
       }


        System.out.println(result);




    }
}
