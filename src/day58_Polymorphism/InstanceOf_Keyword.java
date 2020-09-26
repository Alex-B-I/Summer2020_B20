package day58_Polymorphism;

import day54_Abstraction.CarTask.Car;
import day55_Abstraction.ShapesTask.Circle;
import day55_Abstraction.ShapesTask.Cylinder;
import day55_Abstraction.ShapesTask.Rectangle;
import day55_Abstraction.ShapesTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;
import sun.plugin.dom.css.Rect;

public class InstanceOf_Keyword {

    public static void main(String[] args) {
        Animal animal1 = new Animal(10,'F');
        Animal animal2 = new Dog("Winston",4, 'M');
        Animal animal3 = new Cat("Kiko",2,'M');

        // verify animal3 is the object of Animal class
        boolean r1 = animal3 instanceof Animal; // Is A relation ==> true
        System.out.println(r1);

        //verify animal3 is the object of Cat class
        boolean r2 = animal3 instanceof Cat;
        System.out.println(r2);                            // true

        // /verify animal3 is the object of Dog class
        boolean r3 = animal3 instanceof Dog;
        System.out.println(r3);                            // false

        boolean r4 = animal2 instanceof Animal;            //Dog is Animal
        System.out.println(r4);                            // true

        System.out.println(animal2 instanceof Dog);        //Dog is dog
        System.out.println(animal1 instanceof Dog);        // false
        System.out.println(animal2 instanceof Cat);        //Dog is Cat

        System.out.println("====================================");
        Shape shape1 = new Rectangle(3, 5);

        identifyShape(shape1);

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);
        System.out.println(equalShapes(c1,c2));

        Rectangle a1 = new  Rectangle(3,5);
        Rectangle a2 = new  Rectangle(3,5);
        System.out.println(equalShapes(a1,a2));

        Cylinder b1 = new  Cylinder(3,6);
        Cylinder b2 = new  Cylinder(2,7);
        System.out.println(equalShapes(b1,b2));

    }

    public static void identifyShape(Shape shape){
        if(shape instanceof Circle){
            System.out.println("The shape is circle");
        }else if(shape instanceof Cylinder){
            System.out.println("The shape is cylinder");
        }else{
            System.out.println("The shape is rectangle");
        }
    }

    public static boolean equalShapes(Shape shape1, Shape shape2){
        boolean result = false;
        boolean bothCircle = shape1 instanceof  Circle && shape2 instanceof Circle;
        boolean bothRectangle = shape1 instanceof Rectangle && shape2 instanceof Rectangle;
        boolean bothCylinder = shape1 instanceof Cylinder && shape2 instanceof Cylinder;

        if (bothCircle){
            Circle c1 = (Circle)shape1;
            Circle c2 = (Circle)shape2;
            if(c1.radius==c2.radius){
                result = true;
            }
        }

        if (bothRectangle){
            Rectangle r1 = (Rectangle) shape1;
            Rectangle r2 = (Rectangle) shape2;
            if(r1.width== r2.width && r1.length==r2.length){
                result = true;
            }
        }

        if (bothCylinder){
            Cylinder c1 = (Cylinder) shape1;
            Cylinder c2 = (Cylinder) shape2;
            if(c1.radius== c2.radius && c1.height==c2.height){
                result = true;
            }
        }

        return result;
    }

}
