package day57_Polymorphism.PhoneTask;

public class PhoneObject {
    public static void main(String[] args) {


        iPhone iPhone = new iPhone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "6.1", 899);
        Huawei huawei = new Huawei("Robbery", "5.3", 25);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new iPhone("11","6",1200);
        Phone phone2 = new Samsung("S8","6.5",900);
        Phone phone3 = new Huawei("sasadSD", "3",35);

        //iPhone[] phones = {iPhone,samsung,huawei}
        //Samsung[] phones = {iPhone,samsung,huawei}
        //Huawei[] phones = {iPhone,samsung,huawei}

        Phone[] phones = {iPhone,samsung,huawei,phone1,phone2,phone3};






    }



}
