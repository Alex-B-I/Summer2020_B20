package day29_CustomMethods;

public class UniqueElements {

    public static void main(String[] args) {

        String [] arr = {"A", "B", "B", "C"};
        unique(arr);
        System.out.println("Hello");
        String [] arr2 = {"D","D","E","F","F"};
        unique(arr2);

    }

    public static void unique(String[]arr){

        for (String a:arr) { //gets each of the element
            int count = 0;
            for (String each : arr) { //gets the frequency of the element
                if (a.equals(each)) {
                    count++;
                }
            }
            if (count == 1) { // unique
                System.out.print(a+" ");
            }
        }
        System.out.println();

    }

}
