package Office_Hours.Practice_09_16_2020;

public class ExceptionTypes {
    public static void main(String[] args) {
       // System.out.println("Cybertek".charAt(200));//unchecked==>unexpected

       // Thread.sleep(3000);//checked==>unwanted, MUST be handled immedietly
            try {
                  System.out.println(9 / 0);
                }catch (ArithmeticException e){
                System.out.println("Arithmetic exception is caught");
                }

        System.out.println("Test Case 1 Completed");
    }
}
