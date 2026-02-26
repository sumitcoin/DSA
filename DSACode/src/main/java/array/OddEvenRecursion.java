package array;

public class OddEvenRecursion {
    public boolean isEven(int n) {
        if(n == 0) return true;
        if(n == 1) return false;
        return isEven(n-2);
    }

    public static void main(String[] args) {
        OddEvenRecursion oe = new OddEvenRecursion();
        System.out.println(oe.isEven(12));
    }

}
