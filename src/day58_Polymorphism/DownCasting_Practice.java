package day58_Polymorphism;


import day50_Inheritance_Overriding.CarTask.Honda;
import day57_Polymorphism.PhoneTask.Huawei;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day57_Polymorphism.PhoneTask.iPhone;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new iPhone("11", "6", 1000);
        iPhone iphone = (iPhone) phone1;

        System.out.println(phone1);
        System.out.println(iphone);
       //phone1.faceTiming(123456);
        iphone.faceTiming(123456);

        //second way
        ((iPhone)phone1).faceTiming(123456789);

        System.out.println("=======================================");

        Phone phone2 = new Samsung("S20","7",1000);

        ((Samsung)phone2).freezing();

       //((iPhone)phone2).faceTiming(123450);

        System.out.println("=======================================");

        Phone phone3 = new Huawei("spy","7",10);

        ((Huawei) phone3).stealInfo();

        //( (iPhone)phone3).faceTiming(123456);






    }
}
