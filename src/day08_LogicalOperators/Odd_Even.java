package day08_LogicalOperators;

public class Odd_Even {
    public static void main(String[] args) {
       int number = 10;
       boolean even = number%2==0 && number>0;
       boolean odd = number%2==1;
       boolean zero = number==0;


       if (even){
           System.out.println(number+" is even number");
       }
       if (odd){
           System.out.println(number + " is odd number");
       }
       if (zero){
           System.out.println(number+ " is zero number");
       }




    }
}
