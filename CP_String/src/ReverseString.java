public class ReverseString {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Trim any leading or trailing spaces and return the result
        return reversed.toString().trim();
    }
}
