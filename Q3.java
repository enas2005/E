public class Q3 {

    public static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }

    public static void main(String[] args) {
        long n = 12;
        long m = 3;

        boolean isMultiple = isMultiple(n, m);
        System.out.println(isMultiple);
    }
}

