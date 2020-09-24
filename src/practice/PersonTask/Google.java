package practice.PersonTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Google {


    public static void main(String[] args) {


        Tester tester1 = new Tester("Jonn", 39, 'M', 123456, "SDET", 120000);
        Tester tester2 = new Tester("Karen", 30, 'F', 654378, "SDET", 110000);
        Tester tester3 = new Tester("Ana", 32, 'F', 534522, "SDET", 140000);
        Tester tester4 = new Tester("Irina", 25, 'F', 764398, "SDET", 130000);
        Tester tester5 = new Tester("Sam", 34, 'M', 987645, "SDET", 175000);



        Developer developer1 = new Developer("Brian", 37, 'M', 7365289, "Developer", 155000);
        Developer developer2 = new Developer("Mary", 23, 'F', 987543, "Developer", 125000);
        Developer developer3 = new Developer("David", 40, 'M', 7456239, "Developer", 145000);
        Developer developer4 = new Developer("Ana", 28, 'F', 123562, "Developer", 135000);
        Developer developer5 = new Developer("Christina", 41, 'F', 986562, "Developer", 162000);


        ArrayList<Tester> testers = new ArrayList<Tester>(Arrays.asList(tester1, tester2, tester3, tester4, tester5));
        ArrayList<Developer> developers = new ArrayList<Developer>(Arrays.asList(developer1, developer2, developer3, developer4, developer5));

        String resultTester = "";
        double maxSalaryTester = Double.MIN_VALUE;
        for (Tester each : testers) {
            if (each.salary > maxSalaryTester) {
                maxSalaryTester = each.salary;
                resultTester = each.name;
            }

        }


        String resultDev = "";
        double maxSalaryDev = Double.MIN_VALUE;
        for (Developer each : developers) {
            if (each.salary > maxSalaryDev) {
                maxSalaryDev = each.salary;
                resultDev = each.name;
            }

        }

        System.out.println("The Tester with maximum salary is: " + resultTester);
        System.out.println("The Developer with maximum salary is: " + resultDev);


    }

}








