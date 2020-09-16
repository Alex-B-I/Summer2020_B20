package Office_Hours.Practice_09_15_2020;

class Data{
    /*
    instance method:1
     */
    public void methodA(){
        System.out.println("Method A");
    }

}
class Test extends Data{
    /*
    instance method:2
     */
    public void methodB(){
        System.out.println("Method B");
    }

    public static void main(String[] args){
        Data obj= new Data();
        obj.methodA();;
       // obj.methodB();
    }

}

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
       // super(10); // implicitly done
        System.out.println("B");

    }
}

public class Quiz extends B {
    public Quiz(){//ABC
        super();//AB
        System.out.println("C");//C
    }

    public static void main(String[] args) {
        //new Quiz(); //A B C
        new B(); //A B
    }
}
