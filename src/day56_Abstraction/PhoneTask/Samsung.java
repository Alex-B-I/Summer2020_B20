package day56_Abstraction.PhoneTask;

public final class Samsung extends Phohe{

    public Samsung(String model, double price, String size) {
        super("Samsung",model, price, size);
        if(price<=0 || price>1200){
            throw new RuntimeException("Invalid Price: "+price);
        }

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting to "+phoneNumber);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
