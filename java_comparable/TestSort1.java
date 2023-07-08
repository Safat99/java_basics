package java_comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "safat", 23));
        al.add(new Student(102, "rafat", 24));
        al.add(new Student(103, "arafat", 25));

        System.out.println(al);

        Collections.sort(al);
        for (Student st: al) {
            System.out.println(st.roll_no + " "  +st.name + " " + st.age);
        }

    }
}
