package day19_ForLoop;

public class breakStatement {
    public static void main(String[] args) {
        for (int i=0; i<5;i++){
            System.out.println("Hello");
            break;
        }
        System.out.println("============");
        for (char ch ='A'; ch<='H'; ch++){
            System.out.print(ch+" ");
            if (ch=='C'){
                break;
            }
        }
        System.out.println();
        System.out.println("==============");

        for (int i = 10; i<=50; i+=10) { //i:10, 20,30,40,50

            if (i == 30) {
                break;
            }
            System.out.print(i + " ");
        }
            System.out.println();

            System.out.println("============");
            for (int x=1000; x>=100;x-=100){

                System.out.print(x+" ");
                if (x==500){
                    break;
                }
            }




    }
}
