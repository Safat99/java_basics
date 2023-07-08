package SalaryPackage;

public class DesignationSalary implements Salary{
    private double monthlySalary;
    public DesignationSalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(int workingDays, int absentDays) {
        int presentDays = workingDays - absentDays;
        return (monthlySalary * presentDays) / workingDays;
    }
}
