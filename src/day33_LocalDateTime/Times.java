package day33_LocalDateTime;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Times {
    public static void main(String[] args) {
        LocalTime t1 =LocalTime.of(23,45,55);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);

        String time = "02:55:00PM";
        //             0123456789
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time.length()!=10){
            time = "0"+time;
        }

        char h1  = time.charAt(0);
         if(h1>=48 && h1<=57){
            hour =Integer.parseInt(""+h1);
            hour *=10;
        }
        char h2  = time.charAt(1);
        if(h1>=48 && h1<=57){
            hour +=Integer.parseInt(""+h2);
            }
        char m1  = time.charAt(3);
        if(h1>=48 && h1<=57){
            minute =Integer.parseInt(""+m1);
            minute *=10;
        }
        char m2  = time.charAt(4);
        if(h1>=48 && h1<=57){
            minute +=Integer.parseInt(""+m2);
        }
        char s1  = time.charAt(6);
        if(h1>=48 && h1<=57){
            second =Integer.parseInt(""+s1);
            second *=10;
        }
        char s2  = time.charAt(7);
        if(h1>=48 && h1<=57){
            second +=Integer.parseInt(""+s2);
        }


        if (time.substring(time.length()-2).equals("PM")){
           hour+=12;

        }

        LocalTime t3 =LocalTime.of(hour,minute,second);
        System.out.println(t3);

        DateTimeFormatter timeFormat =DateTimeFormatter.ofPattern("HH:mm:ssa");
        System.out.println(t3.format(timeFormat));


    }
}
