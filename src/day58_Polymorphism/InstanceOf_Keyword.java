package day58_Polymorphism;

import day54_Abstraction.CarTask.Car;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

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

    }
}
