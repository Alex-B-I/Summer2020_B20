package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"C#","C#","Python","Python","Java"};



        for (String b : words) {
            //String s = b;
            int count = 0;
            for (String a : words) {
                if (a.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(b);
            }
        }




    }
}
