package Java8InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
public class JoinStringWithPrefix {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String joiningString = listOfString.stream().collect(Collectors.joining(", ","[", "]"));
        System.out.println(joiningString);

        System.out.println(listOfString.toString());
    }
}
