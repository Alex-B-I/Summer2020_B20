package day25_Practices;
/*
 1. Write a program that can return the shortest string of text from a String array
 */

public class ShortestString {
    public static void main(String[] args) {
        String [] arr = {"Anam", "Nickolas", "Amir","Nurmamet","Abi","Ali","Joe"};

        int minLength = arr[0].length();

        for (int i =0; i<=arr.length-1; i++){ // to find out the minimum length of the string in arr
            int l = arr[i].length(); // 4 8 4 8
            if(l<minLength){
                minLength = l;
            }

        }
        System.out.println("Minimum length " +minLength);

        for (int i =0; i<=arr.length-1;i++){ // to see how many strings' lengths in the array is matching with minLength
            if (arr[i].length()==minLength){
                System.out.println(arr[i]);
            }
        }

    }
}
