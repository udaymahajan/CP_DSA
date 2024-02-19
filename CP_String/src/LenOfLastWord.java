public class LenOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = s.length();
        int lastWordLength = 0;

        // Iterate from right to left to find the last word
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break; // Stop when encountering a space
            }
            lastWordLength++;
        }

        return lastWordLength;
    }
}
