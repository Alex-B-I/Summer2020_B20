package day24_Arrays;

public class UniquesNumbers2 {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,5,5,5,6,7,7,7,8};

        for (int a: arr) {//j:0,1,2,3,4
            int count = 0;
            for (int b: arr) { // only calculates the frequency of num
               if (b == a) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(a+" ");
            }
        }

    }
}
