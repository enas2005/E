public class Q9 {

    public static String removePunctuation(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                continue;
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "Let’s try, Mike!";
        String result = removePunctuation(s);
        System.out.println("Original string: " + s);
        System.out.println("Punctuation removed: " + result);
    }
}


