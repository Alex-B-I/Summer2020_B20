package day50_Inheritance_Overriding.CarTask;
/*
Car:
    start(): Insert the key
             twist ignition key to start
Honda:
    start(): Insert the key
             twist ignition key to start
Mercedes:
    start(): push the start button
Tesla:
    start(): voice control
Jeep:
    start(): Call Mechanic
             Oil Change
             jump start
 BMW:
    start(): Call some friends
            Tell them to push
            Remoev Clutch peddle
            how many method: 1
            how many implemntation: 5

 */
public class Car {
    public void start(){
        System.out.println("Insert the key");
        System.out.println("Twist ignition key to start");
    }
}
