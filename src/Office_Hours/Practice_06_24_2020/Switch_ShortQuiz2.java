package Office_Hours.Practice_06_24_2020;

public class Switch_ShortQuiz2 {
    public static void main(String[] args) {
        String opt = "true";
        switch (opt){
            case "true":
                System.out.println("True");
                break;
            default:
                System.out.println("False");
        }
        System.out.println("Done");

        System.out.println(12456+1024);


        float f1 = (12345.1>12345.0)?12456:12456.02f;
        float f2 = f1 + 1024;
        System.out.println(f1 == 12456);
        System.out.println(f2);

        System.out.println("++++++++++++++");

        // line 1
        String x = "1";
        switch (x){
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
        }

    }
}
