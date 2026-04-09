package Top20Questions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "nioctimus";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }
}
