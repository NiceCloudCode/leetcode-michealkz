package com.micheal.链表;

/**
 * 而消除一对相邻重复项可能会导致新的相邻重复项出现，如从字符串abba 中删除 bb 会导致出现新的相邻重复项aa 出现。
 * 因此我们需要保存当前还未被删除的字符。一种显而易见的数据结构呼之欲出：栈。
 * 我们只需要遍历该字符串，如果当前字符和栈顶字符相同，我们就贪心地将其消去，否则就将其入栈即可
 * <p>
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class _1047删除字符串中的所有相邻重复项 {
    public static String removeDuplicates(String S) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }

    public static void main(String[] args) {
        String s = "abbacabdcc";
        String result = removeDuplicates1(s);
        System.out.println(result);
    }

    public static String removeDuplicates1(String S) {
        StringBuffer stack = new StringBuffer();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (top >= 0 && stack.charAt(top) == ch) {
                stack.deleteCharAt(top);
                top--;
            } else {
                stack.append(ch);
                ++top;
            }
        }
        return stack.toString();
    }
}
