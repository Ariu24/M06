package arxius_xml.exercici;
import java.io.Serializable;

public class Employee implements Serializable {
    int ideEmp;
    String name;
    String surname;
    int age;
    double height;
    String job;

    // Constructor
    public Employee(int ideEmp, String name, String surname, int age, double height, String job) {
        this.ideEmp = ideEmp;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.job = job;
    }

    // Getters
    public int getIdeEmp() {
        return ideEmp;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Employee [ideEmp=" + ideEmp + ", name=" + name + ", surname=" + surname +
               ", age=" + age + ", height=" + height + ", job=" + job + "]";
    }
}
