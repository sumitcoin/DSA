package Programs;

import java.util.Arrays;
import java.util.List;

// Finding Last Element of Array Using Java 8
public class LastElementOfAnArray {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Apple", "Ball", "Cat", "Dog", "Ent", "Fan", "Gun");

        String str = listOfString.stream().skip(listOfString.size()-1).findFirst().get();

        System.out.println(str);
    }
}
