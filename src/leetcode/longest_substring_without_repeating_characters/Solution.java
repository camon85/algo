package leetcode.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        int length = s.length();
        for (int right = 0; right < length; right++) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] inputs = {
                "abcabcbb",
                "bbbbb",
                "pwwkew",
                "dvdf"
        };
        for (String input : inputs) {
            System.out.println(solution.lengthOfLongestSubstring(input));
        }
    }
}
