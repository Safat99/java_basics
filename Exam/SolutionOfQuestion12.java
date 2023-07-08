package Exam;

import java.util.regex.Pattern;

public class SolutionOfQuestion12 {

    public static boolean validate(String givenWord) {
        return Pattern.matches("[^g].+g.+[^g]", givenWord);
    }

    public static void main(String[] args) {
        System.out.println(validate("banlas"));
    }
}
