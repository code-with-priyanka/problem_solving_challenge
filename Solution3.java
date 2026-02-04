import java.util.HashSet;

class Solution3 {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Remove duplicates
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution3 obj = new Solution3();

        String s = "abcabcbb";

        int result = obj.lengthOfLongestSubstring(s);

        System.out.println("Output: " + result);
    }
}
