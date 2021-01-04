package bootCamp;

class Person{
    /*
  instance:  name,age,gender
  static: isHuman, numberOfEyes
     */
    public String name;
    public String age;
    public String gender;

    public static boolean isHuman = true;
    public static int numberOfEyes = 2;

    public void printName(){
        System.out.println(name);
        System.out.println(isHuman);
    }


}

public class StaticInstancePractice {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Musa";

        Person person2 = new Person();
        person2.name = "Mike";
        // person2.numberOfEyes=3;

        System.out.println(person1.name);
        System.out.println(person2.name);

        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);
        System.out.println(Person.numberOfEyes);

    }

}
