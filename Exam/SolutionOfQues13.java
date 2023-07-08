package Exam;

import java.util.regex.Pattern;

public class SolutionOfQues13 {

    public static boolean validate(String givenWord) {
        boolean result;
        result = Pattern.matches("[A-Z][a-z]+", givenWord);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(validate("Safat"));
    }
}
