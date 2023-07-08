package EmployeePackage;
import java.time.LocalDate;


public class EmployeeBuilder {


    private String userName;
    private String email;
    private String address;
    private String gender;
    private String nid;
    private String designation;
    private LocalDate joiningDate;
    public EmployeeBuilder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public EmployeeBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeBuilder setNid(String nid) {
        this.nid = nid;
        return this;
    }

    public EmployeeBuilder setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public EmployeeBuilder setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
        return this;
    }

    public Employee getEmployee() {
        return new Employee(userName, email, address, gender, nid, designation, joiningDate);
    }
}
