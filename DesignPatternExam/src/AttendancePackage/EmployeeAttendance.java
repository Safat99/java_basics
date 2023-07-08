package AttendancePackage;

public class EmployeeAttendance implements Attendance{
    @Override
    public double totalAttendance(int workingDays, int absentDays) {
        int presentDays = workingDays - absentDays;
        return ((double)presentDays/workingDays) * 100;
    }
}
