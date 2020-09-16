package day31_Recap;
/*
1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class
 */


public class WarmupTasks {


    public static void main(String[] args) {
        String str = "aabcccd";
        //int count = frequency(str,'a');
       // System.out.println(count);
        String uniques = "";


        for (int i =0;i<=str.length()-1;i++) {
            char ch = str.charAt(i);
            int count = frequency(str,ch);
            if (count == 1) {
                uniques += ch;
            }
        }
        System.out.println(uniques);


        String str2 = "skjfbg;ksjdbajbeg";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);



    }

    public static int frequency(String str, char ch){
        int count = 0;
        for (char each:str.toCharArray()){
            if(each == ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques (String str){
        String uniques = "";
        for (int i =0;i<=str.length()-1;i++) {
            char ch = str.charAt(i);
            int count = frequency(str,ch);
            if (count == 1) {
                uniques += ch;
            }
        }
        return uniques;
    }


}