public class Q8 {


        public static int countVowels(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String str = "Hello, world!";
            int count = countVowels(str);
            System.out.println("The number of vowels in the string \"" + str + "\" is: " + count);
        }
    }
