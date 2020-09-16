package Office_Hours.Practice_06_23_2020;

public class IfStatements_Quiz {
    public static void main(String[] args) {
        // q2:

        int score =0;
        if(score==0){
            // 0 == 0 ==> true
            score += 50; //score = score + 50; =50;
        }
        if (score !=0) {
            // 50 != 0 ==> true
            score += 50; // score = 100
        }
            System.out.println(score);
            // q3:
            char grade ='A';
            boolean passed = grade == 'A' || grade =='B';
            //                   'A' == 'A'
            //                     true
            boolean passed2 = grade =='C' || grade == 'D';
            //                   'A' == 'C' || 'A'=='D';
            //                      false || false
            if (passed||passed2){
                //true||false==>true
                System.out.println("You passed the exam");
            }else{
                System.out.println("you failed");
            }


           //q8:
        int number = 10;
            if (--number>10){
                //9>10
                System.out.println("Hello Cybertek "+number);
            }else{
                System.out.println("Hello World " + number); //9
            }

        System.out.println("====================");

            //q9:
        boolean x = true;
        boolean y = !x==false; //true
        //         false==false==>true;
        boolean z = y; //true
        if (x){
            System.out.println("Hello Everyone");
        }
        if (y){
            System.out.println("Today is great day");
        }
        if (z){

            System.out.println("We are improving everyday");
        }
            // q10:
        int X = 10;
        int Y = X++;
        // Y= 10, X = 11
        System.out.println(Y++ + " "+X++ +" "+Y+" "+X);
        //                 10 11 11

    }


}
