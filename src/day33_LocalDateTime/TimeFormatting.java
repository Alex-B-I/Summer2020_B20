package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*
year: yy,yyyy
Month: MM(number), MMM(three letters), MMMM
days: dd
days week name: E(three letters), EEEE

 */


public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter DateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy, EEEE");

        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);
        System.out.println(ld.format(DateFormat));

        System.out.println("===================================");

        /*
        hours:HH (military time)
        hours:hh (am,pm)
        minute:mm
        seconds:ss
        am/pm: a (add index am or pm)
         */

        DateTimeFormatter timeFormat =DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));
        System.out.println("=================");

        // May/20/2019 Dayname 4:30pm
        System.out.println("++++++++++++++++++++++++++++++++++");
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE h:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));
        System.out.println(LocalDateTime.now().format(DTFormat));
        System.out.println("++++++++++++++++++++++++++++++++++");

        // Saturday 4:34:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now.format(dtf));




    }
}
