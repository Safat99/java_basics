package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {
    
    public static void main(String[] args) {
        
        ArrayList<String> studentList = new ArrayList<String>();

        studentList.add("Tom");
        studentList.add("Jony");
        studentList.add("Rony");
        studentList.add("Kabir");

        System.out.println(studentList.size());
        
        // getting values from ArrayList using for
        System.out.println("--------");
        for (int i=0; i<studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        // getting values from ArrayList using for-each
        System.out.println("--------");
        for (String s: studentList) {
            System.out.println(s);
        }

        // getting values from ArrayList using stream-for
        System.out.println("--------");
        studentList.stream().forEach(element -> System.out.println(element));

        //iterator:
        System.out.println("--------");
        Iterator<String> it = studentList.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}