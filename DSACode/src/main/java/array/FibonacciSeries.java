package array;

public class FibonacciSeries {
    static int fib(int n, int[] dp) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    }

    public static void main(String[] args) {

        int n = 10;
        int[] dp = new int[n+1];
        java.util.Arrays.fill(dp, -1);
        System.out.println("Fibonacci(" + n + "): " + fib(n, dp));
    }
}
