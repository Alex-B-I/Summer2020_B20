package day43_Static;

class A{
    static int a = 200;
}


public class CybertekStudent {
    // for the advantages of static
    //public static void main(String[] args) {
    //    System.out.println(A.a);

        String studentName;
        int age;
        char gender;

        static String schoolName = "Cybertek School";

        public void getInfo(){
            System.out.println("Name: "+studentName);
        }

        public static void printSchoolName(){
            System.out.println("School Name: "+ schoolName);
        }

        public String toString(){
            return "";
        }

}

