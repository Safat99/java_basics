package EmployeePackage;
import SalaryPackage.Salary;

import java.time.LocalDate;

public class Employee {

    private String userName;
    private String email;
    private String address;
    private String gender;
    private String nid;
    private String designation;
    private LocalDate joiningDate;
    private Salary salary;

    public Employee(String userName, String email, String address, String gender, String nid, String designation, LocalDate joiningDate) {
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.nid = nid;
        this.designation = designation;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", nid='" + nid + '\'' +
                ", designation='" + designation + '\'' +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getNid() {
        return nid;
    }

    public String getDesignation() {
        return designation;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public double getSalary(int workingDays, int absentDays) {
        return salary.calculateSalary(workingDays, absentDays);
    }
}
