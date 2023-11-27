public class Q6{


    public static int sumOfOddPositiveIntegers(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        int sum = 0;
        for (int i = 1; i <= n; i += 2) { // Increment by 2 to consider only odd numbers
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 5; // Input integer
        int sum = sumOfOddPositiveIntegers(n);
        System.out.println("The sum of odd positive integers less than or equal to " + n + " is: " + sum);
    }
}
