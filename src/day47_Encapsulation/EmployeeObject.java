package day47_Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {
        CapitalOneEmployee employee1 = new CapitalOneEmployee("Alex",35,"SDET");

        employee1.setID(123);
        employee1.setAddress("Illinois");
        employee1.setSalary(130_000);

        System.out.println(employee1.employeeName);
        System.out.println(employee1.age);
        System.out.println(employee1.jobTitle);
        System.out.println(employee1.companyName);

        System.out.println(employee1.getID());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);
    }
}
