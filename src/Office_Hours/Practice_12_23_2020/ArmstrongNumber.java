package Office_Hours.Practice_12_23_2020;

public class ArmstrongNumber {

    /*
    153--> 1^3  5^3 3^3
    153 =   1 + 125 +27
     */
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(370));
        System.out.println(isArmstrong(372));
        System.out.println(isArmstrong(8208));
        System.out.println(isArmstrong(54748));
    }


    public static boolean isArmstrong(int num){

        String value = String.valueOf(num);
       // String value = ""+num;
        int power = value.length();

        int sum = 0;

        for (int i = 0; i < value.length(); i++) {
            int digit = Integer.parseInt(""+value.charAt(i));
            sum +=Math.pow(digit,power); // number^power==1^3

        }
        return num==sum;
    }

}
