package Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find word starting with a specific letter
public class CountStringStartingWithSpecificLetter {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Ajay","Shyam","Arjun","Ram","Arti","Sonu","Monu");

        List<String> filterStringList = strList.stream().filter(a -> a.startsWith("A")).collect(Collectors.toList());

        System.out.println("Filter String::"+filterStringList);
    }
}
