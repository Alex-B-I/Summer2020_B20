package day47_Encapsulation;

public class Constructor {

    static {
        System.out.println("static block");
    }

    public Constructor(int a){
        //this(10.0);
       // this("A");
        System.out.println("int arg");
    }
    public Constructor(double a){
        this(10); //int arg
        System.out.println("double arg"); //double arg
    }

    public Constructor(String a){
        this(5.5);
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        // new Constructor();
        new Constructor("A");
       // new Constructor(10.0);
    }

}
