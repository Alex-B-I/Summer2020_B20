package day12_Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 65;
        String ageGroup = "";

        if (age>=1 && age <=150){
           /*
            if (age<21){
                ageGroup = "Teenager";
            }else if (age<=55){ //age >=21 && age <=55
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

            */

            ageGroup = (age<21)? "Teenager" : (age<=55)? "Adult": "Senior";

        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);

    }
}
