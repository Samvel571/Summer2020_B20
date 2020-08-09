package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {


    public static void main(String[] args) {

//     DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("MMMM/dd/yy, EEEE");
//
//        LocalDate ld = LocalDate.of(2020,7,26);
//
//        System.out.println(ld);
//
//        System.out.println(ld.format(dateTimeFormatter));
//




        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss ");

        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        //MAy/20/19 Dayname 4:30pm

//
//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a" );
//        LocalDateTime localDateTime = LocalDateTime.of(2019,05,20,16,30);
//        System.out.println(localDateTime);
//




//        System.out.println(localDateTime.format(dateTimeFormatter1));
//
//
//        System.out.println(LocalDateTime.now().format(dateTimeFormatter1));
//
//
//        LocalDateTime rNow = LocalDateTime.now();
//
//        System.out.println(rNow.format(DateTimeFormatter.ofPattern("EEEE HH:mm:ss ")));

    }
}
