package day57_Polymorphism.PhoneTask;

public class Huawei extends Phone implements AndroidApp, AppleApp, Downloadable {


    public Huawei(String model, String size, double price) {
        super("Huawei", model, price, size);
        if(price>200){
            throw new RuntimeException("No way Huawei is worth more then 200");
        }
    }

    @Override
    public void download() {
        System.out.println("download is downloading app from "+AndroidApp.AppStoreName+AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting: "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling: "+phoneNumber);
    }

    public void stealInfo(){
        System.out.println("Huawei is stealing your info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=$ " + price +
                ", size='" + size + '\'' +
                '}';
    }
}
