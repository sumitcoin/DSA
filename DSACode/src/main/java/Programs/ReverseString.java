package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "This is Java Program by SUMITCOIN";

        str = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining());

        System.out.println(str);
    }
}
