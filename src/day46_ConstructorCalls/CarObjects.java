package day46_ConstructorCalls;

public class CarObjects {
    public static void main(String[] args) {
        System.out.println(new Car("Toyota"));
        System.out.println("===========================");

        System.out.println(new Car("BMW","X5"));
        System.out.println("===========================");

        System.out.println(new Car("Audi","Q7","White"));
        System.out.println("===========================");

        System.out.println(new Car("Jeep","Copmas","Black",2010));
        System.out.println("===========================");

        System.out.println(new Car("Honda","Accord","Red",2019,25_000));
        System.out.println("===========================");
    }
}
