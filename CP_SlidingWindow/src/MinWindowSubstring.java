public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        int[] sFreq = new int[128];
        int[] tFreq = new int[128];

        // Update tFreq with character counts from string t
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = t.length(); // Count of characters in t that are yet to be found

        while (right < s.length()) {
            char rightChar = s.charAt(right);

            // Update sFreq with the character at the right pointer
            sFreq[rightChar]++;

            // If the count of the character at the right pointer matches its count in t,
            // decrement the requiredChars count
            if (tFreq[rightChar] > 0 && sFreq[rightChar] <= tFreq[rightChar]) {
                requiredChars--;
            }

            // Shrink the window by moving the left pointer until the window is valid
            while (requiredChars == 0) {
                // Update the minimum window length and start index if needed
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);

                // Update sFreq after moving the left pointer
                sFreq[leftChar]--;

                // If the count of the character at the left pointer drops below its count in t,
                // increment the requiredChars count to indicate that we need to find this character again
                if (tFreq[leftChar] > 0 && sFreq[leftChar] < tFreq[leftChar]) {
                    requiredChars++;
                }

                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);

    }
}
