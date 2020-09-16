package Office_Hours.Practice_08_26_2020;


import Library.Util;

public class MethodCall {

    public static void main(String[] args) {

        double[] arr1 = {1.5, 0.5, 2.5, 6.5};

        Practice2.printArray(arr1);

        String str = "AAAAABBBBBCCCCDDDDEEEEAAABBBBBCCC";
        String nonDup = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }

        }
        System.out.println(nonDup);

        String str2 = " MMMMMNNNNMMMMNNNN";

        String nonDup2 = Util.removeDup(str2);
        System.out.println(nonDup2);

    }
}
