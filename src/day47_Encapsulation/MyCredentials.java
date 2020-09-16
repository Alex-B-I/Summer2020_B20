package day47_Encapsulation;

public class MyCredentials {
    public static void main(String[] args) {
        Credentials obj = new Credentials("Alex",35);
        obj.setUserName("Cybertek");
        obj.setPassWord("CyberTek12345");

       // System.out.println(obj.userName);
       // System.out.println(obj.passWord);

        System.out.println(obj.getPassWord());
        System.out.println(obj.getPassWord());

        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.companyName);

    }
}
