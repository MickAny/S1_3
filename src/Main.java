import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Edvard", "Norton", "Smith", 25, "EdiSmith", "123", 250),
                new Employee("Julia", "Mary", "Vito", 29, "LadyOfYourDream", "619", 700),
                new Employee("Ivanov", "ivan", "Ivanovich", 18, "RedHot", "666", 100),
                new Employee("Mark", "Daniel", "Richer", 22, "wrongMail", "349", 1000),
                new Employee("Walter", "Mitchel", "Spring", 45, "BigBoss", "139", 5000))
        );


        Manager manager = new Manager("Fred", "Gabriel", "Titch", 33, "qqq", "111", 3000);
        employees.add(manager);
//        System.out.println("(Полный список без изменений)");
//        employees.forEach(System.out::println);
//        System.out.println("-".repeat(30));

        manager.alterStaffSalary(employees);
        System.out.println("(Список после изменения зп)");
        employees.forEach(System.out::println);
        System.out.println("-".repeat(30));

//        Collections.sort(employees);
//        System.out.println("(Список после сортировки по возрасту)");
//        employees.forEach(System.out::println);
    }
}
