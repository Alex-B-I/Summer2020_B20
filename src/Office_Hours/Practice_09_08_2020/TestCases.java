package Office_Hours.Practice_09_08_2020;

public class TestCases {
    public static void main(String[] args) {
        Credentials c1 = new Credentials();

       // System.out.println(c1.usserName); // No direct access to the data
       // System.out.println(c1.passWord); // No direct access to the data
        System.out.println("User name Entered: "+c1.getUserName());

        c1.setUserName("Batch20");

        System.out.println("User name Entered: "+c1.getUserName());
        System.out.println("User name Entered Again: "+c1.getUserName());

        System.out.println("======================");

        System.out.println("Pass Word Entered: "+c1.getPassWord());

      //  c1.setPassWord="JavaTurtles";
        c1.setPassWord("JavaTurtles");

        System.out.println("New Pass Word Entered: " + c1.getPassWord());
        System.out.println("New Pass Word Entered Again: " + c1.getPassWord());
    }
   /*
   public String getUserName(){
        return userName();
    }

    */
}
