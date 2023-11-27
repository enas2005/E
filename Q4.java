public class Q4 {
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(num + " is even: " + isEven(num));
    }
}

