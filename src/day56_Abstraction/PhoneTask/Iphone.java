package day56_Abstraction.PhoneTask;

public final class Iphone extends Phohe {

    public Iphone(String model, double price, String size) {
        super("iPhone", model, price, size);
        if (price<=0 || price>1500){
            throw new RuntimeException ("Invalid Price: "+price);
        }


    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iPhone is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting "+phoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}