package day51_Exceptions.PetsTask;

public class Dog extends Pet{

    double price;

    public Dog(String name, String breed, char gender, int age, String color, double price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}
