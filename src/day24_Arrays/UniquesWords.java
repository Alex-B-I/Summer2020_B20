package day24_Arrays;

public class UniquesWords {
    public static void main(String[] args) {
        String[] words = {"C#","C#","Java","Python","Python","C++","Ruby"};

        for (int j =0; j<=words.length-1;j++) {
            String s = words[j]; // "C#",
            int count = 0; // to assign the frequency of s

            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i];

                if (s.equals(each)) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(s);
            }

        }

    }
}
