package day42_Static;

public class CapitalOne {
    public static void main(String[] args) {


        Tester[] testers ={new Tester(),new Tester(),new Tester()};
        testers[0].setInfo("Aalia", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 185000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);

        Developer[] developers={new Developer(),new Developer(),new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("Waqar", 'M', 2111L, "Dev Lead" , 4500000);
        developers[1].setInfo("Roza", 'F', 3222L, "Dev", 550000);
        developers[2].setInfo("Burak", 'M', 43333L, "Dev", 650000);
        developers[3].setInfo("Virginia", 'F', 76453L, "Dev", 130000);
        developers[4].setInfo("Akbar", 'M', 54355L, "Dev", 120000);

        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan","Hammit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("=======================================");
        for (Tester each:team1.testers ){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("=======================================");
        for (Developer each: team1.developers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("=======================================");
        team1.removeTester(15333);
        team1.removeDeveloper(2111);
        team1.removeDeveloper(43333);
        System.out.println(team1);
        System.out.println("=======================================");

        Developer dev1 = new Developer();
        dev1.setInfo("Luisa", 'f', 2113L, "Dev Lead" , 5000000);
        team1.addDeveloper(dev1);
        System.out.println(team1);
        System.out.println("=======================================");

        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(),new ScrumTeam()};
        /*
        print all developers and testers name from scrum team
        find the max salary in testers and develops team
         */
        double tmax =0;
        String name1="";
        for (Tester each:team1.testers ){
           if (each.salary>tmax) {
               tmax= each.salary;
               name1=each.name;
           }

        }
        System.out.println(name1+" has max salary in testers: $"+tmax);

        double dmax =0;
        String name2="";
        for (Developer each:team1.developers ){
            if(each.salary>dmax){
                dmax= each.salary;
                name2=each.name;
            }
        }
        System.out.println(name2 + " has max salary in developers: $"+dmax);




    }
}
