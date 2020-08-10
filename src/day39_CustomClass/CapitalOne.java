package day39_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    Employee employee3 = new Employee();
    Employee employee4 = new Employee();
    Employee employee5 = new Employee();
    Employee employee6 = new Employee();


    employee1.setEmployeeInfo("Roman",'M',12345654,"QA",120000);
    employee2.setEmployeeInfo("John Smith",'M',765567789,"Developer",150000);
    employee3.setEmployeeInfo("Tetiana", 'F',536733636,"Tester",100000);
    employee4.setEmployeeInfo("Meerim",'F',124312325,"QA",120000);
    employee5.setEmployeeInfo("Ramazan", 'M', 123121456, "QA", 86000);
    employee6.setEmployeeInfo("Virginia",'F',456553344,"BA",170987);


        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6) );

        String name = "";
        double max = Integer.MIN_VALUE;
        for (Employee each : employeeList){
           double eachSalary = each.salary;
           if (eachSalary > max){
               max = eachSalary;
               name=each.name;
           }
        }
        System.out.println("MAXIMUM SALARY: "+max);
        System.out.println(name);


        System.out.println("==============================================================");

        employeeList.removeIf(p-> p.salary < 150000);
     //   employeeList.removeIf(p-> p.name.toLowerCase().contains("m") );
        for (Employee each : employeeList){
           //each.getEmployeeInfo();
            System.out.println(each.name+" : "+each.salary);
        }

}

}
