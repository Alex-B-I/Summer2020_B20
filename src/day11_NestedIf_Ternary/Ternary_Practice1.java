package day11_NestedIf_Ternary;

public class Ternary_Practice1 {
    public static void main(String[] args) {
        int age =16;
        String citizen = "USA";
        String result = "";
        if (age>=21 && citizen == "USA"){
            result = "Can Vote";
        }else{
            result = "Cannot Vote";
        }
        System.out.println(result);
        System.out.println("======================");
        String result2 = (age>=21 && citizen == "USA") ? "Can Vote" : "Cannot Vote";
        System.out.println(result2);

        System.out.println("======================");

        int n1 = 100;
        int n2 = 200;

        String r = (n1 == n2) ? "Equal" : "Not Equal";
        // "equal" or "not equal"
        System.out.println(r);

    }
}
