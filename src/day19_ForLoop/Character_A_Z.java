package day19_ForLoop;

public class Character_A_Z {
    public static void main(String[] args) {

        for (char ch = 'A'; ch<='Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
        for (char c = 'a'; c<='z'; c++){
                System.out.print(c+" ");
        }
        System.out.println();
        System.out.println("===================");

        for (int i =97; i<=122;i++){
         // char ch = (char)i
            System.out.print((char)i+" ");
        }
        System.out.println();

        for (int i =65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("==============");
        //task06:

        for (char ch = 'Z'; ch >='A'; ch--){
            System.out.print(ch+" ");
        }
        System.out.println();

        for (int i =90; i>=65; i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("===============");
/*
        for (int i = 0; i<=65000; i++){
            System.out.println((char)i+" ");
        }

 */

    }
}
