package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> empIds = new HashMap<String, Integer>();

        empIds.put("safat", 1);
        empIds.put("rifat", 2);
        empIds.put("rafat", 3);

        System.out.println(empIds);

        empIds.replace("rifat", 4);
        System.out.println(empIds);

        Boolean result = empIds.containsKey("safast");
        System.out.println(result);

    }

}
