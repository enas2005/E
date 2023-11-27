public class Q5 {public static class SumOfPositiveIntegers {
    public static int sumUpToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Sum of positive integers up to " + num + " is: " + sumUpToN(num));
    }
}

}
