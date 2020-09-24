package day57_Polymorphism;

public class PhoneObject {
    public static void main(String[] args) {


        iPhone iPhone = new iPhone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20", "6.1", 899);
        Huawei huawei = new Huawei("Robbery", "5.3", 25);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(huawei);
    }



}
