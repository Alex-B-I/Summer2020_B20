package day56_Abstraction;

public abstract class AbstractClass_VS_Interface {

    public int a;
    protected static int b;
    public void method1(){}
    public static void method2(){}
    public abstract void method3();

    public AbstractClass_VS_Interface(int a){
        this.a=a;
    }
        static {b=300;}//static block

    {

    } // instance block

    public static void main(String[] args) {
        double b = Math.PI;
        int a = Integer.MAX_VALUE;
    }

}

interface A{
    int a=10; //public static final
    //public void method1(){}
      public  static void method2(){}//public
      public abstract void method3();//public
                      void method3_2();//public abstract
                   // abstract method is the only recommendation in interface
    public default void method4(){} // public

    //public A(){}
    //static {}
    //{}
}
