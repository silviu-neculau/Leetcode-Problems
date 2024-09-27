package com.leetcode.problems;

// https://leetcode.com/problems/valid-anagram/

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println((isAnagram("anam", "mana")));
    }

    public static boolean isAnagram(String s, String t) {
        char sCharacters[] = s.toCharArray();
        char tCharacters[] = t.toCharArray();

        Arrays.sort(sCharacters);
        Arrays.sort(tCharacters);

        if (Arrays.equals(sCharacters, tCharacters)) {
            return true;
        } else {
            return false;
        }
    }
}