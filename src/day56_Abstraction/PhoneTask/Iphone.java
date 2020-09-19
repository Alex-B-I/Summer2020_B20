package day56_Abstraction.PhoneTask;
/*
2. create the following subclasses of phone:
                        1. IPhone
                        2. Samsung
            create constructors in each sub class that can initialize the instance variables
            if the price of iPhone or Samsung set to 0 or negative, program should throw an exception during runtime with an error message of "Invalid Price"
 */
public final class Iphone extends Phone {

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
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iPhone is texting "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
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
    /*
    @Override
    public String toString() {
        return "Iphone" + super.toString();
    }

     */

    public void faceTiming(long phoneNumber){//only unique for iPhone
        System.out.println("iPhone is face timing with "+phoneNumber);
    }
    public void faceTiming(long num1, long num2){//only unique for iPhone
        faceTiming(num1);
        faceTiming(num2);
    }


}
