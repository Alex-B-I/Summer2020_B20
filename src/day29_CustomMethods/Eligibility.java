package day29_CustomMethods;

public class Eligibility {
    /*
    age,citizen,name
     */

    public static void eligibleToBuyAlcohol(boolean hasID,int age){
        if(hasID && age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else {
            System.out.println("You are eligible to by milk");
        }

    }


    public static void main(String[] args) {
        vote("Alex",35,true,"Donald Trump");
        vote("Muhtar",17,true,"Donald Trump");
        eligibleToBuyAlcohol(true,19);
        eligibleToBuyAlcohol(true,35);
        calculator(100,'%',20);

    }


    public static void vote(String name, int age, boolean citizen,String candidateName){

        boolean eligibleToVote = age>=18 && citizen;
        if(eligibleToVote){
            System.out.println(name+" is eligible to vote for " + candidateName);
        }else {
            System.out.println(name+ " is not eligible to vote");
        }


    }

    public static void calculator(double num1, char operator, double num2){

        // +,-,*,/,%

        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+(num1-num2));
                break;
            case '%':
                System.out.println("Reminder: "+(num1-num2));
                break;
            default:
                System.out.println("Invalid Operator");


        }

    }





}
