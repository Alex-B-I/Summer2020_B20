package Library;

import day47_Encapsulation.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {

        // public:
        System.out.println(AccessModifiers.publicVariable); // public is visible at everywhere
        AccessModifiers.publicMethod();

        // default:
        //System.out.println(AccessModifiers.defaultVariable); //default is not accessible outside the package
        //AccessModifiers.defaultMethod(); // Cannot be accessed from outside package

        // private:
        //System.out.println(AccessModifiers.privateVariable); // private is not visible outside its class
        // AccessModifiers.privateMethod();

    }
}
