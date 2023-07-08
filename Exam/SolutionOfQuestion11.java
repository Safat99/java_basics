package Exam;

import java.util.HashMap;
import java.util.Map;

public class SolutionOfQuestion11 {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String,Integer>();
        hm.put("safat", 1);
        hm.put("arafat", 2);
        hm.put("rafat", 3);
        hm.put("rifat", 4);

        System.out.println(hm);

        // getting the specific value of key safat
        System.out.println(hm.get("safat"));

    }
}
