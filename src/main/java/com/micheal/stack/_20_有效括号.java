package com.micheal.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * leetcode第20 个题目 判断有效括号
 */
public class _20_有效括号 {
    private static HashMap<Character, Character> map = new HashMap<Character, Character>();

    static {
        // key - value
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                Character left = stack.pop();
                if (c != map.get(left)) return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                Character left = stack.pop();
                if (left == '(' && c != ')') return false;
                if (left == '{' && c != '}') return false;
                if (left == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        while (s.contains("{}")
                || s.contains("[]")
                || s.contains("()")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

}
