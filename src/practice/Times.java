package practice;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {

    public static void main(String[] args) {

       LocalTime time =  LocalTime.of(15,34,45);

        System.out.println(time);

        System.out.println(LocalTime.now());


        LocalDateTime t3 = LocalDateTime.of(2020,07,25,15,23);

        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);
    }
}
