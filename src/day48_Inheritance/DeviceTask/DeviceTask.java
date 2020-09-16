package day48_Inheritance.DeviceTask;

public class DeviceTask {
    public static void main(String[] args) {


        TV tv = new TV("Samsung", "Q950TS", 11999.99, false, true, "85\"", true);
        System.out.println(tv);
        tv.watch();

        Phone phone = new Phone("Samsung","Galaxy S20 Ultra",1399.99,true,true,"6.9\"","Android");
        System.out.println(phone);
        phone.call(331_201_50_05l);
        phone.text(331_201_50_05l);

        Laptop laptop = new Laptop("HP","15T-EB000 TOUCH",1399.99,true,true,"15.6\"","Windows");
        System.out.println(laptop);
        laptop.coding("Java");

    }
}
