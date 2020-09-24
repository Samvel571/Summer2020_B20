package practice.PersonTask;

public class Employee extends Person {


    long ID;
    String jobTitle;
    double salary;

    public Employee(String name, int age, char gender, long ID, String jobTitle, double salary) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender +
                "\nEmployee ID: " + ID + ", JobTitle: " + jobTitle + ", Salary: " + salary;
    }
}
