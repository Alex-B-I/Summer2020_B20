package Office_Hours.Practice_09_09_2020;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone= new Iphone("11 Pro",1000);

        iphone.call(911);
        iphone.text(123456);

        System.out.println(iphone);

        System.out.println("========================================================");

        Samsung samsung = new Samsung("Galaxy S20 Ultra 5G",1399.99);
        System.out.println(samsung);
        samsung.call(6302101716l);
        samsung.text(1234567890);

        System.out.println("=========================================================");

        Nokia nokia = new Nokia("Brick",25);
        System.out.println(nokia);
        nokia.call(3125646);
        nokia.text(6302201020l);

    }
}
