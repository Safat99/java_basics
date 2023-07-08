package EmployeePackage;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e = new EmployeeBuilder().setUserName("safat").setAddress("mohammadpur").getEmployee();
        System.out.println(e);
    }
}
