package Exam;

import java.util.HashSet;
import java.util.Set;

public class SolutionOfQuestion09 {

    public static void main(String[] args) {

        Set<String> object = new HashSet<String>();
        object.add("ram");
        object.add("sam");
        object.add("sam"); // set keeps the unique elements
        object.add("jodu");
        object.add("modhu");

        System.out.println(object);

        /* main answer of 9th question */
        for(String s: object) {
            System.out.println(s);
        }

    }
}
