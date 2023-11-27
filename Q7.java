public class Q7 {

    public static int sumOfSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfSquares(n);
        System.out.println("The sum of squares of positive integers less than or equal to " + n + " is: " + sum);
    }
}

