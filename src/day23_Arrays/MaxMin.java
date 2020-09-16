package day23_Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int[] arr ={5,5,4,6,4,1,-100,200,300,-3000};

        int max = arr[0]; //6
        int min = arr[0]; // 1

        for (int i = 1; i<=arr.length-1;i++){

            if (arr[i]>max){ //compares the array elements, and assign the maximum number to variable max
                max = arr[i];

            }
            if (arr[i]<min){ //compares the array elements, and assign the minimum number to variable max
                min = arr[i];

            }

        }
        System.out.println("Maximum number is: " +max);
        System.out.println("Minimum number is: " +min);



    }
}
