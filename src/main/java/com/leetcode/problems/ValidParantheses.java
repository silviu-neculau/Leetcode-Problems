package com.leetcode.problems;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParantheses {

    public static void main(String[] args) {
        System.out.println((isValid("{}{}{}")));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
