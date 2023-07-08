package Exam;

import java.util.ArrayList;
import java.util.List;

public class SolutionOfQuestion14 {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        list.add(18L);
        list.add(33L);
        list.add(12L);
        list.add(12L);

        for (Object x : list) {
            System.out.println(x);
        }
    }
}
