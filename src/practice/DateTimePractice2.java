package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimePractice2

{

    public static void main(String[] args) {

        String[] students = {"Ramiya","Cristina" ,"Jack","Jessica","Karen "};

        LocalDate[] birthdays = {LocalDate.of(1982,10,23),
                LocalDate.of(1992,8,12),
                LocalDate.of(1988, 2,23),
                LocalDate.of(1990,3,11),
                LocalDate.of(1992,5,6)};

        //May/ dd/yy Monday

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i] + ": "+birthdays[i].format(df));
        }




    }
}
