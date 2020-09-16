package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Alex";
        String lastName = "Berloh";
        String fullName = firstName+" "+lastName;
        int age = 35;
        String citizen1 = "USA";
        String citizen2 = "Ukrainian";

        boolean eligibleAge = age >=18;
                                // 12 >=18 ==> true

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
                                // "USA" =="USA || "Ukrainian" == "USA"
                                // true || false ==> true

        boolean eligibleToVote = eligibleAge && usCitizen;
                            // true && true ==> true

        System.out.println(fullName + " is eligible to vote for Trump: " + eligibleToVote);


    }
}
