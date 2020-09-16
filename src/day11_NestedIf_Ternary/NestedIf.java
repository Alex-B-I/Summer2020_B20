package day11_NestedIf_Ternary;
/*
           90 ~ 100 ==> A
           80 ~ 89 ==> B
           70 ~ 79 ==> C
           60 ~ 69 ==> D
            0 ~ 59 ==> F
 */
public class NestedIf {
    public static void main(String[] args) {
        int score =100;
        String result = "";

        if (score>=0 && score<=100){ //valid score
            if (score>=90){
                result = "A";
            }else if (score>=80){
                result = "B";
            }else if (score>=70){
                result = "C";
            }else if (score>=60){
                result = "D";
            }else{
                result = "F";
            }

        }else{ //invalid score
            result = "Invalid";
        }

        System.out.println(result);
        System.out.println("========================");
        /*
        precondition: minimum salary of 30k
        sub condition: minimum 2 years of job history

         1 Monday
         2 Tuesday
         ............
         invalid ==> there is no such a day
         */
        int number = 6;
        String result2 = "";

        if (number>=1 && number<=7){
            if (number == 1){
                result2 = "Monday";
            }else if (number == 2){
                result2 = "Tuesday";
            }else if (number == 3){
                result2 = "Wednesday";
            }else if (number == 4){
                result2 = "Thursday";
            }else if (number == 5){
                result2 = "Friday";
            }else if (number == 6){
                result2 = "Saturday";
            }else{
                result2 = "Sunday";
            }

        }else{
            result2 = "There is no such a day";
        }
        System.out.println(result2);


    }
}
