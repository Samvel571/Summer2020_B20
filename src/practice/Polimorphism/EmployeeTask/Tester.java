package practice.Polimorphism.EmployeeTask;

public class Tester extends Employee{


    public Tester(String name, long id, double salary, char gender) {
        super(name, id, "Tester", salary, gender);
    }


    @Override
    public void work() {
        System.out.println( name +" working on regression test");

    }



}
