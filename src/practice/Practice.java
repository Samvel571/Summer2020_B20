package practice;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Practice {

    public static void main(String[] args) {

        String result = LocalTime.parse("12:00:00PM", DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(result);

    }
}
