package practice;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class replitTimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String result="";

        if(s.length() ==10){
        result = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
       }else{
            result = LocalTime.parse(s, DateTimeFormatter.ofPattern("h:mm:ssa")).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        System.out.println(result);


    }
}