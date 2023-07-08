package Exam;

import java.util.LinkedList;
import java.util.List;

public class SolutionOfQuestion07_08 {
    // this class covers both 7 and 8 number questions

    public static void main(String[] args) {
        List<String> ll = new LinkedList<String>();
        ll.add(0, "Safat");
        ll.add(1, "Rifat");
        ll.add(2, "Arafat");

        // adding new element to the specific position --> like we want to insert at 1st index
        ll.add(1, "Humayun");
        System.out.println(ll);

        // removing a specific element from the linked list
        ll.remove("Arafat");
        System.out.println(ll);
    }
}
