package day49_Inheritance.ScrumTeamTask;
/*
 create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 */
public class Person {
    public String name;
    public int age;
    public char gender;

    private long ssn;

    public long getSsn() {//read ssn only
        return ssn;
    }
    public void setSsn(long ssn){//set ssn only
        this.ssn=ssn;
    }

    private void eat(){// we don`t want this to be inherited to the sub classes
        System.out.println(name+" is eating");
    }


    private void walk(){// we don`t want this to be inherited to the sub classes
        System.out.println(name+" is walking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void setInfo(String name,int age,char gender){//only sets name, age , gender
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

}
