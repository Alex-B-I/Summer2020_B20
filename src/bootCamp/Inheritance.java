package bootCamp;

 class Shape{ //super class can not be final
    public String name;
    protected double area(){
        return 0;
    }
}
final class Rectangle extends Shape{ //sub class can be final
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

public class Inheritance {
    public static void main(String[] args) {


    }
}
