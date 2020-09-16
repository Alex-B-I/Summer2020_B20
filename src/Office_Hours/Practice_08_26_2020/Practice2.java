package Office_Hours.Practice_08_26_2020;

public class Practice2 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};

        int[] arr2 = {9,8,7,6,5,4};

        int[] arr3 = {100,200,300};

        String [] arr4 = {"Ziiadin","Aysen","Murat", "Ramazan"};
            printArray(arr3);
            printArray(arr4);

            char[]arr5 = {'A', 'B', 'C', 'D', 'E'};
            printArray(arr5);

        double[] arr6 = {9.1,8.2,7.3,6.4,5.5,4.6};
        printArray(arr6);


    }

    public static void printArray(int []arr){
        for (int each:arr){
            System.out.print(each+" ");

        }
        System.out.println();
    }

    public static void printArray(String [] arr){
        for (String each:arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void printArray(char [] arr){
        for (char each:arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static void printArray(double [] arr){
        for (double each:arr) {
            System.out.print(each + " ");
        }
        System.out.println();
    }


}
