package practice.Polimorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {

        Employee employee1 = new Tester("John",123455,120000,'M');
        Employee employee2 = new Tester("Katrina",1234567,100000,'F');
        Employee employee3 = new Tester("Jack",9876543,149000,'M');
        Employee employee4 = new Tester("Anna",78638920,153000,'F');
        Employee employee5 = new Tester("Christina, 1254678",9876543,118000,'F');


        Employee employee6 = new Developer("David",78965456,159000,'M');
        Employee employee7 = new Developer("Alan", 8976567,167000,'M');
        Employee employee8 = new Developer("Irina",9872456,170000,'F');
        Employee employee9 = new Developer("Rose",  129876567,165000,'F');
        Employee employee10 = new Developer("Sam",55777777,220000,'M');

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10));

        for( Employee each : employees){
            System.out.println(each);
            System.out.println("=============");
           each.work();
        }



    }
}
