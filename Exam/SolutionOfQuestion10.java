package Exam;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SolutionOfQuestion10 {

    public static void main(String[] args){

        NavigableSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(10);
        ts.add(10);
        ts.add(20);

        System.out.println(ts);

        TreeSet<Integer> tts = new TreeSet<Integer>();
        tts = (TreeSet<Integer>) ts.headSet(7);

        System.out.println(tts);
    }
}
