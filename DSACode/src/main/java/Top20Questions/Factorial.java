package Top20Questions;

public class Factorial {
    static int fact(int n) {
        return (n == 0 || n == 1) ? 1 : n * fact(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
