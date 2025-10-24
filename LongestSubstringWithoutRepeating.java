class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        boolean[] seen = new boolean[256]; // ASCII chars

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (seen[c]) {
                seen[s.charAt(left)] = false;
                left++;
            }
            seen[c] = true;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
