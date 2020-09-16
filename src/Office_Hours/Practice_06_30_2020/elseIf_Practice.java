package Office_Hours.Practice_06_30_2020;
// A,B,C,D,F,Invalid

public class elseIf_Practice {
    public static void main(String[] args) {

        int score = 80;
        char grade = ' ';


        if(score>=90 && score<=100){
            grade = 'A';
        }else if(score>=80 && score <90){
            grade = 'B';
        }else if(score>=70 && score <80) {
            grade = 'C';
        }else if(score>=60 && score <70) {
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println(grade);

        char grad2 = (score>=90 && score<=100)? 'A': (score>=80)? 'B'
                   : (score>=70)? 'C': (score>=60)? 'D':'F';
        System.out.println(grad2);

    }
}
