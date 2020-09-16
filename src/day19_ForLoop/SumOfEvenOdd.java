package day19_ForLoop;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        //Task 3
        // 0 2 4 6 8 10 ....

        int sumOfEven =0;
        for (int i = 0; i<=100; i+=2){
            sumOfEven +=i;//sum of all even numbers
        }
            System.out.println(sumOfEven);

        System.out.println("====================");

        int sumOfEven1 =0;
        for (int i =0; i<=100; i++){
            if (i%2==0) {
                sumOfEven1 += i;
            }
        }
        System.out.println(sumOfEven1);
        System.out.println("===================");

        //Task 4
        //1 3 5 7 9 .....99

        int sumofOdd = 0;
        for (int i =1; i<=99; i+=2){
            sumofOdd +=i;

        }
        System.out.println(sumofOdd);
        System.out.println("===================");

         int sumOfOdd1 = 0;
        for (int i= 0;i<=100;i++){
            if (i%2!=0){
                sumOfOdd1 +=i;
            }

        }
        System.out.println(sumOfOdd1);


    }
}
