package day44_Constructor;

public class StudentObjects {
    public static void main(String[] args) {

        //Student student1 = new Student();
        //student1.setInfo("Mike", 18, 'M');
        Student student1 = new Student("Meerim", 20, 'F');

        //Student student2 = new Student();
       // student2.setInfo("Rakhat", 28, 'F');
        Student student2 = new Student("Nickolas", 21, 'M');

        //Student student3 = new Student();
        //student3.setInfo("Belek", 30, 'M');
        Student student3 = new Student("Murat", 22, 'M');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
