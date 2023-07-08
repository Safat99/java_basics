import EmployeePackage.Employee;
import EmployeePackage.EmployeeBuilder;
import SalaryPackage.DesignationSalary;
import SalaryPackage.Salary;
import SalaryPackage.SalaryDecorator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello HR");
        System.out.println("""
                Choose to do the following operation:
                1. Add a new temp Employee
                2. See a employee
                3. Calculate salary of an Employee"""
        );
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("\nGreat you wanna do " + value);
        switch (value) {
            case 1:
                System.out.println("Adding a employee to the system. Give the necessary information:\n");

                System.out.println("EmployeeName:");
                Scanner scanner1 = new Scanner(System.in);
                String userName = scanner1.nextLine();
                System.out.println("Address:");
                String address = scanner1.nextLine();
                System.out.println("Designation:");
                String designation = scanner1.nextLine();

                Employee e = new EmployeeBuilder().setUserName(userName)
                        .setAddress(address)
                        .setJoiningDate(java.time.LocalDate.now())
                        .setDesignation(designation)
                        .getEmployee();
                System.out.println(e.toString());

                Salary s = new DesignationSalary(1000);

                SalaryDecorator sd = new SalaryDecorator(e, s);

                System.out.println(sd.getSalary(100,10));

                System.out.println(e.toString());

                break;

            case 2:
                System.out.println("The system is not connected to DB!! so no employee found!");
                break;

            case 3:
                System.out.println("Adding and salary calculation a employee to the system. Give the necessary information:\n");
                System.out.println("Designation");
                Scanner scanner2 = new Scanner(System.in);
                String designations = scanner2.nextLine();
                System.out.println("Working Days:");
                int workingDays = scanner2.nextInt();
                System.out.println("Absent Days:");
                int absentDays = scanner2.nextInt();

                int monthlySalary = 10000;
                Salary ds = new DesignationSalary(monthlySalary);
                double salary = ds.calculateSalary(workingDays,absentDays);
                System.out.println(salary);
                break;
        }

    }
}