package day57_Polymorphism.PhoneTask;

/*
 5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500

 */
    public class iPhone extends Phone implements AppleApp, Downloadable{

        public iPhone(String model,String size, double price ) {
            super("iPhone", model, price, size);
            if(price>1500){
                throw new RuntimeException("Invalid Price, Iphone' price cannot more than 1500");
            }
        }

        @Override
        public void texting(long phoneNumber) {
            System.out.println("iPhone is texting: "+phoneNumber);
        }

        @Override
        public void calling(long phoneNumber) {
            System.out.println("iPhone is calling: " +phoneNumber);
        }

        @Override
        public void download() {
            System.out.println("iPhone is downloading app from "+AppStoreName);
        }
    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming "+phoneNumber);
    }

    @Override
    public String toString() {
        return "iPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$ " + price +
                ", size='" + size + '\'' +
                '}';
    }
}

