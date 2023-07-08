package java_comparable;

public class Student implements Comparable<Student> {
    int roll_no;
    String name;
    int age;

    Student(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        if (age == student.age)
            return 0;
        else if (age > student.age)
            return 1;
        else
            return -1;
    }
}
