package Library;

import day50_Inheritance_Overriding.AccessModifiers;
import day50_Inheritance_Overriding.Test;

public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(InheritanceTest.publicData); //public is visible outside the package
        System.out.println(InheritanceTest.protectedData);// protected is visible always to any child class
        //System.out.println(InheritanceTest.defaultData); // default is not visible outside the package
        // System.out.println(Test.privateData);

    }

}
