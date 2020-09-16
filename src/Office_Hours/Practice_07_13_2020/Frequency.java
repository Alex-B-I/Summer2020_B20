package Office_Hours.Practice_07_13_2020;

public class Frequency {
    public static void main(String[] args) {
        String str = "OOPQQ"; //"02P1Q2"
        String nonDup = "";   //"OPQ"

        for (int i = 0; i<=str.length()-1;i++){

            String s =""+str.charAt(i); // O O P Q Q

            if (!nonDup.contains(s)){// if the character is not already exist
                nonDup +=s;
            }

         }
        System.out.println(nonDup);
        String result = ""; //O2P1Q2

        // nonDup = "OPQ"          str = "OOPQQ"          ====> O2P1Q2
/*
        char ch1 = nonDup.charAt(0);  //O
        int count1 = 0; // 1 + 1 = 2

        for (int i =0; i<=str.length()-1;i++){ //counting the frequency

            char each = str.charAt(i); // O O P Q Q
            if(each==ch1){
                count1++;
            }
        }
        result +=""+ch1+count1;

        char ch2 = nonDup.charAt(1);  //O
        int count2= 0; // 1 + 1 = 2

        for (int i =0; i<=str.length()-1;i++){
            char each = str.charAt(i); // O O P Q Q
            if(each==ch2){
                count2++;
            }
        }
        result +=""+ch2+count2;


        char ch3 = nonDup.charAt(2);  //O
        int count3= 0; // 1 + 1 = 2

        for (int i =0; i<=str.length()-1;i++){
            char each = str.charAt(i); // O O P Q Q
            if(each==ch3){
                count3++;
            }
        }
        result +=""+ch3+count3;
        System.out.println(result);

 */

        System.out.println("============");

        for (int j = 0; j<=nonDup.length()-1;j++){

            char ch1 = nonDup.charAt(j);  //O
            int count1 = 0; // 1 + 1 = 2

            for (int i =0; i<=str.length()-1;i++){ //counting the frequency

                char each = str.charAt(i); // O O P Q Q
                if(each==ch1){
                    count1++;
                }
            }
            result +=""+ch1+count1;
        }

        System.out.println(result);






    }
}
