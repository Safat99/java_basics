package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        // declaration of Arraylist
        // default generics
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add(5);
        ar.add("safat");
        ar.add(5.5);
        ar.add(true);

        System.out.println(ar);

        // list with other collection
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30));

        System.out.println(numbers);
        
    }
}