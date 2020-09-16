package Office_Hours.Practice_07_06_2020;

public class Quiz {
    public static void main(String[] args) {
        //Task 1
        String str =" ";
         str = str.trim(); //""
        System.out.println(str.isEmpty());
        // Task2
        System.out.println("===============");
        String ta = "A ";
        ta = ta.concat("B "); //A B
        String tb = "C ";
        ta = ta+tb; //A B C
        ta.replace('C','D');// A B D
        ta = ta + tb;
        System.out.println(ta);

        //Task 6

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is: ");
        //s1 == s2 is: abc" == "abc";
        //              false;


    }
}
