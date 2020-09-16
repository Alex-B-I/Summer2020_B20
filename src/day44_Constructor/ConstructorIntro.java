package day44_Constructor;

public class ConstructorIntro {


    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
        System.out.println("How are you "+arr);
    }





    public static void main(String[] args) {

       // ConstructorIntro obj = new  ConstructorIntro(10);

       // ConstructorIntro obj2 = new ConstructorIntro();

        ConstructorIntro obj3 = new  ConstructorIntro("Alex");
        ConstructorIntro obj4 = new  ConstructorIntro("Dawud");
        ConstructorIntro obj5 = new  ConstructorIntro("Zeliha");


    }

}
