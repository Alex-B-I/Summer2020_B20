package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        System.out.println("X");

    }
    public ConstructorCalls3(int a){
        this();
        System.out.println("Y");

    }
    public ConstructorCalls3(double a){
        //this();
        this(10);

    }

    public void method1(){

    }
}
