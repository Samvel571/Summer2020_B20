package practice.PersonTask;

public class Person {

    String name;
    int age;
    char gender;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String toString() {
        return
                "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
