package day44_Constructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import static day44_Constructor.HumanResource.*;// imports all static from HumanResource

/*
3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee name and salary

 */
public class BankOfAzerbaijan {
    public static void main(String[] args) {


        ArrayList<Employee> list = new ArrayList<>();
        /*
        list.add(HumanResource.employee1);
        list.add(HumanResource.employee3);
        list.add(HumanResource.employee5);

         */
        /*
        list.addAll(Arrays.asList(HumanResource.employee1,employee2,employee3));
        //by using static import we are able to import the static members, so can call them without the class;

         */

        list.addAll(Arrays.asList(HumanResource.employee1,HumanResource.employee2,HumanResource.employee3));

        System.out.println("Total Number of employees: "+list.size());
        System.out.println("===========================================");


        for (Employee each:list){
           System.out.println(each.name+" : "+each.salary);
            //System.out.println(each);

        }



    }
}
