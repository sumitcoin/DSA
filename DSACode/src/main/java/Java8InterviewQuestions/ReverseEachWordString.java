package Java8InterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

// Reverse each word of a string using Java 8 streams?
public class ReverseEachWordString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String reversedStr = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedStr);

        reversedStr = Arrays.stream(reversedStr.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedStr);
    }
}
