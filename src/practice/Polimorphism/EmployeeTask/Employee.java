package practice.Polimorphism.EmployeeTask;

public abstract class Employee {

    String  name;
    long id;
    String jobTitle;
    double salary;
    char gender;

    public Employee(String name, long id, String jobTitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public abstract void work();

    @Override
    public String toString() {

        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
