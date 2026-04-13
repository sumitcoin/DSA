package Java8InterviewQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// How do you find frequency of each character in a string using Java 8 streams?
public class CountCharacter {
    public static void main(String[] args) {
        String str = "Hello I am Sumit Singh, How are yoy?";

        Map<Character, Long> charCount = str.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);
    }
}
