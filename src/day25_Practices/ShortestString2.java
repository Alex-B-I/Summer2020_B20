package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {
        String [] arr = {"Anam", "Nickolas", "Amir","Nurmamet","Tony","Adam", "Musa","Alan"};

        int minLength = arr[0].length();

        for (String each : arr){ // to find out the minimum length of the string in arr
            if(each.length()<minLength){
                minLength = each.length();
            }
        }
        System.out.println("Minimum length " +minLength);

        for (String each : arr){ // to see how many strings' lengths in the array is matching with minLength
            if (each.length()==minLength){
                System.out.println(each);
            }
        }
    }
}
