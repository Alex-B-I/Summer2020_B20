package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI;
    static {//only runs one time;
        PI=3.14;
    }

    public double area;
    public double perimeter;

    public Circle(double radius){
        this.radius = radius;
        diameter = 2*radius;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }

    private double calculateArea(){
        return radius*radius*PI;
    }
    // for INTERNAL use ONLY

    private double calculatePerimeter(){
        return diameter*PI;
    }
    // for INTERNAL use ONLY

    public String toString(){
        return "Radius: "+radius+", Diameter: "+diameter+", Area: "+area+", Perimeter: "+perimeter;
    }


}
