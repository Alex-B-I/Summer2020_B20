package day12_Switch_Scanner;

public class Switch_Practice1 {
    public static void main(String[] args) {
       long c = 10; //10L
       float f = 10; //10.0f
       double d = 10; // 10.0


        int num = 7;
        String result = "";

        switch (num){

            case 1:
                result = "Monday";
                break;
            case 2:
                result ="Tuesday";
                break;
            case 3:
                result ="Wednesday";
                break;
            case 4:
                result ="Thursday";
                break;
            case 5:
                result ="Friday";
                break;
            case 6:
                result ="Saturday";
                break;
            case 7:
                //System.out.println("Sunday");
                result = "Sunday";
                break;
            default:
                result = "Invalid";
                // break; optional

        }
        System.out.println(result);
    }
}
