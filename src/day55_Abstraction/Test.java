package day55_Abstraction;

import java.io.IOException;

public class Test {
/*
    public static void main(String[] args) throws RuntimeException{
        method();
        System.out.println("Test");
    }
    public static void method() throws IOException{
        throw new IOException();
    }

 */


   /* public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }catch (RuntimeException e){
            System.out.println("Runtime");
        }catch (ArithmeticException e){
            System.out.println("Aritm");
        }
    }

    */

    static int a=50;

    public static void main(String[] args) {
        a=100;
        try{
            a=200;
        }catch (Exception e){
            a=300;
        }finally {
            a=400;
        }
        System.out.println(a);
    }
    static {
        a=500;
    }







}
