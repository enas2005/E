import java.util.Scanner;
public class Q1 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a byte:");
            byte aByte = scanner.nextByte();
            System.out.println("You entered: " + aByte);

            System.out.println("Enter a short:");
            short aShort = scanner.nextShort();
            System.out.println("You entered: " + aShort);

            System.out.println("Enter an int:");
            int anInt = scanner.nextInt();
            System.out.println("You entered: " + anInt);

            System.out.println("Enter a long:");
            long aLong = scanner.nextLong();
            System.out.println("You entered: " + aLong);

            System.out.println("Enter a float:");
            float aFloat = scanner.nextFloat();
            System.out.println("You entered: " + aFloat);

            System.out.println("Enter a double:");
            double aDouble = scanner.nextDouble();
            System.out.println("You entered: " + aDouble);

            System.out.println("Enter a boolean:");
            boolean aBoolean = scanner.nextBoolean();
            System.out.println("You entered: " + aBoolean);

            System.out.println("Enter a char:");
            char aChar = scanner.next().charAt(0);
            System.out.println("You entered: " + aChar);
        }
    }

