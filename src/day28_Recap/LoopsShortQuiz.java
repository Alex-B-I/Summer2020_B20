package day28_Recap;

public class LoopsShortQuiz {
    public static void main(String[] args) {

    int a=0;
    while(a<=6){
        a+=2;
        }
        System.out.println(a);

    int i = 0;
    int j =7;
    for (i=0; i<j-1;i+=2){
        System.out.print(i+" ");
    }
        System.out.println();
        System.out.println(i);

        for (int k=0;k<=4;){
            k++;
            System.out.print(k+"  "); // 1 2 3 4 5
        }
        int z=5;
        for(int q=5;q>0;q--){
            z+=q;
        }
        System.out.println();
        System.out.println(z);
    }
}
