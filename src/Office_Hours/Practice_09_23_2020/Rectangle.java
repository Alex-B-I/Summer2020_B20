package Office_Hours.Practice_09_23_2020;

public class Rectangle extends Shape {

   public double width;
   public double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }

    @Override
    public double calculateArea() {
        return width*length;
    }

    @Override
    public double calculatePerimeter() {
        return (width+length)*2;
    }

}
