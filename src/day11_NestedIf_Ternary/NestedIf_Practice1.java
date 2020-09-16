package day11_NestedIf_Ternary;

public class NestedIf_Practice1 {
    public static void main(String[] args) {
        double salary = 29999;
        double jobHistory = 20;


        if (salary>=30_000){
            if(jobHistory>=2){
                System.out.println("You are qualified");
            }else { //jobHistory <2
                System.out.println("You must have been on job at least 2 year");
            }

        }else{
            System.out.println("You MUST earn at least $30K");
        }

    }
}
