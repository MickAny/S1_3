import java.util.List;
import java.util.Scanner;

public class Manager extends Employee{
    Scanner sc = new Scanner(System.in);
    public Manager(String firstName, String middleName, String lastName, int age, String post, String phoneNumber, double salary) {
        super(firstName, middleName, lastName, age, post, phoneNumber, salary);
    }
    public void alterStaffSalary(List<Employee> list){
        System.out.println("Вы хотите изменить зп у всех сразу(1) или у каждого отдельно(2)? ->");
        switch (sc.nextLine()){
            case "1" ->{
                System.out.println("Введите надбавку: ");
                double gain = sc.nextDouble();
                for (Employee emp: list) {
                    alterEveryoneSalary(emp, gain);
                }
            }
            case "2" ->{
                for (Employee emp: list) {
                    if(emp.getClass().getSimpleName().equalsIgnoreCase("employee")){
                        alterAnEmployeeSalary(emp);
                    }
            }
        }
            default -> System.out.println("Введена неверная команда!");

        }
    }

    private void alterAnEmployeeSalary(Employee emp){

        System.out.printf("Введите новую зп для сотрудника %s (текущая зп %.1f): "
                .formatted(emp.getFirstName(), emp.getSalary()));

        int gain = sc.nextInt();
        double currentSalary = emp.getSalary() + gain;
        emp.setSalary(currentSalary);
    }
    private void alterEveryoneSalary(Employee emp, double gain){
        double currentSalary = emp.getSalary() + gain;
        emp.setSalary(currentSalary);
    }


}
