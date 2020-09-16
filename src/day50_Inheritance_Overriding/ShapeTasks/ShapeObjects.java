package day50_Inheritance_Overriding.ShapeTasks;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        System.out.println("Area of circle: "+ circle.area);
        System.out.println("Perimeter of circle: "+ circle.perimeter);
        System.out.println("=================================================");

        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println("Area of rectangle: "+rectangle.area);
        System.out.println("Perimeter of rectangle: "+ rectangle.perimeter);
        System.out.println("=================================================");

        Square square = new Square(12);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        System.out.println("Area of square: "+square.area);
        System.out.println("Perimeter of square: "+ square.perimeter);
        System.out.println("=================================================");



    }
}
