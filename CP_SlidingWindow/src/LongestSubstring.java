import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                // Update the start index to the next index after the previous occurrence of the character
                start = Math.max(start, map.get(c) + 1);
            }
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
            // Update the index of the character in the HashMap
            map.put(c, end);
        }

        return maxLength;


    }
}