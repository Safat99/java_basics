import java.util.regex.*;
public class RegexExample {

    public static void main(String[] args) {
        System.out.println(Pattern.matches("[Sa-z]{5}","Safat"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]+", "@arun32"));
        System.out.println(Pattern.matches("\\d?", ""));
    }
}
