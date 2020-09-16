package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {

        // public:
        System.out.println(AccessModifiers.publicVariable); // public is accessible at everywhere
        AccessModifiers.publicMethod();

        // default:
        System.out.println(AccessModifiers.defaultVariable);// default is  accessible the same package
        AccessModifiers.defaultMethod();

        //private:
       // System.out.println(AccessModifiers.privateVariable); // private is not visible outside its class
       // AccessModifiers.privateMethod();

        Encapsulation obj1 = new Encapsulation();

        //System.out.println(obj1.ssn);
        System.out.println(obj1.getSsn());

        obj1.setSsn(7654321);//7654321

        System.out.println(obj1.getSsn());




    }

}
