package day09_IfStatment;

public class Breaks {
    public static void main(String[] args) {

        String itsBreakTime = "yes";
        if(itsBreakTime=="yes"){
            System.out.println("Take 15 minute of break");
        }else{
            System.out.println("Continue the class");
        }
        System.out.println("===================");

        int a = 100;
        int b = 200;
        if (a>b) {
            System.out.println(a + " is greter");
        }else {
            System.out.println(b + " is greater");
        }


    }
}
