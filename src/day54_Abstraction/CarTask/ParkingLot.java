package day54_Abstraction.CarTask;

public class ParkingLot {
    public static void main(String[] args) {

        BMW bmw = new BMW();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();
        Jeep jeep = new Jeep();

        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();

    }
}
