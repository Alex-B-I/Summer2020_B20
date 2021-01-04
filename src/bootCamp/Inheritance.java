package bootCamp;




interface Volume{
    public int a = 100; //public static final
    double volume();
}

 abstract class Shape{ //super class can not be final
    public String name;
    protected abstract double area();

 }

   class Rectangle extends Shape{ //sub class can be final
    public double length, width;

    @Override
    public double area(){
        return length*width;
    }



   }
class Circle extends Shape{

     public double r;

    @Override
    protected double area(){
        return r * r * 3.14;
    }


}
final class Cube extends Shape implements Volume {

    @Override
    protected double area() {
        return 0;
    }


    @Override
    public double volume() {
        return 0;
    }
}



public class Inheritance {
    public static void main(String[] args) {


        Circle circle = new Circle();
        System.out.println(Volume.a);

    }
}
