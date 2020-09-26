package day58_Polymorphism;


import day57_Polymorphism.PhoneTask.Phone;
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





    }
}
