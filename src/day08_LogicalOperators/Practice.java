package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {

        String firstName = "Alex";
        String lastName = "Berloh";
        String fullName = firstName+" "+lastName;
        int age = 35;
        String citizenShip = "USA";

        boolean eligibleToVote = age >= 18 && citizenShip =="USA";
        //                       19>=18    && "China" == "USA";
        //                       true && true

        System.out.println(fullName + " is eligible to vote: " + eligibleToVote);





    }
}
