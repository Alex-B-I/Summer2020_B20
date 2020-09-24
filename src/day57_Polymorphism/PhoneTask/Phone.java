package day57_Polymorphism.PhoneTask;
/*
4. create an abstract class named Phone
            instance variables: brand, model, price, size
            abstract methods: texting(), calling()
            add constructor that can initialize the fields
            if the price is set to negative, the system should throw an exception with a message of:
                    Invalid Price, cannot be negative
 */
public abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public String size;

    public Phone(String brand, String model, double price, String size) {
        this.brand = brand;
        this.model = model;
        if(price <= 0){
            throw new RuntimeException("Price of the phone can not be negative or equal to zero! ! !");
        }
        this.price = price;
        this.size = size;
    }

    public abstract void texting(long phoneNumber);

    public abstract void calling(long phoneNumber);




}
