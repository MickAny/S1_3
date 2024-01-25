public class Employee implements Comparable<Employee>{

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String post;
    private String phoneNumber;
    private double salary;

    public Employee(String firstName, String middleName, String lastName, int age, String post, String phoneNumber, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "%s %s %s, %d years old, %s@mail.ru (%s), %.1f$ %s".
                formatted(firstName, middleName, lastName, age, post, phoneNumber, salary, this.getClass().getSimpleName());
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(age, o.getAge());
    }
}

//   Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.

