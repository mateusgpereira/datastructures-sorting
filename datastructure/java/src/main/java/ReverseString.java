public class ReverseString {

    public static String reverseString(String str) {
        if (str == null) {
            throw new RuntimeException("Invalid String input.");
        }

        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        String[] strArray = str.split("");
        StringBuilder reversedString = new StringBuilder();
        for (int i = strArray.length -1; i >= 0; i--) {
            reversedString.append(strArray[i]);
        }
        return reversedString.toString();
    }
}
