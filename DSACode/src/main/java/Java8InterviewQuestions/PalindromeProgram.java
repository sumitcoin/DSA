package Java8InterviewQuestions;

import java.util.stream.IntStream;

// Palindrome program using Java 8 streams
public class PalindromeProgram {

    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean isItPalindrome = IntStream.range(0, str.length()/2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i -1));

        if(isItPalindrome) {
            System.out.println(str+" Palindrome");
        } else {
            System.out.println(str+" Not a Palindrome");
        }
    }
}
