package day24_Arrays;

public class UniquesWords2 {
    public static void main(String[] args) {
        String[] words = {"C#","C#","Java","Python","Python","C++","Ruby"};

        for (String each: words) {

            //String s = each;
            int count = 0;

            for (String b : words) {// b represents each elements in the array
                if (each.equals(b)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }

        String[] r = {"1","2","aa","1","1","2"};
        int getDup =0;
        for (String each: r) {
            int count = 0;
            for (String b : r) {
                if (each.equals(b)) {
                    count++;
                }
            }
            if (count >= 2) {
                getDup++;
            }
        }
        System.out.println(getDup);



    }
}
