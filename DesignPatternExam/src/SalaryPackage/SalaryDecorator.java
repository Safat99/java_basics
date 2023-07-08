package SalaryPackage;

import EmployeePackage.Employee;

public class SalaryDecorator extends Employee {
    private Salary salary;

    public SalaryDecorator(Employee e, Salary s) {
        super(e.getUserName(),e.getEmail(),e.getAddress(),e.getGender(),e.getNid(), e.getDesignation(),
                e.getJoiningDate());
        this.salary = s;
    }

    // i will have to comment this two check whether the object can work with getSalary or not
    @Override
    public double getSalary(int workingDays, int absentDays) {
        return salary.calculateSalary(workingDays, absentDays);
    }


}
