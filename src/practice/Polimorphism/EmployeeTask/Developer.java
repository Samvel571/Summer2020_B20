package practice.Polimorphism.EmployeeTask;

public class Developer extends Employee {

    public Developer(String name, long id, double salary, char gender) {
        super(name, id, "Developer", salary, gender);
    }

    @Override
    public void work() {
        System.out.println(name+" is developing the application");
    }
}
