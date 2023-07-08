import java.util.Arrays;

public class IsAnagram {
    /**
    * Aagram: If two String contains the same character without mainitaining the order,
    * they are called Anagram.
    */
    private static boolean checkAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] c = a.toLowerCase().toCharArray();
        char[] d = b.toLowerCase().toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        // System.out.println(c);
        // System.out.println(d);

        if (Arrays.equals(c,d)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "Amma";
        String b = "Mama";

        boolean result = checkAnagram(a,b);
        System.out.println(result);
    }
}