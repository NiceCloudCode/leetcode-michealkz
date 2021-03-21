package com.micheal.hash;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 遍历字符串，每次以 i 值记录，不回溯 i 值，用flag记录遍历过程找到的重复的字符的位置。如果遇到重复字符，i-flag 即为子串长度，此时flag重新定位到子串中重复字符的位置，i 继续往后遍历
 *
 * 作者：VioletKiss
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/javati-jie-3wu-zhong-fu-zi-fu-de-zui-chang-zi-chua/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * 思路：遍历字符串，定义max记录无重复的串的长度，left记录串的最左边，当有重复的字符出现时候，将left调整为重复字符所在的位置
 *      max = i - left + 1
 */
public class _003无重复字符的最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // 记录最大长度
        int max = 0;
        // 记录最左边位置
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                // map.get(ch) 重复字符串的已经存在的位置，
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abccbdch";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
